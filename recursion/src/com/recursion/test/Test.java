package com.recursion.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {


		 File file = new File("src/menu.xml");
		 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = factory.newDocumentBuilder();
         Document document  = builder.parse(file);
         document.getDocumentElement().normalize();
         NodeList list = document.getElementsByTagName("root");
         System.out.println(Test.addRec(3));
 
		  
	}

	public static int addRec(int num) {
		
		if (num == 0) {
			return num ;
		}
		return  num+(num-1);
		
		
	}
}



