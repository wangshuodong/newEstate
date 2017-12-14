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
import com.wangsd.web.model.Serviceinfo;
import com.wangsd.web.service.IServiceinfoService;
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
@RequestMapping("/serviceinfo")
public class ServiceinfoController extends BaseController {

    @Autowired private IServiceinfoService serviceinfoService;
    
    @GetMapping("/manager")
    public String manager() {
        return "admin/serviceinfo/serviceinfoList";
    }
    
    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(Serviceinfo serviceinfo, Integer page, Integer rows, String sort,String order) {
        PageInfo pageInfo = new PageInfo(page, rows, sort, order);
        EntityWrapper<Serviceinfo> ew = new EntityWrapper<Serviceinfo>(serviceinfo);
        Page<Serviceinfo> pages = getPage(pageInfo);
        pages = serviceinfoService.selectPage(pages, ew);
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
        return "admin/serviceinfo/serviceinfoAdd";
    }
    
    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(@Valid Serviceinfo serviceinfo) {
        serviceinfo.setCreateTime(new Date());
        serviceinfo.setUpdateTime(new Date());
        serviceinfo.setDeleteFlag(0);
        boolean b = serviceinfoService.insert(serviceinfo);
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
        Serviceinfo serviceinfo = new Serviceinfo();
        serviceinfo.setId(id);
        serviceinfo.setUpdateTime(new Date());
        serviceinfo.setDeleteFlag(1);
        boolean b = serviceinfoService.updateById(serviceinfo);
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
        Serviceinfo serviceinfo = serviceinfoService.selectById(id);
        model.addAttribute("serviceinfo", serviceinfo);
        return "admin/serviceinfo/serviceinfoEdit";
    }
    
    /**
     * 编辑
     * @param 
     * @return
     */
    @PostMapping("/edit")
    @ResponseBody
    public Object edit(@Valid Serviceinfo serviceinfo) {
        serviceinfo.setUpdateTime(new Date());
        boolean b = serviceinfoService.updateById(serviceinfo);
        if (b) {
            return renderSuccess("编辑成功！");
        } else {
            return renderError("编辑失败！");
        }
    }
}
