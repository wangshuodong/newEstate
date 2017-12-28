package com.wangsd.commons.interceptor;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wangsd.commons.scan.SpringUtils;
import com.wangsd.web.model.SysMenu;
import com.wangsd.web.service.ISysMenuService;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 全局拦截器
 * @author jameszhou
 *
 */
public class GlobalInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub

		if (handler instanceof HandlerMethod) {
			
			/**
			 * 保存登录信息
			 */
//			Users me = ShiroUtil.getSessionUser();
//			if(me == null){
//				return true;
//			}
//			me.setPassword("");
//			request.setAttribute("me", me);
//			/**
//			 * 资源和当前选中菜单
//			 */
//			String res = request.getParameter("p");
//			if (StringUtils.isNotBlank(res)) {
//				request.getSession().setAttribute("res", res);
//			}
//			String cur = request.getParameter("t");
//			if (StringUtils.isNotBlank(cur)) {
//				request.getSession().setAttribute("cur", cur);
//			}
			/**
			 * 获取当前用户的菜单
			 */
//			List<TreeMenu> treeMenus = SpringUtil.getBean(ISysMenuService.class).selectTreeMenuByUserId(1);
//			request.setAttribute("treeMenus", treeMenus);
			List<Object> list = SpringUtils.getBean(ISysMenuService.class).selectObjs(new EntityWrapper<SysMenu>().setSqlSelect("id"));
			System.out.println("----------");
		}

		/**
		 * 通过拦截
		 */
		return true;
	}

}
