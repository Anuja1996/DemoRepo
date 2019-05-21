package jbk;

import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class mysaxHandler extends DefaultHandler {
	
	public void startDocument()
	{
		System.out.println("documents begins here");
		
	}
	
	public void startElement(String uri,String localname,String qName,Attributes atters)
	{
		System.out.println("<"+qName+">");
		
	}
	
	public void characters(char ch[],int start,int len)
	{
		System.out.println(new String(ch,start,len));
		
	}
	
	public void endElement(String uri,String localName,String qName)
	{
		System.out.println("</"+qName+">");
	}
	
	public void endDocument()
	{
		System.out.println("document ends here");
	}
	
	public static void main(String[] args) throws Exception 
	{
		SAXParser p=SAXParserFactory.newInstance().newSAXParser();
		p.parse(new FileInputStream("student.xml"),new mysaxHandler() );
	}

	
}
