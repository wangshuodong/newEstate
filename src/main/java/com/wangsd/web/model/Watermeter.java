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
public class Watermeter extends Model<Watermeter> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("housing_id")
	private Integer housingId;
	@TableField("roominfo_id")
	private Integer roominfoId;
    /**
     * 本期实数
     */
	@TableField("water_num")
	private Double waterNum;
    /**
     * 本期用量
     */
	@TableField("use_num")
	private Double useNum;
    /**
     * 抄表员
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 本期金额
     */
	private Double amount;
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

	public Double getWaterNum() {
		return waterNum;
	}

	public void setWaterNum(Double waterNum) {
		this.waterNum = waterNum;
	}

	public Double getUseNum() {
		return useNum;
	}

	public void setUseNum(Double useNum) {
		this.useNum = useNum;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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
		return "Watermeter{" +
			", id=" + id +
			", housingId=" + housingId +
			", roominfoId=" + roominfoId +
			", waterNum=" + waterNum +
			", useNum=" + useNum +
			", userId=" + userId +
			", amount=" + amount +
			", createTime=" + createTime +
			"}";
	}
}
