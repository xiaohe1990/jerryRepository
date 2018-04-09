package com.mall.goods.model;
/**
 * 
* @ClassName: GAttribute 
* @Description: TODO(商品属性实体) 
* @author XW 
* @date 2018年1月11日 下午9:06:41 
*
 */
public class GAttribute {
	private long id;
	private String g_attribute_name;//属性名
	private int g_attribute_type;//属性类型（0是销售类型（如颜色控制价格的如 衣服尺码，电脑内存））1是规格类型(不影响价格的)
	private int option_img_isnull;//该属性选项图片是否必须0是否1是必须
	private long org_id;//所属商家或机构ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getG_attribute_name() {
		return g_attribute_name;
	}
	public void setG_attribute_name(String g_attribute_name) {
		this.g_attribute_name = g_attribute_name;
	}
	public int getG_attribute_type() {
		return g_attribute_type;
	}
	public void setG_attribute_type(int g_attribute_type) {
		this.g_attribute_type = g_attribute_type;
	}
	public int getOption_img_isnull() {
		return option_img_isnull;
	}
	public void setOption_img_isnull(int option_img_isnull) {
		this.option_img_isnull = option_img_isnull;
	}
	public long getOrg_id() {
		return org_id;
	}
	public void setOrg_id(long org_id) {
		this.org_id = org_id;
	}
	

}
