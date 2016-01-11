
package com.bfm.util;

import java.util.HashMap;

import org.apache.http.Header;
/**
 * 封装请求返回的参数
 *
 */

public class Result {
    
	private String cookie;
	private int statusCode;
	private HashMap<String, Header> headerAll;
	private String httpEntity;
	
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public HashMap<String, Header> getHeaders() {
		return headerAll;
	}
	
	public void setHeaders(Header[] headers){
		headerAll = new HashMap<String, Header>();
		for (Header header : headers) {
			headerAll.put(header.getName(), header);
		}
	}
	public String getHttpEntity() {
		return httpEntity;
	}
	public void setHttpEntity(String httpEntity) {
		this.httpEntity = httpEntity;
	}
}