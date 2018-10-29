/*package xsl.demo;

import java.io.File;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;import javax.xml.transform.TransformerFactory;
import javax.xml.transform.URIResolver;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XslTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Source xmlInput= new StreamSource(new File("src/main/resources/samples/input.xml"));
		Source xsl=new StreamSource(new File("src/main/resources/basic.xsl"));
		Result result=new StreamResult(new File("src/main/resources/output.xml"));
		
		TransformerFactory tf=TransformerFactory.newInstance();	
		Transformer trans;
		try 
		{
			trans=tf.newTransformer(xsl);
			trans.transform(xmlInput, result);
		}
		catch(Exception e)
		{
			
		}
	}

}
*/