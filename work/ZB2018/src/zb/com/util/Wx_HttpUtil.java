package zb.com.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.alibaba.fastjson.JSON;

import zb.com.entity.U_Basic;
import zb.com.entity.Wx_Access_token;

public class Wx_HttpUtil {
    /**
     * 获取网页token
     * @param tkparams
     * @return
     * @throws Exception
     */
	public static Wx_Access_token getWxHttpWebToken(Map<String, Object> tkparams,String wx_token_url) throws Exception{
		 String tkResult=HttpUtil.doHttp(wx_token_url, tkparams, "get", "UTF-8");
		 System.out.println("tkResult***"+tkResult);
		 Wx_Access_token satk=JSON.parseObject(tkResult,Wx_Access_token.class);
		return satk;
	}
	

	/**
	 * 
	 * @Title: getWxWxUser   
	 * @Description: TODO(普通方式获取普通微信用户信息)   
	 * @param: @param wxusparams
	 * @param: @return      
	 * @return: Wx_User      
	 * @throws
	 */
	public static U_Basic getWxWxUser(Map<String, Object> wxusparams,String wxapp_url){
		String wxusResult=HttpUtil.doHttp(wxapp_url, wxusparams, "get", "UTF-8");
		U_Basic wx_user=JSON.parseObject(wxusResult,U_Basic.class);
    	return wx_user;
	}
	/**
	 * 
	 * @Title: getWxWebWxUser   
	 * @Description: TODO(网页授权获取普通微信用户信息)   
	 * @param: @param wxusparams
	 * @param: @return      
	 * @return: Wx_User      
	 * @throws
	 */
	public static U_Basic getWxWebWxUser(Map<String, Object> wxusparams,String wxwb_url){
		String wxusResult=HttpUtil.doHttp(wxwb_url, wxusparams, "get", "UTF-8");
		U_Basic wx_user=JSON.parseObject(wxusResult,U_Basic.class);
    	return wx_user;
	}
	
	/**
	 * 
	 * @Title: getDoHttpWxUser   
	 * @Description: TODO(获取微信公众号普通用户信息)   
	 * @param: @param access_token
	 * @param: @param openid
	 * @param: @param lang 返回国家地区语言版本，zh_CN 简体，zh_TW 繁体，en 英语
	 * @param: @param sys_appid 所属微信公众号APPID
	 * @param: @param sys_from 用户来源 web 网页授权，ordinary普通授权
	 * @param: @param url 接口地址
	 * @param: @return      
	 * @return: U_Basic      
	 * @throws
	 */
	public static U_Basic getDoHttpWxUser(String access_token, String openid, String lang,String sys_from,String url) {
		Map<String, Object> wxusparams=new HashMap<>();
		wxusparams.put("access_token", access_token);
		wxusparams.put("openid", openid);
		wxusparams.put("lang", lang);
		U_Basic wxuser=null;
		//微信网页授权
		if(sys_from.equals("web")) {
			wxuser=getWxWebWxUser(wxusparams,url);
		}else {
			wxuser=getWxWxUser(wxusparams,url);
		}
		
		return wxuser;
	}
	
	
	
	
	
}
