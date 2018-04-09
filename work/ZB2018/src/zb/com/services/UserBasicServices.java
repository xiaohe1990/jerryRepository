package zb.com.services;

import javax.servlet.http.HttpServletRequest;

import zb.com.entity.U_Basic;
import zb.com.util.PageTool;

public interface UserBasicServices {
 
	public int saveUserBasic(U_Basic u_basic);
	
	public PageTool selUserBasicPage(int nowPage,int pageSize,HttpServletRequest request,U_Basic user);
	
	public U_Basic getUserBasicByEmailOrPhone(String keyword);
	
	public Long getUserBasicCountByKeyWord(String email,String phone);
	
	public U_Basic getUserBasicById(Long id);

	public U_Basic checkSys_User(String u_keyword, String checkCode);
	
}