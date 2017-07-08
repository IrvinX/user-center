package com.footprint.common.config.mybatis;

import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sunb-c on 2016/6/7.
 */
public class MybatisGenetorUtils {

    private static Map<String, Element> _map = new HashMap<>(2);

    static Map<String, Element> findElements(Element element, String s) {

        if(element instanceof XmlElement){
            _map.put("parent", element);


            List<Element> lst = ((XmlElement) element).getElements();

            for(Element ele : lst){
                Map<String, Element> m =  findElements(ele, s);

                if(m != null){
                    return m;
                }
            }

        } else {

            TextElement te = (TextElement) element;

            if(te.getContent().trim().contains(s)){
                _map.put("child",te);

                return _map;
            }
        }

        return null;
    }

    /**
     * @param element        遍历的根元素
     * @param findString     定位字符串 （包含的话，定位成功）
     * @param replacedString 替换被定位的TextElment元素的值
     * @return 被定位的Element
     */
    protected static Element replaceContent(XmlElement element, String findString, String replacedString) {

        Map<String, Element> elmentPair = findElements(element, findString);

        if (elmentPair != null) {

            XmlElement parent = (XmlElement) elmentPair.get("parent");
            TextElement child = (TextElement) elmentPair.get("child");
            List<Element> elements = parent.getElements();
            int index = elements.indexOf(child);
            if (index == -1) return null;

            elements.remove(index);
            String oldString = child.getContent();

            String newString = replacedString;
            if(oldString.trim().endsWith(",") && !replacedString.endsWith(",")){
                newString = replacedString + ",";
            }

            if(parent.getName().equals("if") && parent.getAttributes().size() == 1){

                Attribute at = parent.getAttributes().get(0);
                Attribute newAt = new Attribute(at.getName()," 0 == 0");

                parent.getAttributes().remove(0);
                parent.getAttributes().add(newAt);
            }

            Element textE = new TextElement(newString);
            elements.add(index,textE);
            return textE;
        }

        return null;
    }
}
