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
 * @since 2017-12-13
 */
public class Billaccount extends Model<Billaccount> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 对应小区id
     */
	@TableField("housing_id")
	private Integer housingId;
    /**
     * 对应房间id
     */
	@TableField("roominfo_id")
	private Integer roominfoId;
    /**
     * 费用类型名称
     */
	@TableField("cost_type")
	private Integer costType;
    /**
     * 应收金额
     */
	@TableField("bill_entry_amount")
	private Double billEntryAmount;
    /**
     * 账期，用于归类和向用户展示
     */
	@TableField("acct_period")
	private String acctPeriod;
    /**
     * 出账日期20160831
     */
	@TableField("release_day")
	private String releaseDay;
    /**
     * 缴费截止日期20160831
     */
	private String deadline;
    /**
     * 缴费明细条目关联ID。若物业系统业务约束上传的多条明细条目必须被一次同时支付，则对应的明细条目需传入同样的relate_id。
     */
	@TableField("relate_id")
	private String relateId;
    /**
     * 0:未同步 1：已同步
     */
	private Integer status;
    /**
     * 付款时间
     */
	private Date payDate;
    /**
     * 微信 支付宝 现金 刷卡 银行转账
     */
	private Integer payType;
    /**
     * 付款状态 0：未付款  1：已付款
     */
	private Integer payStatus;
	private Integer deleteStatus;
    /**
     * 支付宝付款成功回传编号
     */
	@TableField("alipay_trade_no")
	private String alipayTradeNo;
    /**
     * 微信付款成功回传编号
     */
	@TableField("weixin_trade_no")
	private String weixinTradeNo;
    /**
     * 打印状态
     */
	private Integer printStatus;
    /**
     * 开票状态0未开票，1审核中，2同意，3，拒绝，4开票成功，5开票失败
     */
	private Integer ticketStatus;
    /**
     * 发票流水号
     */
	private String invoiceSerialNum;
    /**
     * 发票代码
     */
	private String invoiceCode;
    /**
     * 发票号码
     */
	private String invoiceNum;
    /**
     * 付款人支付宝id
     */
	@TableField("buyer_user_id")
	private String buyerUserId;
	private String remark;
	@TableField("create_time")
	private Date createTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHousingId() {
		return housingId;
	}

	public void setHousingId(Integer housingId) {
		this.housingId = housingId;
	}

	public Integer getRoominfoId() {
		return roominfoId;
	}

	public void setRoominfoId(Integer roominfoId) {
		this.roominfoId = roominfoId;
	}

	public Integer getCostType() {
		return costType;
	}

	public void setCostType(Integer costType) {
		this.costType = costType;
	}

	public Double getBillEntryAmount() {
		return billEntryAmount;
	}

	public void setBillEntryAmount(Double billEntryAmount) {
		this.billEntryAmount = billEntryAmount;
	}

	public String getAcctPeriod() {
		return acctPeriod;
	}

	public void setAcctPeriod(String acctPeriod) {
		this.acctPeriod = acctPeriod;
	}

	public String getReleaseDay() {
		return releaseDay;
	}

	public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getRelateId() {
		return relateId;
	}

	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public Integer getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getAlipayTradeNo() {
		return alipayTradeNo;
	}

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getWeixinTradeNo() {
		return weixinTradeNo;
	}

	public void setWeixinTradeNo(String weixinTradeNo) {
		this.weixinTradeNo = weixinTradeNo;
	}

	public Integer getPrintStatus() {
		return printStatus;
	}

	public void setPrintStatus(Integer printStatus) {
		this.printStatus = printStatus;
	}

	public Integer getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(Integer ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getInvoiceSerialNum() {
		return invoiceSerialNum;
	}

	public void setInvoiceSerialNum(String invoiceSerialNum) {
		this.invoiceSerialNum = invoiceSerialNum;
	}

	public String getInvoiceCode() {
		return invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public String getBuyerUserId() {
		return buyerUserId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
		return "Billaccount{" +
			", id=" + id +
			", housingId=" + housingId +
			", roominfoId=" + roominfoId +
			", costType=" + costType +
			", billEntryAmount=" + billEntryAmount +
			", acctPeriod=" + acctPeriod +
			", releaseDay=" + releaseDay +
			", deadline=" + deadline +
			", relateId=" + relateId +
			", status=" + status +
			", payDate=" + payDate +
			", payType=" + payType +
			", payStatus=" + payStatus +
			", deleteStatus=" + deleteStatus +
			", alipayTradeNo=" + alipayTradeNo +
			", weixinTradeNo=" + weixinTradeNo +
			", printStatus=" + printStatus +
			", ticketStatus=" + ticketStatus +
			", invoiceSerialNum=" + invoiceSerialNum +
			", invoiceCode=" + invoiceCode +
			", invoiceNum=" + invoiceNum +
			", buyerUserId=" + buyerUserId +
			", remark=" + remark +
			", createTime=" + createTime +
			"}";
	}
}
