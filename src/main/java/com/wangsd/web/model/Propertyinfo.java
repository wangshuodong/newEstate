package com.wangsd.web.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
public class Propertyinfo extends Model<Propertyinfo> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String code;
	private String name;
	@TableField("contact_people")
	private String contactPeople;
	@TableField("contact_phone")
	private String contactPhone;
	@TableField("contact_address")
	private String contactAddress;
    /**
     * 税号
     */
	private String salerTaxNum;
    /**
     * 上级物业id
     */
	@TableField("parent_id")
	private Integer parentId;
    /**
     * 商户账号
     */
	@TableField("alipay_login_id")
	private String alipayLoginId;
    /**
     * 商户PID
     */
	@TableField("app_id")
	private String appId;
    /**
     * 授权TOKEN
     */
	private String token;
    /**
     * 支付宝代扣协议编号
     */
	@TableField("alipay_debit_num")
	private String alipayDebitNum;
    /**
     * 微信代扣协议编号
     */
	@TableField("weixin_debit_num")
	private String weixinDebitNum;
    /**
     * 微信子商户
     */
	@TableField("weixin_children_num")
	private String weixinChildrenNum;
    /**
     * API
     */
	private String api;
	@TableField("create_time")
	private Date createTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactPeople() {
		return contactPeople;
	}

	public void setContactPeople(String contactPeople) {
		this.contactPeople = contactPeople;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getSalerTaxNum() {
		return salerTaxNum;
	}

	public void setSalerTaxNum(String salerTaxNum) {
		this.salerTaxNum = salerTaxNum;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getAlipayLoginId() {
		return alipayLoginId;
	}

	public void setAlipayLoginId(String alipayLoginId) {
		this.alipayLoginId = alipayLoginId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAlipayDebitNum() {
		return alipayDebitNum;
	}

	public void setAlipayDebitNum(String alipayDebitNum) {
		this.alipayDebitNum = alipayDebitNum;
	}

	public String getWeixinDebitNum() {
		return weixinDebitNum;
	}

	public void setWeixinDebitNum(String weixinDebitNum) {
		this.weixinDebitNum = weixinDebitNum;
	}

	public String getWeixinChildrenNum() {
		return weixinChildrenNum;
	}

	public void setWeixinChildrenNum(String weixinChildrenNum) {
		this.weixinChildrenNum = weixinChildrenNum;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Propertyinfo{" +
			", id=" + id +
			", code=" + code +
			", name=" + name +
			", contactPeople=" + contactPeople +
			", contactPhone=" + contactPhone +
			", contactAddress=" + contactAddress +
			", salerTaxNum=" + salerTaxNum +
			", parentId=" + parentId +
			", alipayLoginId=" + alipayLoginId +
			", appId=" + appId +
			", token=" + token +
			", alipayDebitNum=" + alipayDebitNum +
			", weixinDebitNum=" + weixinDebitNum +
			", weixinChildrenNum=" + weixinChildrenNum +
			", api=" + api +
			", createTime=" + createTime +
			"}";
	}
}
