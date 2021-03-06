/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.dao.sys.modules.zb.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dao.common.config.Global;
import com.dao.common.persistence.Page;
import com.dao.common.web.BaseController;
import com.dao.common.utils.StringUtils;
import com.dao.sys.modules.zb.entity.ZbUser;
import com.dao.sys.modules.zb.service.ZbUserService;

/**
 * 直播用户管理Controller
 * @author dao
 * @version 2015-12-07
 */
@Controller
@RequestMapping(value = "${adminPath}/zb/zbUser")
public class ZbUserController extends BaseController {

	@Autowired
	private ZbUserService zbUserService;
	
	@ModelAttribute
	public ZbUser get(@RequestParam(required=false) String id) {
		ZbUser entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = zbUserService.get(id);
		}
		if (entity == null){
			entity = new ZbUser();
		}
		return entity;
	}
	
	@RequiresPermissions("zb:zbUser:view")
	@RequestMapping(value = {"list", ""})
	public String list(ZbUser zbUser, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ZbUser> page = zbUserService.findPage(new Page<ZbUser>(request, response), zbUser); 
		model.addAttribute("page", page);
		return "modules/zb/zbUserList";
	}

	@RequiresPermissions("zb:zbUser:view")
	@RequestMapping(value = "form")
	public String form(ZbUser zbUser, Model model) {
		model.addAttribute("zbUser", zbUser);
		return "modules/zb/zbUserForm";
	}

	@RequiresPermissions("zb:zbUser:edit")
	@RequestMapping(value = "save")
	public String save(ZbUser zbUser, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, zbUser)){
			return form(zbUser, model);
		}
		zbUserService.save(zbUser);
		addMessage(redirectAttributes, "保存用户成功");
		return "redirect:"+Global.getAdminPath()+"/zb/zbUser/?repage";
	}
	
	@RequiresPermissions("zb:zbUser:edit")
	@RequestMapping(value = "delete")
	public String delete(ZbUser zbUser, RedirectAttributes redirectAttributes) {
		zbUserService.delete(zbUser);
		addMessage(redirectAttributes, "删除用户成功");
		return "redirect:"+Global.getAdminPath()+"/zb/zbUser/?repage";
	}

}