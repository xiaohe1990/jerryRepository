package zb.com.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * 
* @ClassName: User_Basic 
* @Description: TODO(用户基本信息) 
* @author XW 
* @date 2018-08-12 
*
 */
@Entity
public class U_Basic  implements Serializable{
  
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	private Long uid;
	private String u_name;//用户真实姓名
    private String u_phone;//手机号
    private String u_email;//邮箱
    private String u_pwd;//密码
    private String u_company;//公司名称
    private String u_contact;//联系人姓名
    private Double u_balance;//默认为0账号余额
    private Double u_coin_count;//下载币个数
    private int u_state;//0删除1是正常，2禁用
   
    private int u_role;//默认为0， 0是普通会员，1是系统超级管理员，2是编辑，3是客服
    private int u_isService;//用户是否购买了服务 0否1：是（关联服务表u_service查询服务类型比如订阅服务，账号试用期服务等）
    private  String u_service_level;//用户服务等级 默认为普通会员根据用户服务表查询u_service 服务名称
    
    
	private String subscribe;// 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
	private String openid;// 用户的标识，对当前公众号唯一
	private String nickname;// 用户的昵称
	private String sex;// 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
	private String city;// 用户所在城市
	private String country;// 用户所在国家
	private String province;// 用户所在省份
	private String language;// 用户的语言，简体中文为zh_CN
	private String headimgurl;// 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
	private String subscribe_time;// 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
	private String unionid;// 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
	private String remark;// 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
	private String groupid;// 用户所在的分组ID（兼容旧的用户分组接口）
	private List<String> tagid_list;// 用户被打上的标签ID列表
	private String subscribe_scene;//返回用户关注的渠道来源，ADD_SCENE_SEARCH 公众号搜索，ADD_SCENE_ACCOUNT_MIGRATION 公众号迁移，ADD_SCENE_PROFILE_CARD 名片分享，ADD_SCENE_QR_CODE 扫描二维码，ADD_SCENEPROFILE LINK 图文页内名称点击，ADD_SCENE_PROFILE_ITEM 图文页右上角菜单，ADD_SCENE_PAID 支付后关注，ADD_SCENE_OTHERS 其他
	private String qr_scene;	//二维码扫码场景（开发者自定义）
	private String qr_scene_str;//二维码扫码场景描述（开发者自定义）
	private List<String> privilege;// 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
	
	private Date add_time=new Date();//创建时间
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}
   
	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_phone() {
		return u_phone;
	}

	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getU_pwd() {
		return u_pwd;
	}

	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}

	public String getU_company() {
		return u_company;
	}

	public void setU_company(String u_company) {
		this.u_company = u_company;
	}

	public String getU_contact() {
		return u_contact;
	}

	public void setU_contact(String u_contact) {
		this.u_contact = u_contact;
	}
	//@Column(columnDefinition="double default 0.0") 
	public Double getU_balance() {
		return u_balance;
	}

	public void setU_balance(Double u_balance) {
		this.u_balance = u_balance;
	}

	public Double getU_coin_count() {
		return u_coin_count;
	}

	public void setU_coin_count(Double u_coin_count) {
		this.u_coin_count = u_coin_count;
	}

	public String getU_service_level() {
		return u_service_level;
	}

	public void setU_service_level(String u_service_level) {
		this.u_service_level = u_service_level;
	}
	@Column(columnDefinition="integer default 0") 
	public int getU_isService() {
		return u_isService;
	}

	public void setU_isService(int u_isService) {
		this.u_isService = u_isService;
	}

	public String getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getSubscribe_time() {
		return subscribe_time;
	}

	public void setSubscribe_time(String subscribe_time) {
		this.subscribe_time = subscribe_time;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
    @Transient
	public List<String> getTagid_list() {
		return tagid_list;
	}

	public void setTagid_list(List<String> tagid_list) {
		this.tagid_list = tagid_list;
	}

	public String getSubscribe_scene() {
		return subscribe_scene;
	}

	public void setSubscribe_scene(String subscribe_scene) {
		this.subscribe_scene = subscribe_scene;
	}

	public String getQr_scene() {
		return qr_scene;
	}

	public void setQr_scene(String qr_scene) {
		this.qr_scene = qr_scene;
	}

	public String getQr_scene_str() {
		return qr_scene_str;
	}

	public void setQr_scene_str(String qr_scene_str) {
		this.qr_scene_str = qr_scene_str;
	}
	 @Transient
	public List<String> getPrivilege() {
		return privilege;
	}

	public void setPrivilege(List<String> privilege) {
		this.privilege = privilege;
	}
	@Column(updatable = false,nullable=false,length=20,columnDefinition="timestamptz default now()")
	public Date getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}
	@Column(columnDefinition="integer default 0") 
	public int getU_role() {
		return u_role;
	}

	public void setU_role(int u_role) {
		this.u_role = u_role;
	}
	@Column(columnDefinition="integer default 1")
	public int getU_state() {
		return u_state;
	}

	public void setU_state(int u_state) {
		this.u_state = u_state;
	}
	
	
	
}
