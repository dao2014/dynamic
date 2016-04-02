/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.dao.sys.modules.zb.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.common.persistence.Page;
import com.dao.service.CrudService;
import com.dao.sys.modules.zb.dao.ZbUserDao;
import com.dao.sys.modules.zb.entity.ZbUser;

/**
 * 直播用户管理Service
 * @author dao
 * @version 2015-12-07
 */
@Service
@Transactional(propagation=Propagation.NOT_SUPPORTED)
public class ZbUserService extends CrudService<ZbUserDao, ZbUser> {

	public ZbUser get(String id) {
		return super.get(id);
	}
	
	public List<ZbUser> findList(ZbUser zbUser) {
		return super.findList(zbUser);
	}
	
	public Page<ZbUser> findPage(Page<ZbUser> page, ZbUser zbUser) {
		return super.findPage(page, zbUser);
	}
	
	public void save(ZbUser zbUser) {
		super.save(zbUser);
	}
	
	public void delete(ZbUser zbUser) {
		super.delete(zbUser);
	}
	
}