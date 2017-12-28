package com.wangsd.web.modelCustom;

import com.wangsd.web.model.SysMenu;

import java.util.List;

/**
 * Created by Administrator on 2017/6/9.
 */
public class MenuCustom extends SysMenu {

    private List<SysMenu> sonMenu;

    private boolean checked;

    private boolean open;

    public List<SysMenu> getSonMenu() {
        return sonMenu;
    }

    public void setSonMenu(List<SysMenu> sonMenu) {
        this.sonMenu = sonMenu;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
