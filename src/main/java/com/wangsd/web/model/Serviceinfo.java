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
public class Serviceinfo extends Model<Serviceinfo> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String code;
	private String name;
    /**
     * 区域
     */
	private String region;
    /**
     * 联系人
     */
	@TableField("contact_people")
	private String contactPeople;
    /**
     * 联系电话
     */
	@TableField("contact_phone")
	private String contactPhone;
    /**
     * 联系地址
     */
	@TableField("contact_address")
	private String contactAddress;
    /**
     * 上级服务商id
     */
	@TableField("parent_id")
	private Integer parentId;
    /**
     * 应用ID,您的APPID
     */
	@TableField("app_id")
	private String appId;
    /**
     * 商户私钥
     */
	@TableField("merchant_private_key")
	private String merchantPrivateKey;
    /**
     * 支付宝公钥
     */
	@TableField("alipay_public_key")
	private String alipayPublicKey;
	@TableField("return_url")
	private String returnUrl;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getMerchantPrivateKey() {
		return merchantPrivateKey;
	}

	public void setMerchantPrivateKey(String merchantPrivateKey) {
		this.merchantPrivateKey = merchantPrivateKey;
	}

	public String getAlipayPublicKey() {
		return alipayPublicKey;
	}

	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
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
		return "Serviceinfo{" +
			", id=" + id +
			", code=" + code +
			", name=" + name +
			", region=" + region +
			", contactPeople=" + contactPeople +
			", contactPhone=" + contactPhone +
			", contactAddress=" + contactAddress +
			", parentId=" + parentId +
			", appId=" + appId +
			", merchantPrivateKey=" + merchantPrivateKey +
			", alipayPublicKey=" + alipayPublicKey +
			", returnUrl=" + returnUrl +
			", createTime=" + createTime +
			"}";
	}
}
