package com.wangsd.web.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author wangsd
 * @since 2017-12-13
 */
public class Permission extends Model<Permission> {

    private static final long serialVersionUID = 1L;

    /**
     * 权限id
     */
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 权限名
     */
	private String name;
    /**
     * 权限标识,程序中判断使用,如"user:create"
     */
	@TableField("permission_sign")
	private String permissionSign;
    /**
     * 权限描述,UI界面显示使用
     */
	private String description;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermissionSign() {
		return permissionSign;
	}

	public void setPermissionSign(String permissionSign) {
		this.permissionSign = permissionSign;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Permission{" +
			", id=" + id +
			", name=" + name +
			", permissionSign=" + permissionSign +
			", description=" + description +
			"}";
	}
}
