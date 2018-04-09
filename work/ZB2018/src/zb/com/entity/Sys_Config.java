package zb.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 
* @ClassName: Sys_Config 
* @Description: TODO(系统配置实体类) 
* @author XW 
* @date 2018年4月8日 上午12:18:50 
*
 */
@Entity
public class Sys_Config implements Serializable{
	
/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	
private Long id;	
private String sys_key; //唯一约束
private String sys_value;//值
private String sys_remark;//备注
private Date create_time;//创建时间
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
@Column(unique=true)
public String getSys_key() {
	return sys_key;
}
public void setSys_key(String sys_key) {
	this.sys_key = sys_key;
}
public String getSys_value() {
	return sys_value;
}
public void setSys_value(String sys_value) {
	this.sys_value = sys_value;
}
public String getSys_remark() {
	return sys_remark;
}
public void setSys_remark(String sys_remark) {
	this.sys_remark = sys_remark;
}
//@Temporal(TemporalType.TIMESTAMP)
@Column(updatable = false,nullable=false,length=20,columnDefinition="timestamptz default now()")
public Date getCreate_time() {
	return create_time;
}
public void setCreate_time(Date create_time) {
	this.create_time = create_time;
}

}
