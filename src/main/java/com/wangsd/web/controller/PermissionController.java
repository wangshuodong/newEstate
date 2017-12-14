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
import com.wangsd.web.model.Permission;
import com.wangsd.web.service.IPermissionService;
import com.wangsd.commons.base.BaseController;

/**
 * <p>
 * 权限表 前端控制器
 * </p>
 *
 * @author wangsd
 * @since 2017-12-14
 */
@Controller
@RequestMapping("/permission")
public class PermissionController extends BaseController {

    @Autowired private IPermissionService permissionService;
    
    @GetMapping("/manager")
    public String manager() {
        return "admin/permission/permissionList";
    }
    
    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(Permission permission, Integer page, Integer rows, String sort,String order) {
        PageInfo pageInfo = new PageInfo(page, rows, sort, order);
        EntityWrapper<Permission> ew = new EntityWrapper<Permission>(permission);
        Page<Permission> pages = getPage(pageInfo);
        pages = permissionService.selectPage(pages, ew);
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
        return "admin/permission/permissionAdd";
    }
    
    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(@Valid Permission permission) {
        permission.setCreateTime(new Date());
        permission.setUpdateTime(new Date());
        permission.setDeleteFlag(0);
        boolean b = permissionService.insert(permission);
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
        Permission permission = new Permission();
        permission.setId(id);
        permission.setUpdateTime(new Date());
        permission.setDeleteFlag(1);
        boolean b = permissionService.updateById(permission);
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
        Permission permission = permissionService.selectById(id);
        model.addAttribute("permission", permission);
        return "admin/permission/permissionEdit";
    }
    
    /**
     * 编辑
     * @param 
     * @return
     */
    @PostMapping("/edit")
    @ResponseBody
    public Object edit(@Valid Permission permission) {
        permission.setUpdateTime(new Date());
        boolean b = permissionService.updateById(permission);
        if (b) {
            return renderSuccess("编辑成功！");
        } else {
            return renderError("编辑失败！");
        }
    }
}
