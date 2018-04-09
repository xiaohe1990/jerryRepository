package zb.com.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zb.com.dao.BaseDao;
import zb.com.entity.U_Basic;
import zb.com.services.UserBasicServices;
import zb.com.util.HelpUtil;
import zb.com.util.PageTool;

@Service("userBasicServices")
public class UserBasicServicesImpl implements UserBasicServices {
	
	@Autowired
	private BaseDao baseDao;
	
	@Override
	public U_Basic checkSys_User(String u_keyword, String checkCode) {
		// TODO Auto-generated method stub
		List<Object> ob=new ArrayList<>();
		String hql=" from U_Basic where u_phone=? or u_email=? ";
		ob.add(u_keyword);
		ob.add(u_keyword);
		return (U_Basic) baseDao.getObjectHql(hql, ob);
	}
	
	@Override
	public int saveUserBasic(U_Basic u_basic) {
		
		return baseDao.saveEntity(u_basic);
	}

	@Override
	public PageTool selUserBasicPage(int nowPage, int pageSize, HttpServletRequest request, U_Basic user) {
		String u_phone=request.getParameter("u_phone");//电话号
		PageTool page=new PageTool();
		page.setCrrentPage(nowPage);
		page.setPageSize(pageSize);
		List<Object> ob=new ArrayList<>();
		String hql=" from U_Basic where 1=1 ";
		StringBuffer whereHql=new StringBuffer();
		String countHql="select count(*) from U_Basic where 1=1 ";
		if(!HelpUtil.isNull(u_phone)) {
			whereHql.append(" and u_phone=?");
			ob.add(u_phone);
		}
		
		
		hql+=whereHql.toString();
		countHql+=whereHql.toString();
		List<U_Basic> wxconfig=baseDao.findByPageHql(hql, ob, nowPage, pageSize);
		page.setList(wxconfig);
		Long title=baseDao.getCountHql(countHql, ob);
		page.setTotal(Integer.parseInt(title.toString()));
		return page;
	}

	@Override
	public U_Basic getUserBasicByEmailOrPhone(String keyword) {
		List<Object> ob=new ArrayList<>();
		String hql=" from U_Basic where u_phone=? or u_email=? ";
		ob.add(keyword);
		ob.add(keyword);
		return (U_Basic) baseDao.getObjectHql(hql, ob);
	}

	@Override
	public Long getUserBasicCountByKeyWord(String email, String phone) {
		String hql=" from U_Basic where 1=1 ";
		List<Object> ob=new ArrayList<>();
		if(!HelpUtil.isNull(email)) {
			hql+=" and u_email=?";	
			ob.add(email);
		}
		if(!HelpUtil.isNull(phone)) {
			hql+=" and u_phone=?";	
			ob.add(phone);
		}
		
		return baseDao.getCountHql(hql, ob);
	}

	@Override
	public U_Basic getUserBasicById(Long id) {
		List<Object> ob=new ArrayList<>();
		String hql=" from U_Basic where uid=?";
		ob.add(id);
		return (U_Basic) baseDao.getObjectHql(hql, ob);
	}

}
