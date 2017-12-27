package com.wangsd.web.modelCustom;

import com.wangsd.web.model.Menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 菜单树
 * @author Gaojun.Zhou
 * @date 2016年12月26日 上午10:34:31
 */
public class TreeMenu implements Serializable{

	/**
	* @Fields serialVersionUID : TODO()
	*/
	
	private static final long serialVersionUID = 1L;
	/**
	 * 菜单
	 */
	private Menu menu;
	/**
	 * 子菜单
	 */
	private List<TreeMenu> children = new ArrayList<TreeMenu>();

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<TreeMenu> getChildren() {
		return children;
	}

	public void setChildren(List<TreeMenu> children) {
		this.children = children;
	}
	
	
}
