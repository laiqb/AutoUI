
package com.bfm.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 根据正则从HTML中提取响应的数据
 *
 */

public class HtmlParse {
    
	public static List<String> prase(String html,String regex,int number){
		
		Pattern patten = Pattern.compile(regex);
		Matcher mat = patten.matcher(html);
		List<String> list = new ArrayList<String>();
		while(mat.find()) {
	   if(number==-1){
		   list.add(mat.group());
		   continue;
	   }
		if(number>0){
			list.add(mat.group());
			number--;
     	  }else{
     		  break;
     	  }
		}
		return list;
	}	
	
	public static List<String> prase(String html,String regex){
		return prase(html, regex, -1);
	}
	
}