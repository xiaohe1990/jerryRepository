package com.mall.goods.model;
/**
 * 
* @ClassName: GOrder 
* @Description: TODO(订单操作实体) 
* @author XW 
* @date 2018年1月11日 下午9:41:40 
*
 */
public class GOrder {
	private long id;
	private String order_id;//订单ID
	private long uid;//用户ID
	private String create_time;//创建时间
	private int order_state;//订单状态(0是待付款1完成支付)
	private float sum_amount;//总金额
	private float fact_pay;//实际支付
	private float remit_money;//减免金额
	private int is_mail;//是否配送（邮费）费0是无1是有
	private float mail_money;//邮寄费用
	private String buyer_ip;//买方IP
	private String buyer_address;//买方具体地址
	private long address_id;//买方地址库ID
	private long deal_origin_id;//交易来源ID 微信？PC or
	private long org_id;//所属商家机构ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public int getOrder_state() {
		return order_state;
	}
	public void setOrder_state(int order_state) {
		this.order_state = order_state;
	}
	public float getSum_amount() {
		return sum_amount;
	}
	public void setSum_amount(float sum_amount) {
		this.sum_amount = sum_amount;
	}
	public float getFact_pay() {
		return fact_pay;
	}
	public void setFact_pay(float fact_pay) {
		this.fact_pay = fact_pay;
	}
	public float getRemit_money() {
		return remit_money;
	}
	public void setRemit_money(float remit_money) {
		this.remit_money = remit_money;
	}
	public int getIs_mail() {
		return is_mail;
	}
	public void setIs_mail(int is_mail) {
		this.is_mail = is_mail;
	}
	public float getMail_money() {
		return mail_money;
	}
	public void setMail_money(float mail_money) {
		this.mail_money = mail_money;
	}
	public String getBuyer_ip() {
		return buyer_ip;
	}
	public void setBuyer_ip(String buyer_ip) {
		this.buyer_ip = buyer_ip;
	}
	public String getBuyer_address() {
		return buyer_address;
	}
	public void setBuyer_address(String buyer_address) {
		this.buyer_address = buyer_address;
	}
	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}
	public long getDeal_origin_id() {
		return deal_origin_id;
	}
	public void setDeal_origin_id(long deal_origin_id) {
		this.deal_origin_id = deal_origin_id;
	}
	public long getOrg_id() {
		return org_id;
	}
	public void setOrg_id(long org_id) {
		this.org_id = org_id;
	}

}
