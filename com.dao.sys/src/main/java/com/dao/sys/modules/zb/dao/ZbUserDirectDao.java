/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.dao.sys.modules.zb.dao;

import com.dao.common.persistence.annotation.MyBatisDao;
import com.dao.dao.persistence.CrudDao;
import com.dao.sys.modules.zb.entity.ZbUserDirect;

/**
 * 直播列表管理需要审查DAO接口
 * @author dao
 * @version 2015-12-07
 */
@MyBatisDao
public interface ZbUserDirectDao extends CrudDao<ZbUserDirect> {
	
}