package zb.com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
* @ClassName: U_Service_Rule 
* @Description: TODO(用户服务规则) 
* @author XW 
* @date 2018年4月8日 下午10:09:29 
*
 */
@Entity
public class U_Service_Rule  implements Serializable{
	
/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
private int id;//规则ID
private String service_name;//服务名称
private int service_Rule_type;//规则类型0是下载币购买规则，1会员等级规则
private Double service_count;//服务数(购买下载币规则时单位为个数量，会员等级规则时单位为包{周，月，年} )
private Double service_money;//服务所需金额
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getService_name() {
	return service_name;
}
public void setService_name(String service_name) {
	this.service_name = service_name;
}
public int getService_Rule_type() {
	return service_Rule_type;
}
public void setService_Rule_type(int service_Rule_type) {
	this.service_Rule_type = service_Rule_type;
}
public Double getService_count() {
	return service_count;
}
public void setService_count(Double service_count) {
	this.service_count = service_count;
}
public Double getService_money() {
	return service_money;
}
public void setService_money(Double service_money) {
	this.service_money = service_money;
}





}
