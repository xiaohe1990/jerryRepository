package com.mall.goods.model;
/**
 * 
* @ClassName: GMiddleSku 
* @Description: TODO(商品属性组合中间表) 
* @author XW 
* @date 2018年1月11日 下午9:17:48 
*
 */
public class GMiddleSku {
	private long id;
	private String g_sku_name;//商品属性组合名称例如 银白色3G华为荣耀
	private long goods_id;//所属商品
    private float g_costprice;//原价
	private float g_boostprice;//促销价
	private int g_stock_count;//库存数
	private int g_evaluate_count;//评价数
	private int g_voidsale_count;//虚拟销售数
	private int g_validsale_count;//实际销售数
	private String g_details;//详情介绍，html如图片啥的
	private long org_id;//所属商家机构ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getG_sku_name() {
		return g_sku_name;
	}
	public void setG_sku_name(String g_sku_name) {
		this.g_sku_name = g_sku_name;
	}
	public long getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(long goods_id) {
		this.goods_id = goods_id;
	}

	public float getG_costprice() {
		return g_costprice;
	}
	public void setG_costprice(float g_costprice) {
		this.g_costprice = g_costprice;
	}
	public float getG_boostprice() {
		return g_boostprice;
	}
	public void setG_boostprice(float g_boostprice) {
		this.g_boostprice = g_boostprice;
	}
	public int getG_stock_count() {
		return g_stock_count;
	}
	public void setG_stock_count(int g_stock_count) {
		this.g_stock_count = g_stock_count;
	}
	public int getG_evaluate_count() {
		return g_evaluate_count;
	}
	public void setG_evaluate_count(int g_evaluate_count) {
		this.g_evaluate_count = g_evaluate_count;
	}
	public int getG_voidsale_count() {
		return g_voidsale_count;
	}
	public void setG_voidsale_count(int g_voidsale_count) {
		this.g_voidsale_count = g_voidsale_count;
	}
	public int getG_validsale_count() {
		return g_validsale_count;
	}
	public void setG_validsale_count(int g_validsale_count) {
		this.g_validsale_count = g_validsale_count;
	}
	public String getG_details() {
		return g_details;
	}
	public void setG_details(String g_details) {
		this.g_details = g_details;
	}
	public long getOrg_id() {
		return org_id;
	}
	public void setOrg_id(long org_id) {
		this.org_id = org_id;
	}

}
