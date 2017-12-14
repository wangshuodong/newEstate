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
import com.wangsd.web.model.RolePermission;
import com.wangsd.web.service.IRolePermissionService;
import com.wangsd.commons.base.BaseController;

/**
 * <p>
 * 角色与权限关联表 前端控制器
 * </p>
 *
 * @author wangsd
 * @since 2017-12-14
 */
@Controller
@RequestMapping("/rolePermission")
public class RolePermissionController extends BaseController {

    @Autowired private IRolePermissionService rolePermissionService;
    
    @GetMapping("/manager")
    public String manager() {
        return "admin/rolePermission/rolePermissionList";
    }
    
    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(RolePermission rolePermission, Integer page, Integer rows, String sort,String order) {
        PageInfo pageInfo = new PageInfo(page, rows, sort, order);
        EntityWrapper<RolePermission> ew = new EntityWrapper<RolePermission>(rolePermission);
        Page<RolePermission> pages = getPage(pageInfo);
        pages = rolePermissionService.selectPage(pages, ew);
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
        return "admin/rolePermission/rolePermissionAdd";
    }
    
    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(@Valid RolePermission rolePermission) {
        rolePermission.setCreateTime(new Date());
        rolePermission.setUpdateTime(new Date());
        rolePermission.setDeleteFlag(0);
        boolean b = rolePermissionService.insert(rolePermission);
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
        RolePermission rolePermission = new RolePermission();
        rolePermission.setId(id);
        rolePermission.setUpdateTime(new Date());
        rolePermission.setDeleteFlag(1);
        boolean b = rolePermissionService.updateById(rolePermission);
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
        RolePermission rolePermission = rolePermissionService.selectById(id);
        model.addAttribute("rolePermission", rolePermission);
        return "admin/rolePermission/rolePermissionEdit";
    }
    
    /**
     * 编辑
     * @param 
     * @return
     */
    @PostMapping("/edit")
    @ResponseBody
    public Object edit(@Valid RolePermission rolePermission) {
        rolePermission.setUpdateTime(new Date());
        boolean b = rolePermissionService.updateById(rolePermission);
        if (b) {
            return renderSuccess("编辑成功！");
        } else {
            return renderError("编辑失败！");
        }
    }
}
