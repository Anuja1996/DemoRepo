package jbk;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXmlUsingDom {

	//Con
	public static void main(String[] args) throws Exception{
		try{
	    File fxml=new File("XmlDoc.xml");
		DocumentBuilderFactory dbfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder b=dbfactory.newDocumentBuilder();
		Document doc=b.parse(fxml);

		System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
		NodeList nList=doc.getElementsByTagName("students");
		System.out.println("-------" + nList.getLength());// legnth will calculate no of elements of xml file to print
		for(int temp=0;temp<nList.getLength();temp++)
		{
			Node nNode=nList.item(temp);

			System.out.println("\nCurrent Element:" +nNode.getNodeName());

			if(nNode.getNodeType()==Node.ELEMENT_NODE){
				Element eElement=(Element) nNode;

				System.out.println("name:" + eElement.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("email:" + eElement.getElementsByTagName("email").item(0).getTextContent());
				System.out.println("mobile:" + eElement.getElementsByTagName("mobile").item(0).getTextContent());
				System.out.println("address:" + eElement.getElementsByTagName("address").item(0).getTextContent());

			}
		}

	}catch(Exception e){
		e.printStackTrace();

}
	}
}

