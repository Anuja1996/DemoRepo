package jbk;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XmlDom{
public static void main(String[] args) throws Exception{
	DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
	DocumentBuilder b=f.newDocumentBuilder();
	Document doc=b.newDocument();
	
	//to create tags in xml file
	Element rootelement=doc.createElement("students");
	Element studentelement=doc.createElement("student");
	Element nameelement=doc.createElement("name");
	Element emailelement=doc.createElement("email");
	Element mobileelement=doc.createElement("mobile");
	Element addresselement=doc.createElement("address");
	
	//to enter data in between above tags
	Text t1=doc.createTextNode("Priyanka");
	Text t2=doc.createTextNode("priyanka@gmail.com");
	Text t3=doc.createTextNode("123456");
	Text t4=doc.createTextNode("pune");
	
	//to connet tag and data
	nameelement.appendChild(t1);
	emailelement.appendChild(t2);
	mobileelement.appendChild(t3);
	addresselement.appendChild(t4);
	 
	//to enter above tags with data in subroot tag
	studentelement.appendChild(nameelement);
	studentelement.appendChild(emailelement);
	studentelement.appendChild(mobileelement);
	studentelement.appendChild(addresselement);
	
	//to enter above suroot tag in root tag
	rootelement.appendChild(studentelement);
	
	//to store above root tag in doc file
	doc.appendChild(rootelement);
	
	//to transfor data with tags in .xml file
	Transformer t=TransformerFactory.newInstance().newTransformer();
	t.transform(new DOMSource(doc),new StreamResult(new FileOutputStream("student.xml")));
	System.out.println("xml file genrated");
	
	
	
	
	
}
}
