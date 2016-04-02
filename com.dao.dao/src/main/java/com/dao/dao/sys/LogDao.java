/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.dao.dao.sys;

import com.dao.common.persistence.annotation.MyBatisDao;
import com.dao.dao.entity.sys.Log;
import com.dao.dao.persistence.CrudDao;

/**
 * 日志DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
