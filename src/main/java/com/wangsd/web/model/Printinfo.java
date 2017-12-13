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
public class Printinfo extends Model<Printinfo> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("department_id")
	private Integer departmentId;
    /**
     * 打印机终端号
     */
	@TableField("machine_code")
	private String machineCode;
    /**
     * 打印机密钥
     */
	private String msign;
	@TableField("mobile_phone")
	private String mobilePhone;
	@TableField("print_name")
	private String printName;
    /**
     * 0小区，1物业
     */
	private Integer status;
	private Integer deleteStatus;
	private Date createtime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getMachineCode() {
		return machineCode;
	}

	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public String getMsign() {
		return msign;
	}

	public void setMsign(String msign) {
		this.msign = msign;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Printinfo{" +
			", id=" + id +
			", departmentId=" + departmentId +
			", machineCode=" + machineCode +
			", msign=" + msign +
			", mobilePhone=" + mobilePhone +
			", printName=" + printName +
			", status=" + status +
			", deleteStatus=" + deleteStatus +
			", createtime=" + createtime +
			"}";
	}
}
