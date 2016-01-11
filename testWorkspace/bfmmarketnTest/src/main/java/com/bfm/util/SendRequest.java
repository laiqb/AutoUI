
package com.bfm.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * 发送请求
 *
 */

public class SendRequest {
   
	//这是模拟get请求
	public static Result sendGet(String url,Map<String,String> headers,Map<String,String>  params,String encoding,boolean duan) throws ClientProtocolException, IOException{
		DefaultHttpClient client = null;
		Result result = null;
		try{
			//实例化一个Httpclient的
			client = new DefaultHttpClient();
			//如果有参数的就拼装起来
			url = url+(null==params?"":assemblyParameter(params));
			//这是实例化一个get请求
			HttpGet hp = new HttpGet(url);
			//如果需要头部就组装起来
			if(null!=headers)hp.setHeaders(assemblyHeader(headers));
			//执行请求后返回一个HttpResponse
			HttpResponse response = client.execute(hp);
			//如果为true则断掉这个get请求
			if(duan) hp.abort();
			//返回一个HttpEntity
			HttpEntity  entity = response.getEntity();
			//封装返回的参数
			result= new Result();
			//设置返回的cookie
			result.setCookie(assemblyCookie(client.getCookieStore().getCookies()));
			//设置返回的状态
			result.setStatusCode(response.getStatusLine().getStatusCode());
			//设置返回的头部信息
			result.setHeaders(response.getAllHeaders());
			//设置返回的信息
			result.setHttpEntity(EntityUtils.toString(entity));
		}finally{
			client.getConnectionManager().shutdown();
		}
		return result;
	}
	
	public static Result sendGet(String url,Map<String,String> headers,Map<String,String>  params,String encoding) throws ClientProtocolException, IOException{
		return sendGet(url, headers, params, encoding,false);
	}
	
	//这是模拟post请求
	public static Result sendPost(String url,Map<String,String> headers,Map<String,String>  params,String encoding) throws ClientProtocolException, IOException{
		DefaultHttpClient client = null;
		Result result = null;
		try{
			//封装返回的参数
	        result = new Result();
			//实例化一个Httpclient的
			client = new DefaultHttpClient();
			//实例化一个post请求
			HttpPost post = new HttpPost(url);
			
			//设置需要提交的参数
			List<NameValuePair> list  = new ArrayList<NameValuePair>();
			for (String temp : params.keySet()) {
				list.add(new BasicNameValuePair(temp,params.get(temp)));
			}
			post.setEntity(new UrlEncodedFormEntity(list,encoding));
			
			
			//设置头部
			if(null!=headers)post.setHeaders(assemblyHeader(headers));
	  
			//实行请求并返回
			HttpResponse response = client.execute(post);
			HttpEntity  entity = response.getEntity();
	        //设置返回状态代码
	        result.setStatusCode(response.getStatusLine().getStatusCode());
	        //设置返回的头部信息
	        result.setHeaders(response.getAllHeaders());
	        //设置返回的cookie信心
			result.setCookie(assemblyCookie(client.getCookieStore().getCookies()));
			//设置返回到信息
			result.setHttpEntity(EntityUtils.toString(entity));
			//返回报文解析结果
		}finally{
			client.getConnectionManager().shutdown();
		}
		return result ;
	}
	
	//这是组装头部
	public static Header[] assemblyHeader(Map<String,String> headers){
		Header[] allHeader= new BasicHeader[headers.size()];
		int i  = 0;
		for (String str :headers.keySet()) {
			allHeader[i] = new BasicHeader(str,headers.get(str));
			i++;
		}
		return allHeader;
	}
	
	//这是组装cookie
	public static String assemblyCookie(List<Cookie> cookies){
		StringBuffer sbu = new StringBuffer();
		for (Cookie cookie : cookies) {
			sbu.append(cookie.getName()).append("=").append(cookie.getValue()).append(";");
		}
		if(sbu.length()>0)sbu.deleteCharAt(sbu.length()-1);
		return sbu.toString();
	}
	
	//这是组装参数
	public static String assemblyParameter(Map<String,String> parameters){
		String para = "?";
		for (String str :parameters.keySet()) {
			para+=str+"="+parameters.get(str)+"&";
		}
		return para.substring(0,para.length()-1);
	}
}
