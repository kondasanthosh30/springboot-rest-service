package springbootrestservice.springbootrestdemo.restcommons;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

public final class RestTemplateFactory
{
	
	private RestTemplateFactory()
	{
		
	}
	public static RestTemplate getRestTemplate()
	{
		RestTemplate restTemplate=new RestTemplate();
		//ClientHttpRequestInterceptor apiInterCeptors=new ApiRequestHeade
		return restTemplate;
	}
	
}
