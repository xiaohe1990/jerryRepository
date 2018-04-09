package zb.com.controls;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zb.com.entity.U_Basic;
import zb.com.services.UserBasicServices;
import zb.com.util.ConstantUtil;
import zb.com.util.EncryptType;
import zb.com.util.EncryptUtil;
import zb.com.util.HelpUtil;

@Controller
public class UserBasicControl extends BaseControl {

	@Autowired
	private UserBasicServices userBasicServices;
	
	@RequestMapping(value = "/sys/{page}", method = RequestMethod.GET)
	public String  search_list(HttpServletRequest request, HttpServletResponse response, @PathVariable String page) throws Exception {
		
		return "sys/"+page;
	}
	
	
	@RequestMapping(value = "/mainpage", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		U_Basic user = getSys_User(request);
		if(user == null){
			String u_keyword = request.getParameter("u_keyword");
			String u_pwd = request.getParameter("u_pwd");
			if(HelpUtil.isNull(u_pwd)) {
				
			}else {
				u_pwd=EncryptUtil.sign(u_pwd, EncryptType.SHA_1);
			}
			String checkCode = request.getParameter("checkCode");
			user = userBasicServices.checkSys_User(u_keyword, checkCode);
		}
		if(user != null){
			request.getSession().setAttribute(ConstantUtil.SYSUSERINFO, user);
			//response.sendRedirect("./main");
			//return "redirect:/main";
			return "main";
		}else{
			request.setAttribute("loginInfo", "用户名或密码错误！");  
	        //request.getRequestDispatcher("/login.jsp").forward(request, response);
	        //return "forward:/login.jsp";
			return "sys/login";
		}
	}
	
}
