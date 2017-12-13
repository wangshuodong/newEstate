package com.wangsd.web.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
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
 * @since 2017-12-13
 */
public class Ticket extends Model<Ticket> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("billaccount_id")
	private Integer billaccountId;
    /**
     * 发票抬头
     */
	@TableField("title_name")
	private String titleName;
    /**
     * 发票类型0单位，1个人
     */
	private Integer type;
    /**
     * 税号
     */
	@TableField("register_no")
	private String registerNo;
	private Double amount;
    /**
     * 联系电话
     */
	private String phone;
	private String email;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBillaccountId() {
		return billaccountId;
	}

	public void setBillaccountId(Integer billaccountId) {
		this.billaccountId = billaccountId;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Ticket{" +
			", id=" + id +
			", billaccountId=" + billaccountId +
			", titleName=" + titleName +
			", type=" + type +
			", registerNo=" + registerNo +
			", amount=" + amount +
			", phone=" + phone +
			", email=" + email +
			"}";
	}
}
