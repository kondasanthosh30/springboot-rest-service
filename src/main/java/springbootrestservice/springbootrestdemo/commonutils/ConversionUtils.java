package springbootrestservice.springbootrestdemo.commonutils;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ConversionUtils 
{

	
	
	public static void objecttoXML(Object obj) throws JAXBException
	{
		String sr=obj.toString();
		StringReader reader=new StringReader(sr);
		JAXBContext jaxb;
		jaxb=JAXBContext.newInstance(sr);
		Marshaller mars=jaxb.createMarshaller();
		//mars.marshal(obj,reader);
		
	}
	
	public static void xmltoObject() throws JAXBException
	{
		
		StringReader sr = null;
		JAXBContext jaxb;
		jaxb=JAXBContext.newInstance();
		Unmarshaller marshler=jaxb.createUnmarshaller();
		marshler.unmarshal(sr);
		
	}
	
	
	
}
