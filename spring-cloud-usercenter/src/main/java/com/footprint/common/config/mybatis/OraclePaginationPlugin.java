package com.footprint.common.config.mybatis;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.OutputUtilities;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.config.GeneratedKey;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Oracle 分页生成插件。
 *
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.0.0, May 31, 2012
 */
public class OraclePaginationPlugin extends PluginAdapter {

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,
                                              IntrospectedTable introspectedTable) {
        // add field, getter, setter for limit clause
        addPage(topLevelClass, introspectedTable, "page");
        return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        XmlElement parentElement = document.getRootElement();

        // 产生分页语句前半部分
        XmlElement paginationPrefixElement = new XmlElement("sql");
        paginationPrefixElement.addAttribute(new Attribute("id", "OracleDialectPrefix"));
        XmlElement pageStart = new XmlElement("if");
        pageStart.addAttribute(new Attribute("test", "page != null"));
        pageStart.addElement(new TextElement(
                "select * from ( select row_.*, rownum rownum_ from ( "));
        paginationPrefixElement.addElement(pageStart);
        parentElement.addElement(paginationPrefixElement);

        // 产生分页语句后半部分
        XmlElement paginationSuffixElement = new XmlElement("sql");
        paginationSuffixElement.addAttribute(new Attribute("id", "OracleDialectSuffix"));
        XmlElement pageEnd = new XmlElement("if");
        pageEnd.addAttribute(new Attribute("test", "page != null"));
        pageEnd
                .addElement(new TextElement(
                        "<![CDATA[ ) row_  where rownum <= #{page.end} ) where rownum_ > #{page.begin}  ]]>"));
        paginationSuffixElement.addElement(pageEnd);
        parentElement.addElement(paginationSuffixElement);

        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element,
                                                                     IntrospectedTable introspectedTable) {

        XmlElement pageStart = new XmlElement("include"); //$NON-NLS-1$   
        pageStart.addAttribute(new Attribute("refid", "OracleDialectPrefix"));
        element.getElements().add(0, pageStart);

        XmlElement isNotNullElement = new XmlElement("include"); //$NON-NLS-1$   
        isNotNullElement.addAttribute(new Attribute("refid", "OracleDialectSuffix"));
        element.getElements().add(isNotNullElement);

        return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element, introspectedTable);
    }

    /**
     * @param topLevelClass
     * @param introspectedTable
     * @param name
     */
    private void addPage(TopLevelClass topLevelClass, IntrospectedTable introspectedTable,
                         String name) {
        String pageClassPath = "com.footprint.common.config.mybatis.Page";
        topLevelClass.addImportedType(new FullyQualifiedJavaType(pageClassPath));
        CommentGenerator commentGenerator = context.getCommentGenerator();
        Field field = new Field();
        field.setVisibility(JavaVisibility.PROTECTED);
        field.setType(new FullyQualifiedJavaType(pageClassPath));
        field.setName(name);
        commentGenerator.addFieldComment(field, introspectedTable);
        topLevelClass.addField(field);
        char c = name.charAt(0);
        String camel = Character.toUpperCase(c) + name.substring(1);
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setName("set" + camel);
        method.addParameter(new Parameter(new FullyQualifiedJavaType(pageClassPath), name));
        method.addBodyLine("this." + name + "=" + name + ";");
        commentGenerator.addGeneralMethodComment(method, introspectedTable);
        topLevelClass.addMethod(method);
        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType(pageClassPath));
        method.setName("get" + camel);
        method.addBodyLine("return " + name + ";");
        commentGenerator.addGeneralMethodComment(method, introspectedTable);
        topLevelClass.addMethod(method);
    }

    /**
     * This plugin is always valid - no properties are required
     */
    public boolean validate(List<String> warnings) {
        return true;
    }
    
    @Override
    public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(XmlElement answer,
            IntrospectedTable introspectedTable) {
    	 answer.getElements().clear();
    	 
         StringBuilder sb = new StringBuilder();
         sb.append("update "); //$NON-NLS-1$
         sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
         answer.addElement(new TextElement(sb.toString()));

         // set up for first column
         sb.setLength(0);
         sb.append("set "); //$NON-NLS-1$

         Iterator<IntrospectedColumn> iter = introspectedTable.getNonPrimaryKeyColumns().iterator();
         boolean isFirst = true;

         while (iter.hasNext()) {
             IntrospectedColumn introspectedColumn = iter.next();
             
             String colName = MyBatis3FormattingUtilities
                     .getEscapedColumnName(introspectedColumn);
             if(colName.equalsIgnoreCase("VERID")){
            	 if(!isFirst){
            		 sb.append(',');
            	 }else{
            		 isFirst = false;
            	 }
            	 sb.append("VERID = NVL(VERID , 0) + 1");
             }else if(colName.equalsIgnoreCase("CREATETIME")){
            	 continue;
             }else if(colName.equalsIgnoreCase("UPDATETIME")){
            	 if(!isFirst){
            		 sb.append(',');
            	 }else{
            		 isFirst = false;
            	 }
            	 sb.append("UPDATETIME = CURRENT_TIMESTAMP");
             }else if(colName.equalsIgnoreCase("CREATEUSER")){
            	 continue;
             }else{
            	 if(!isFirst){
            		 sb.append(',');
            	 }else{
            		 isFirst = false;
            	 }
            	 sb.append(MyBatis3FormattingUtilities
                         .getEscapedColumnName(introspectedColumn));
                 sb.append(" = "); //$NON-NLS-1$
                 sb.append(MyBatis3FormattingUtilities
                         .getParameterClause(introspectedColumn));
             }

             answer.addElement(new TextElement(sb.toString()));

             // set up for the next column
             if (iter.hasNext()) {
                 sb.setLength(0);
                 OutputUtilities.xmlIndent(sb, 1);
             }
         }

         boolean and = false;
         for (IntrospectedColumn introspectedColumn : introspectedTable
                 .getPrimaryKeyColumns()) {
             sb.setLength(0);
             if (and) {
                 sb.append("  and "); //$NON-NLS-1$
             } else {
                 sb.append("where "); //$NON-NLS-1$
                 and = true;
             }

             sb.append(MyBatis3FormattingUtilities
                     .getEscapedColumnName(introspectedColumn));
             sb.append(" = "); //$NON-NLS-1$
             sb.append(MyBatis3FormattingUtilities
                     .getParameterClause(introspectedColumn));
             answer.addElement(new TextElement(sb.toString()));
         }
         return true;
    }
    
    @Override
    public boolean sqlMapInsertElementGenerated(XmlElement answer,
            IntrospectedTable introspectedTable) {

    	answer.getElements().clear();
    	
        GeneratedKey gk = introspectedTable.getGeneratedKey();
        if (gk != null) {
            IntrospectedColumn introspectedColumn = introspectedTable
                    .getColumn(gk.getColumn());
            // if the column is null, then it's a configuration error. The
            // warning has already been reported
            if (introspectedColumn != null) {
                if (gk.isJdbcStandard()) {

                } else {
                    answer.addElement(getSelectKey(introspectedColumn, gk));
                }
            }
        }

        StringBuilder insertClause = new StringBuilder();
        StringBuilder valuesClause = new StringBuilder();

        insertClause.append("insert into "); //$NON-NLS-1$
        insertClause.append(introspectedTable
                .getFullyQualifiedTableNameAtRuntime());
        insertClause.append(" ("); //$NON-NLS-1$

        valuesClause.append("values ("); //$NON-NLS-1$

        List<String> valuesClauses = new ArrayList<String>();
        Iterator<IntrospectedColumn> iter = introspectedTable.getAllColumns()
                .iterator();
        while (iter.hasNext()) {
            IntrospectedColumn introspectedColumn = iter.next();
            if (introspectedColumn.isIdentity()) {
                // cannot set values on identity fields
                continue;
            }
            
            String colName = MyBatis3FormattingUtilities
                    .getEscapedColumnName(introspectedColumn);
            if(colName.equalsIgnoreCase("VERID")){
            	insertClause.append(MyBatis3FormattingUtilities
                        .getEscapedColumnName(introspectedColumn));
                valuesClause.append("0");
            }else if(colName.equalsIgnoreCase("CREATETIME")){
            	insertClause.append(MyBatis3FormattingUtilities
                        .getEscapedColumnName(introspectedColumn));
                valuesClause.append("CURRENT_TIMESTAMP");
            }else if(colName.equalsIgnoreCase("UPDATETIME")){
            	insertClause.append(MyBatis3FormattingUtilities
                        .getEscapedColumnName(introspectedColumn));
                valuesClause.append("CURRENT_TIMESTAMP");
            }else{
            	insertClause.append(MyBatis3FormattingUtilities
                        .getEscapedColumnName(introspectedColumn));
                valuesClause.append(MyBatis3FormattingUtilities
                        .getParameterClause(introspectedColumn));
            }

            
            if (iter.hasNext()) {
                insertClause.append(", "); //$NON-NLS-1$
                valuesClause.append(", "); //$NON-NLS-1$
            }

            if (valuesClause.length() > 80) {
                answer.addElement(new TextElement(insertClause.toString()));
                insertClause.setLength(0);
                OutputUtilities.xmlIndent(insertClause, 1);

                valuesClauses.add(valuesClause.toString());
                valuesClause.setLength(0);
                OutputUtilities.xmlIndent(valuesClause, 1);
            }
        }

        insertClause.append(')');
        answer.addElement(new TextElement(insertClause.toString()));

        valuesClause.append(')');
        valuesClauses.add(valuesClause.toString());

        for (String clause : valuesClauses) {
            answer.addElement(new TextElement(clause));
        }
    
        return true;
    }
    
    /**
     * This method should return an XmlElement for the select key used to
     * automatically generate keys.
     * 
     * @param introspectedColumn
     *            the column related to the select key statement
     * @param generatedKey
     *            the generated key for the current table
     * @return the selectKey element
     */
    protected XmlElement getSelectKey(IntrospectedColumn introspectedColumn,
            GeneratedKey generatedKey) {
        String identityColumnType = introspectedColumn
                .getFullyQualifiedJavaType().getFullyQualifiedName();

        XmlElement answer = new XmlElement("selectKey"); //$NON-NLS-1$
        answer.addAttribute(new Attribute("resultType", identityColumnType)); //$NON-NLS-1$
        answer.addAttribute(new Attribute(
                "keyProperty", introspectedColumn.getJavaProperty())); //$NON-NLS-1$
        answer.addAttribute(new Attribute("order", //$NON-NLS-1$
                generatedKey.getMyBatis3Order())); 
        
        answer.addElement(new TextElement(generatedKey
                        .getRuntimeSqlStatement()));

        return answer;
    }
}