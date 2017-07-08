package com.footprint.common.config.mybatis;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by sunb-c on 2016/6/7.
 */
public class OracleUpdatePlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	public boolean sqlMapUpdateByExampleSelectiveElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {

		replaceStrings(element);

		return super.sqlMapUpdateByExampleSelectiveElementGenerated(element, introspectedTable);
	}

	public boolean sqlMapUpdateByExampleWithBLOBsElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		replaceStrings(element);
		return super.sqlMapUpdateByExampleWithBLOBsElementGenerated(element, introspectedTable);
	}

	private void replaceStrings(XmlElement element) {
		Set<Map.Entry<String, String>> set = replacePattern.entrySet();

		for (Map.Entry<String, String> entry : set) {
			// entry.getKey();

			MybatisGenetorUtils.replaceContent(element, entry.getKey(), entry.getValue());
		}
	}

	public boolean sqlMapUpdateByExampleWithoutBLOBsElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		replaceStrings(element);
		return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element, introspectedTable);
	}

	public boolean sqlMapUpdateByPrimaryKeySelectiveElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		replaceStrings(element);
		return super.sqlMapUpdateByPrimaryKeySelectiveElementGenerated(element, introspectedTable);
	}

	public boolean sqlMapUpdateByPrimaryKeyWithBLOBsElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {

		replaceStrings(element);
		return super.sqlMapUpdateByPrimaryKeyWithBLOBsElementGenerated(element, introspectedTable);
	}

	// public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(
	// XmlElement element, IntrospectedTable introspectedTable) {
	// replaceStrings(element);
	// return
	// super.sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(element,
	// introspectedTable);
	// }

	private static Map<String, String> replacePattern = new HashMap<>(5);
	{
		replacePattern.put("VERID =", "VERID = NVL(VERID , 0) + 1");
		replacePattern.put("UPDATETIME =", "UPDATETIME = CURRENT_TIMESTAMP");
	}

}
