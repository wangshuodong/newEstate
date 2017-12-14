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
import com.wangsd.web.model.Menu;
import com.wangsd.web.service.IMenuService;
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
@RequestMapping("/menu")
public class MenuController extends BaseController {

    @Autowired private IMenuService menuService;
    
    @GetMapping("/manager")
    public String manager() {
        return "admin/menu/menuList";
    }
    
    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(Menu menu, Integer page, Integer rows, String sort,String order) {
        PageInfo pageInfo = new PageInfo(page, rows, sort, order);
        EntityWrapper<Menu> ew = new EntityWrapper<Menu>(menu);
        Page<Menu> pages = getPage(pageInfo);
        pages = menuService.selectPage(pages, ew);
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
        return "admin/menu/menuAdd";
    }
    
    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(@Valid Menu menu) {
        menu.setCreateTime(new Date());
        menu.setUpdateTime(new Date());
        menu.setDeleteFlag(0);
        boolean b = menuService.insert(menu);
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
        Menu menu = new Menu();
        menu.setId(id);
        menu.setUpdateTime(new Date());
        menu.setDeleteFlag(1);
        boolean b = menuService.updateById(menu);
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
        Menu menu = menuService.selectById(id);
        model.addAttribute("menu", menu);
        return "admin/menu/menuEdit";
    }
    
    /**
     * 编辑
     * @param 
     * @return
     */
    @PostMapping("/edit")
    @ResponseBody
    public Object edit(@Valid Menu menu) {
        menu.setUpdateTime(new Date());
        boolean b = menuService.updateById(menu);
        if (b) {
            return renderSuccess("编辑成功！");
        } else {
            return renderError("编辑失败！");
        }
    }
}
