package com.ameya.soap.wsclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class SOAPConnector extends WebServiceGatewaySupport {

	
	public Object callWebService(String url, Object request){
		return getWebServiceTemplate().marshalSendAndReceive(url, request);
	}
}