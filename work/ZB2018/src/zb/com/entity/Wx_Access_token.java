package zb.com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
* @ClassName: Wx_Access_token 
* @Description: TODO(微信授权token) 
* @author XW 
* @date 2018年4月7日 下午11:22:58 
*
 */
@Entity
public class Wx_Access_token  implements Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	private int id;
	private String appid;
	private String access_token;
	private int aces_tokenType;//授权类型 0是普通，1是公众号网页授权，2,PC网站授权登录
	private int expires_in;
	//网页授权下的字段
	private String 	refresh_token;//	用户刷新access_token
	private String 	openid;//	用户唯一标识，请注意，在未关注公众号时，用户访问公众号的网页，也会产生一个用户和公众号唯一的OpenID
	private String 	scope;//	用户授权的作用域，使用逗号（,）分隔
	private String add_time;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public int getAces_tokenType() {
		return aces_tokenType;
	}
	public void setAces_tokenType(int aces_tokenType) {
		this.aces_tokenType = aces_tokenType;
	}
	public int getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}

}
