/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.dao.server.sys;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.common.persistence.Page;
import com.dao.dao.entity.sys.SysDatesorces;
import com.dao.dao.sys.SysDatesorcesDao;
import com.dao.service.CrudService;

/**
 * 动态数据库设置Service
 * @author dao
 * @version 2015-12-03
 */
@Service
@Transactional(readOnly = true)
public class SysDatesorcesService extends CrudService<SysDatesorcesDao, SysDatesorces> {

	public SysDatesorces get(String id) {
		return super.get(id);
	}
	
	public List<SysDatesorces> findList(SysDatesorces sysDatesorces) {
		return super.findList(sysDatesorces);
	}
	
	public Page<SysDatesorces> findPage(Page<SysDatesorces> page, SysDatesorces sysDatesorces) {
		return super.findPage(page, sysDatesorces);
	}
	
	@Transactional(readOnly = false)
	public void save(SysDatesorces sysDatesorces) {
		super.save(sysDatesorces);
	}
	
	@Transactional(readOnly = false)
	public void delete(SysDatesorces sysDatesorces) {
		super.delete(sysDatesorces);
	}
	
}