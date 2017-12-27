package com.wangsd.web.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
public class Housinginfo extends Model<Housinginfo> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 支付宝小区统一编号
     */
	@TableField("community_id")
	private String communityId;
	private String code;
	private String name;
	private String address;
    /**
     * 上级物业id
     */
	@TableField("parent_id")
	private Integer parentId;
    /**
     * 区县编码
     */
	@TableField("district_code")
	private String districtCode;
    /**
     * 地级市编码
     */
	@TableField("city_code")
	private String cityCode;
    /**
     * 省份编码
     */
	@TableField("province_code")
	private String provinceCode;
    /**
     * 小区所在的经纬度列表
     */
	@TableField("community_locations")
	private String communityLocations;
    /**
     * 小区对应的高德POI兴趣点列表
     */
	@TableField("associated_pois")
	private String associatedPois;
    /**
     * 服务热线电话
     */
	private String hotline;
    /**
     * 短信条数
     */
	@TableField("message_num")
	private Integer messageNum;
    /**
     * 1未同步2已同步3已初始化
4已上线
     */
	private Integer status;
	private Integer deleteStatus;
	@TableField("create_time")
	private Date createTime;
    /**
     * 水费单价
     */
	@TableField("water_unit")
	private Double waterUnit;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCommunityLocations() {
		return communityLocations;
	}

	public void setCommunityLocations(String communityLocations) {
		this.communityLocations = communityLocations;
	}

	public String getAssociatedPois() {
		return associatedPois;
	}

	public void setAssociatedPois(String associatedPois) {
		this.associatedPois = associatedPois;
	}

	public String getHotline() {
		return hotline;
	}

	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public Integer getMessageNum() {
		return messageNum;
	}

	public void setMessageNum(Integer messageNum) {
		this.messageNum = messageNum;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Double getWaterUnit() {
		return waterUnit;
	}

	public void setWaterUnit(Double waterUnit) {
		this.waterUnit = waterUnit;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Housinginfo{" +
			", id=" + id +
			", communityId=" + communityId +
			", code=" + code +
			", name=" + name +
			", address=" + address +
			", parentId=" + parentId +
			", districtCode=" + districtCode +
			", cityCode=" + cityCode +
			", provinceCode=" + provinceCode +
			", communityLocations=" + communityLocations +
			", associatedPois=" + associatedPois +
			", hotline=" + hotline +
			", messageNum=" + messageNum +
			", status=" + status +
			", deleteStatus=" + deleteStatus +
			", createTime=" + createTime +
			", waterUnit=" + waterUnit +
			"}";
	}
}
