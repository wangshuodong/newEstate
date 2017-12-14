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
import com.wangsd.web.model.Users;
import com.wangsd.web.service.IUsersService;
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
@RequestMapping("/users")
public class UsersController extends BaseController {

    @Autowired private IUsersService usersService;
    
    @GetMapping("/manager")
    public String manager() {
        return "admin/users/usersList";
    }
    
    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(Users users, Integer page, Integer rows, String sort,String order) {
        PageInfo pageInfo = new PageInfo(page, rows, sort, order);
        EntityWrapper<Users> ew = new EntityWrapper<Users>(users);
        Page<Users> pages = getPage(pageInfo);
        pages = usersService.selectPage(pages, ew);
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
        return "admin/users/usersAdd";
    }
    
    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(@Valid Users users) {
        users.setCreateTime(new Date());
        users.setUpdateTime(new Date());
        users.setDeleteFlag(0);
        boolean b = usersService.insert(users);
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
        Users users = new Users();
        users.setId(id);
        users.setUpdateTime(new Date());
        users.setDeleteFlag(1);
        boolean b = usersService.updateById(users);
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
        Users users = usersService.selectById(id);
        model.addAttribute("users", users);
        return "admin/users/usersEdit";
    }
    
    /**
     * 编辑
     * @param 
     * @return
     */
    @PostMapping("/edit")
    @ResponseBody
    public Object edit(@Valid Users users) {
        users.setUpdateTime(new Date());
        boolean b = usersService.updateById(users);
        if (b) {
            return renderSuccess("编辑成功！");
        } else {
            return renderError("编辑失败！");
        }
    }
}
