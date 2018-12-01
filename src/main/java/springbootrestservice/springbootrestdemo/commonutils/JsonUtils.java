package springbootrestservice.springbootrestdemo.commonutils;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonUtils 
{

	private JsonUtils()
	{
		
	}
	
	public static <T> T convertJsonToObject(String jsonstr,Class<T> returnType)
	{
		T retVal=null;
		if(StringUtils.isNotBlank(jsonstr))
		{
			ObjectMapper jsonConvertor=new ObjectMapper();
			jsonConvertor.configure(SerializationFeature.INDENT_OUTPUT,true);
			jsonConvertor.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,false);
			try 
			{
				retVal=jsonConvertor.readValue(jsonstr,returnType);
				
			}
			catch(JsonProcessingException je)
			{
				
			}
			catch(IOException ie)
			{
				
			}
		}
		return retVal;
	}
	
	
	public static String convertObjecttoJson(Object object)
	{
	
		String jsonString=StringUtils.EMPTY;
		if(object!=null)
		{
			
			ObjectMapper jsonConvertor=new ObjectMapper();
			jsonConvertor.configure(SerializationFeature.INDENT_OUTPUT,true);
			jsonConvertor.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,false);
		
		try 
		{
		jsonString =jsonConvertor.writeValueAsString(object);
		}
		catch(JsonProcessingException je)
		{
		//logger	
		}
		
		
	}
		return jsonString;
	}

}

