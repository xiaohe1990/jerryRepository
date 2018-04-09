package com.mall.common.utils;

import java.io.Serializable;

public class JsonResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message="";
	
	private  Boolean status=false;
	
	private Object result=null;
	
	private JsonResult() {}
	/**
	 * 返回成功消息
	 * @param message
	 * @param result
	 * @return
	 */
	public static JsonResult success(String message,Object result) {
		JsonResult jsonResult = new JsonResult();
		jsonResult.status = true;
		jsonResult.message=message;
		jsonResult.result=result;
		return jsonResult;
	}
	/**
	 * 返回失败消息
	 * @param message
	 * @param result
	 * @return
	 */
	public static JsonResult faild(String message,Object result) {
		JsonResult jsonResult = new JsonResult();
		jsonResult.status = false;
		jsonResult.message=message;
		jsonResult.result=result;
		return jsonResult;
	}
}
