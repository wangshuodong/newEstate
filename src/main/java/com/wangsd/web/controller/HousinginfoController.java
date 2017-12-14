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
import com.wangsd.web.model.Housinginfo;
import com.wangsd.web.service.IHousinginfoService;
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
@RequestMapping("/housinginfo")
public class HousinginfoController extends BaseController {

    @Autowired private IHousinginfoService housinginfoService;
    
    @GetMapping("/manager")
    public String manager() {
        return "admin/housinginfo/housinginfoList";
    }
    
    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(Housinginfo housinginfo, Integer page, Integer rows, String sort,String order) {
        PageInfo pageInfo = new PageInfo(page, rows, sort, order);
        EntityWrapper<Housinginfo> ew = new EntityWrapper<Housinginfo>(housinginfo);
        Page<Housinginfo> pages = getPage(pageInfo);
        pages = housinginfoService.selectPage(pages, ew);
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
        return "admin/housinginfo/housinginfoAdd";
    }
    
    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(@Valid Housinginfo housinginfo) {
        housinginfo.setCreateTime(new Date());
        housinginfo.setUpdateTime(new Date());
        housinginfo.setDeleteFlag(0);
        boolean b = housinginfoService.insert(housinginfo);
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
        Housinginfo housinginfo = new Housinginfo();
        housinginfo.setId(id);
        housinginfo.setUpdateTime(new Date());
        housinginfo.setDeleteFlag(1);
        boolean b = housinginfoService.updateById(housinginfo);
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
        Housinginfo housinginfo = housinginfoService.selectById(id);
        model.addAttribute("housinginfo", housinginfo);
        return "admin/housinginfo/housinginfoEdit";
    }
    
    /**
     * 编辑
     * @param 
     * @return
     */
    @PostMapping("/edit")
    @ResponseBody
    public Object edit(@Valid Housinginfo housinginfo) {
        housinginfo.setUpdateTime(new Date());
        boolean b = housinginfoService.updateById(housinginfo);
        if (b) {
            return renderSuccess("编辑成功！");
        } else {
            return renderError("编辑失败！");
        }
    }
}
