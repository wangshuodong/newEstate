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
public class Roominfo extends Model<Roominfo> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("parent_id")
	private Integer parentId;
    /**
     * 支付宝房屋编号
     */
	@TableField("room_id")
	private String roomId;
    /**
     * 房屋所在的组团名称。例如“一期”，“东区”，“香桂苑”等
     */
	@TableField("group_name")
	private String groupName;
    /**
     * 房屋所在楼栋名称。例如“1栋”，“1幢”等
     */
	private String building;
    /**
     * 房屋所在单元名称
     */
	private String unit;
    /**
     * 房屋所在房号。例如“1101室”，“11B室”等
     */
	private String room;
    /**
     * 房间的完整门牌地址，例如一期1栋2单元2202室
     */
	private String address;
    /**
     * 业主姓名
     */
	@TableField("owner_name")
	private String ownerName;
    /**
     * 业主身份证
     */
	@TableField("owner_card")
	private String ownerCard;
    /**
     * 业主电话
     */
	@TableField("owner_phone")
	private String ownerPhone;
    /**
     * 入住时间
     */
	private String entryDate;
	private Integer deleteStatus;
    /**
     * false没有同步，true同步
     */
	private Integer status;
	@TableField("create_time")
	private Date createTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerCard() {
		return ownerCard;
	}

	public void setOwnerCard(String ownerCard) {
		this.ownerCard = ownerCard;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public Integer getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
		return "Roominfo{" +
			", id=" + id +
			", parentId=" + parentId +
			", roomId=" + roomId +
			", groupName=" + groupName +
			", building=" + building +
			", unit=" + unit +
			", room=" + room +
			", address=" + address +
			", ownerName=" + ownerName +
			", ownerCard=" + ownerCard +
			", ownerPhone=" + ownerPhone +
			", entryDate=" + entryDate +
			", deleteStatus=" + deleteStatus +
			", status=" + status +
			", createTime=" + createTime +
			"}";
	}
}
