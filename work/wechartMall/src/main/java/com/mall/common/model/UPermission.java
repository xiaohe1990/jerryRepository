package com.mall.common.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

/**
 * 
 * 开发公司：itboy.net<br/>
 * 版权：itboy.net<br/>
 * <p>
 * 
 * 权限实体
 * 
 * <p>
 * 
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　周柏成　2016年5月25日 　<br/>
 * <p>
 * *******
 * <p>
 * 
 * @author zhou-baicheng
 * @email i@itboy.net
 * @version 1.0,2016年5月25日 <br/>
 * 
 */
public class UPermission implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	/** 操作的url */
	private String url;
	/** 操作的名称 */
	private String name;
	/**资源类型:0菜单项，1菜单栏，2链接，3按钮*/
	private int type;
	/**父节点ID*/
	private int pid;
	/**菜单是否隐藏，0隐藏，1显示*/
	private int isHiden;
	private Long userId;
	
	private List<UPermission> permissionList = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getIsHiden() {
		return isHiden;
	}

	public void setIsHiden(int isHiden) {
		this.isHiden = isHiden;
	}

	
	public List<UPermission> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<UPermission> permissionList) {
		this.permissionList = permissionList;
	}

	
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String toString() {
		return JSONObject.fromObject(this).toString();
	}
}