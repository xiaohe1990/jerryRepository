package com.mall.goods.model;
/**
 * 
* @ClassName: GSkuAttrbute 
* @Description: TODO(商品属性组合SKU表属性选项关联表) 
* @author XW 
* @date 2018年1月11日 下午9:29:59 
*
 */
public class GSkuAttrbute {
	private long id;
	private long attribute_id;//属性表ID
	private long attribute_option_id;//属性选项ID
	private long middle_skuid;//所属商品属性组合SKU表ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAttribute_id() {
		return attribute_id;
	}
	public void setAttribute_id(long attribute_id) {
		this.attribute_id = attribute_id;
	}
	public long getAttribute_option_id() {
		return attribute_option_id;
	}
	public void setAttribute_option_id(long attribute_option_id) {
		this.attribute_option_id = attribute_option_id;
	}
	public long getMiddle_skuid() {
		return middle_skuid;
	}
	public void setMiddle_skuid(long middle_skuid) {
		this.middle_skuid = middle_skuid;
	}
	

}
