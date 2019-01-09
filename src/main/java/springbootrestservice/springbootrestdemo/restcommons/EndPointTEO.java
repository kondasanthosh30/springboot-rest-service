package springbootrestservice.springbootrestdemo.restcommons;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class EndPointTEO 
{

	private String request="";
	private String response="";
	private String callback="";
	private MediaType contentType=MediaType.TEXT_XML;
	private HashMap<String,String> inputParameters=new HashMap<String,String>();
	private Enum httpStatusCode;
	private String uri;
	private String returntype="";
	
	//SoapRequest
	private String requestBody;
	private String soapAction;
	private String headerNameSpace;
	private String headerTagName;
	private String headerContent;
	private int connectionTimeOut;
	private int readTimeOut;
	
	
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getCallback() {
		return callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}
	public MediaType getContentType() {
		return contentType;
	}
	public void setContentType(MediaType contentType) {
		this.contentType = contentType;
	}
	public HashMap<String, String> getInputParameters() {
		return inputParameters;
	}
	public void setInputParameters(HashMap<String, String> inputParameters) {
		this.inputParameters = inputParameters;
	}
	public Enum getHttpStatusCode() {
		return httpStatusCode;
	}
	public void setHttpStatusCode(Enum httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getReturntype() {
		return returntype;
	}
	public void setReturntype(String returntype) {
		this.returntype = returntype;
	}
	public String getRequestBody() {
		return requestBody;
	}
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}
	public String getSoapAction() {
		return soapAction;
	}
	public void setSoapAction(String soapAction) {
		this.soapAction = soapAction;
	}
	public String getHeaderNameSpace() {
		return headerNameSpace;
	}
	public void setHeaderNameSpace(String headerNameSpace) {
		this.headerNameSpace = headerNameSpace;
	}
	public String getHeaderTagName() {
		return headerTagName;
	}
	public void setHeaderTagName(String headerTagName) {
		this.headerTagName = headerTagName;
	}
	public String getHeaderContent() {
		return headerContent;
	}
	public void setHeaderContent(String headerContent) {
		this.headerContent = headerContent;
	}
	public int getConnectionTimeOut() {
		return connectionTimeOut;
	}
	public void setConnectionTimeOut(int connectionTimeOut) {
		this.connectionTimeOut = connectionTimeOut;
	}
	public int getReadTimeOut() {
		return readTimeOut;
	}
	public void setReadTimeOut(int readTimeOut) {
		this.readTimeOut = readTimeOut;
	}
	public Object getRequestObj() {
		return requestObj;
	}
	public void setRequestObj(Object requestObj) {
		this.requestObj = requestObj;
	}
	public Object getResponseObj() {
		return responseObj;
	}
	public void setResponseObj(Object responseObj) {
		this.responseObj = responseObj;
	}
	private Object requestObj;
	private Object responseObj;
	
	
	

}
