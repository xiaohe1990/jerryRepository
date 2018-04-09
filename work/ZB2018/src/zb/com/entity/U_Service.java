package zb.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
* @ClassName: U_Service 
* @Description: TODO(用户服务实体) 
* @author XW 
* @date 2018年4月7日 下午9:41:31 
*
 */
@Entity
public class U_Service  implements Serializable{
/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
private Long id;
private String service_name;//服务名称（关联服务规则表）
private int service_rule_id;//服务规则ID  关联服务规则表 

private int service_state;//服务状态 0是正常1是过期失效，2是异常
private Double pay_money;//支付金额
private Date pay_time;//支付时间
private int  pay_state;//支付状态 0是未支付，1是支付成功，2支付异常
private Date begin_time;//开始时间 
private Date end_time;//结束时间
private Date create_time;//创建时间
private Long uid;//所属用户ID
private Date update_time;//修改时间

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getService_name() {
	return service_name;
}
public void setService_name(String service_name) {
	this.service_name = service_name;
}



public int getService_rule_id() {
	return service_rule_id;
}
public void setService_rule_id(int service_rule_id) {
	this.service_rule_id = service_rule_id;
}
public Date getBegin_time() {
	return begin_time;
}
public void setBegin_time(Date begin_time) {
	this.begin_time = begin_time;
}
public Date getEnd_time() {
	return end_time;
}
public void setEnd_time(Date end_time) {
	this.end_time = end_time;
}
public Date getCreate_time() {
	return create_time;
}
public void setCreate_time(Date create_time) {
	this.create_time = create_time;
}
public Long getUid() {
	return uid;
}
public void setUid(Long uid) {
	this.uid = uid;
}
public Date getUpdate_time() {
	return update_time;
}
public void setUpdate_time(Date update_time) {
	this.update_time = update_time;
}

public int getService_state() {
	return service_state;
}
public void setService_state(int service_state) {
	this.service_state = service_state;
}
public Double getPay_money() {
	return pay_money;
}
public void setPay_money(Double pay_money) {
	this.pay_money = pay_money;
}
public Date getPay_time() {
	return pay_time;
}
public void setPay_time(Date pay_time) {
	this.pay_time = pay_time;
}
public int getPay_state() {
	return pay_state;
}
public void setPay_state(int pay_state) {
	this.pay_state = pay_state;
}


}
