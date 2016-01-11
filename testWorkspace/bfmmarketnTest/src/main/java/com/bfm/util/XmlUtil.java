package com.bfm.util;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

@SuppressWarnings("restriction")
public class XmlUtil {
	public static Object xmlTobean(String path,String classPath){
		Object obj = null;
		Class<?> obClass = null;
		try {
			obClass = Class.forName(classPath);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {  
            File file = new File(path);
			JAXBContext context = JAXBContext.newInstance(obClass);  
            Unmarshaller unmarshaller = context.createUnmarshaller();  
            obj = unmarshaller.unmarshal(file);  
            System.out.println(obj);
        } catch (JAXBException e) {  
            e.printStackTrace();  
        } 
		return obj;
	}
	
	public static Document load(String path){
		org.jdom.Document document=null;  
	    try {  
             SAXBuilder reader = new SAXBuilder();   
             document=reader.build(new File(path));  
        } catch (Exception e) {  
             e.printStackTrace();  
        }  
         return document;  
     }  
     
	public static String XmlToString(String path){  
		org.jdom.Document document=null;  
		document=load(path);  
		   
		Format format =Format.getPrettyFormat();      
		format.setEncoding("UTF-8");//设置编码格式   
		   
		StringWriter out=null; //输出对象  
		String sReturn =""; //输出字符串  
		XMLOutputter outputter =new XMLOutputter();   
		out=new StringWriter();   
		try {
			outputter.output(document,out);  
		} catch (IOException e) {  
		       e.printStackTrace();  
		}
		sReturn=out.toString();
		return sReturn;  
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List parser3Xml(String fileName) {
        File inputXml = new File(fileName);    
        List list=new ArrayList();                
        SAXReader saxReader = new SAXReader();
        try {
            Document document = (Document) saxReader.read(inputXml);
            Element employees = (Element) document.getRootElement();
            for (Iterator i = employees.elementIterator(); i.hasNext();) {
                Element employee = (Element) i.next();
                Map map = new HashMap();
                Map tempMap = new HashMap();
                for (Iterator j = employee.elementIterator(); j.hasNext();) {
                    Element node = (Element) j.next();                    
                    tempMap.put(node.getName(), node.getText());                    
                }
                map.put(employee.getName(), tempMap);
                list.add(map);
            }
        } catch (DocumentException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }  
}
