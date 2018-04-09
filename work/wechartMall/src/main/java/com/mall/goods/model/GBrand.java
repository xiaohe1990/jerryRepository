package com.mall.goods.model;
/**
 * 
* @ClassName: GBrand 
* @Description: TODO(品牌实体) 
* @author XW 
* @date 2018年1月11日 下午9:02:39 
*
 */
public class GBrand {
private	long id;
private String 	brand_name;//品牌名称
private String 	brand_logo;//品牌logo地址
private String brand_about;//品牌简介
private long classify_id;//所属商品分类ID
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getBrand_name() {
	return brand_name;
}
public void setBrand_name(String brand_name) {
	this.brand_name = brand_name;
}
public String getBrand_logo() {
	return brand_logo;
}
public void setBrand_logo(String brand_logo) {
	this.brand_logo = brand_logo;
}
public String getBrand_about() {
	return brand_about;
}
public void setBrand_about(String brand_about) {
	this.brand_about = brand_about;
}
public long getClassify_id() {
	return classify_id;
}
public void setClassify_id(long classify_id) {
	this.classify_id = classify_id;
}


}
