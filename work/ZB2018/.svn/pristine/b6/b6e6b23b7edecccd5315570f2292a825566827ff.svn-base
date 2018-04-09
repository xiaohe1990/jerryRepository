package zb.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
* @ClassName: T_Dict 
* @Description: TODO(字典) 
* @author XW 
* @date 2018年4月7日 下午11:31:21 
*
 */
@Entity
public class T_Dict  implements Serializable{
/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
private Long id;//
private String t_key;
private String t_value;//字典值
private String t_type;//字典类型 wx_config alipay
private String t_remark;//备注
private  Date create_time;//创建时间
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getT_key() {
	return t_key;
}
public void setT_key(String t_key) {
	this.t_key = t_key;
}
public String getT_value() {
	return t_value;
}
public void setT_value(String t_value) {
	this.t_value = t_value;
}
public String getT_type() {
	return t_type;
}
public void setT_type(String t_type) {
	this.t_type = t_type;
}
public String getT_remark() {
	return t_remark;
}
public void setT_remark(String t_remark) {
	this.t_remark = t_remark;
}
public Date getCreate_time() {
	return create_time;
}
public void setCreate_time(Date create_time) {
	this.create_time = create_time;
}





}
