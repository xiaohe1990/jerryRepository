package com.mall.goods.model;
/**
 * 
* @ClassName: GClassify 
* @Description: TODO(商品分类实体) 
* @author XW 
* @date 2018年1月11日 下午8:57:58 
*
 */
public class GClassify {
	private long id;
	private String classify_name;//分类名称
	private String classify_about;//简介
	private long  classify_parent_id;//父ID
	private String classify_img;//分类图片
	private long org_id;//所属商家机构ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClassify_name() {
		return classify_name;
	}
	public void setClassify_name(String classify_name) {
		this.classify_name = classify_name;
	}
	public String getClassify_about() {
		return classify_about;
	}
	public void setClassify_about(String classify_about) {
		this.classify_about = classify_about;
	}
	public long getClassify_parent_id() {
		return classify_parent_id;
	}
	public void setClassify_parent_id(long classify_parent_id) {
		this.classify_parent_id = classify_parent_id;
	}
	public String getClassify_img() {
		return classify_img;
	}
	public void setClassify_img(String classify_img) {
		this.classify_img = classify_img;
	}
	public long getOrg_id() {
		return org_id;
	}
	public void setOrg_id(long org_id) {
		this.org_id = org_id;
	}

}
