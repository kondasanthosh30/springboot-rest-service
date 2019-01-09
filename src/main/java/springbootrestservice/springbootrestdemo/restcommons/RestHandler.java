/*package springbootrestservice.springbootrestdemo.restcommons;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

public class RestHandler 
{
	
	public void processRequest(EndPointTEO teo)
	{
		RestTemplate restTemaplet=new RestTemplate();
		RequestEntity<?> restEntity=null;
		
		String uri=teo.getUri();
		HttpEntity<?> httpEntity=new HttpEntity<Object>(teo.getRequestObj(),getHeaders(teo));
		setProxy();
		teo.setHttpStatusCode(HttpStatus.OK);
		
		try 
		{
			restEntity=restTemaplet.exchange(uri,HttpMethod.POST,httpEntity,String.class);
			
		}
		catch(HttpStatusCodeException e)
		{
			
		}
		catch(Exception e)
		{
			
		}
		if(null !=restEntity && restEntity.hasBody())
		{
			teo.setResponse((String)restEntity.getBody());
			teo.setHttpStatusCode(HttpStatus.OK);

		}
	}

	
	
	public HttpHeaders getHttpHeaders(EndPointTEO end)
	{
		HttpHeaders headers= new HttpHeaders();
		if(StringUtils.hasText(end.getReturnType))
		{
			headers.set("Accept",end.getContentType().toString());
		}
		else
		{
			headers.set("Content-Type",MediaType.APPLICATION_JSON_VALUE);
		}
		
		if(end.getHeaderNameSpace().size()>0)
		{
			for(Map.Entry<String ,String> entry:end.getHeaderContent().entrySet())
			{
				headers.set(entry.getKey(),entry.getValue());
			}
		}
		return headers;
	}
	
	public void setProxy()
	{
		System.setProperty("proxySet","true");
		
		System.setProperty("https.proxyHost","");
		System.setProperty("https.proxyPort","");
		System.setProperty("https.proxyHost","");
		System.setProperty("https.proxyPort","");
	}
}
*/