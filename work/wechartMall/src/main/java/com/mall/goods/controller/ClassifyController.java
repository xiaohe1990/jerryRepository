package com.mall.goods.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;

@Controller
@Scope(value="prototype")
@RequestMapping("goods")
public class ClassifyController {
	@RequestMapping(value="{page}",method=RequestMethod.GET)
	public ModelAndView toPage(@PathVariable("page")String page){
		return new ModelAndView(String.format("goods/%s", page));
	}
	
	@RequestMapping(value="getClassifyList",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> getClassifyList(HttpServletRequest request,
			HttpServletResponse response){
		System.out.print(JSON.toJSONString(request.getParameterMap()));
		return null;
	}
	
}
