package com.wangsd.web.controller;

import javax.validation.Valid;

import java.util.List;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wangzhixuan.commons.result.PageInfo;
import com.wangsd.web.model.RoleMenu;
import com.wangsd.web.service.IRoleMenuService;
import com.wangsd.commons.base.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangsd
 * @since 2017-12-14
 */
@Controller
@RequestMapping("/roleMenu")
public class RoleMenuController extends BaseController {

    @Autowired private IRoleMenuService roleMenuService;
    
    @GetMapping("/manager")
    public String manager() {
        return "admin/roleMenu/roleMenuList";
    }
    
    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(RoleMenu roleMenu, Integer page, Integer rows, String sort,String order) {
        PageInfo pageInfo = new PageInfo(page, rows, sort, order);
        EntityWrapper<RoleMenu> ew = new EntityWrapper<RoleMenu>(roleMenu);
        Page<RoleMenu> pages = getPage(pageInfo);
        pages = roleMenuService.selectPage(pages, ew);
        pageInfo.setRows(pages.getRecords());
        pageInfo.setTotal(pages.getTotal());
        return pageInfo;
    }
    
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "admin/roleMenu/roleMenuAdd";
    }
    
    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(@Valid RoleMenu roleMenu) {
        roleMenu.setCreateTime(new Date());
        roleMenu.setUpdateTime(new Date());
        roleMenu.setDeleteFlag(0);
        boolean b = roleMenuService.insert(roleMenu);
        if (b) {
            return renderSuccess("添加成功！");
        } else {
            return renderError("添加失败！");
        }
    }
    
    /**
     * 删除
     * @param id
     * @return
     */
    @PostMapping("/delete")
    @ResponseBody
    public Object delete(Long id) {
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setId(id);
        roleMenu.setUpdateTime(new Date());
        roleMenu.setDeleteFlag(1);
        boolean b = roleMenuService.updateById(roleMenu);
        if (b) {
            return renderSuccess("删除成功！");
        } else {
            return renderError("删除失败！");
        }
    }
    
    /**
     * 编辑
     * @param model
     * @param id
     * @return
     */
    @GetMapping("/editPage")
    public String editPage(Model model, Long id) {
        RoleMenu roleMenu = roleMenuService.selectById(id);
        model.addAttribute("roleMenu", roleMenu);
        return "admin/roleMenu/roleMenuEdit";
    }
    
    /**
     * 编辑
     * @param 
     * @return
     */
    @PostMapping("/edit")
    @ResponseBody
    public Object edit(@Valid RoleMenu roleMenu) {
        roleMenu.setUpdateTime(new Date());
        boolean b = roleMenuService.updateById(roleMenu);
        if (b) {
            return renderSuccess("编辑成功！");
        } else {
            return renderError("编辑失败！");
        }
    }
}
