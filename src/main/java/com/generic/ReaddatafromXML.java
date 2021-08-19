package com.generic;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class ReaddatafromXML {
 
	/**
	 * @author Dell
	 * this method is going to 
	 * @param key
	 * @return
	 * @throws FileNotFoundException
	 * @throws DocumentException
	 */
	public String readdata_XML(String key) throws FileNotFoundException, DocumentException
	{
		FileReader fileinput=new FileReader("../SDET/src/test/resources/readxml.xml");
		SAXReader reader=new SAXReader();
		Document doc = reader.read(fileinput);
		String value =doc.selectSingleNode(key).getText();
		return value;
	}
}
