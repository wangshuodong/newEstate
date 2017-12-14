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
import com.wangsd.web.model.Propertyinfo;
import com.wangsd.web.service.IPropertyinfoService;
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
@RequestMapping("/propertyinfo")
public class PropertyinfoController extends BaseController {

    @Autowired private IPropertyinfoService propertyinfoService;
    
    @GetMapping("/manager")
    public String manager() {
        return "admin/propertyinfo/propertyinfoList";
    }
    
    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(Propertyinfo propertyinfo, Integer page, Integer rows, String sort,String order) {
        PageInfo pageInfo = new PageInfo(page, rows, sort, order);
        EntityWrapper<Propertyinfo> ew = new EntityWrapper<Propertyinfo>(propertyinfo);
        Page<Propertyinfo> pages = getPage(pageInfo);
        pages = propertyinfoService.selectPage(pages, ew);
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
        return "admin/propertyinfo/propertyinfoAdd";
    }
    
    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(@Valid Propertyinfo propertyinfo) {
        propertyinfo.setCreateTime(new Date());
        propertyinfo.setUpdateTime(new Date());
        propertyinfo.setDeleteFlag(0);
        boolean b = propertyinfoService.insert(propertyinfo);
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
        Propertyinfo propertyinfo = new Propertyinfo();
        propertyinfo.setId(id);
        propertyinfo.setUpdateTime(new Date());
        propertyinfo.setDeleteFlag(1);
        boolean b = propertyinfoService.updateById(propertyinfo);
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
        Propertyinfo propertyinfo = propertyinfoService.selectById(id);
        model.addAttribute("propertyinfo", propertyinfo);
        return "admin/propertyinfo/propertyinfoEdit";
    }
    
    /**
     * 编辑
     * @param 
     * @return
     */
    @PostMapping("/edit")
    @ResponseBody
    public Object edit(@Valid Propertyinfo propertyinfo) {
        propertyinfo.setUpdateTime(new Date());
        boolean b = propertyinfoService.updateById(propertyinfo);
        if (b) {
            return renderSuccess("编辑成功！");
        } else {
            return renderError("编辑失败！");
        }
    }
}
