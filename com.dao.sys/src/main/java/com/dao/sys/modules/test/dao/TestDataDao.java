/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.dao.sys.modules.test.dao;

import com.dao.common.persistence.annotation.MyBatisDao;
import com.dao.dao.persistence.CrudDao;
import com.dao.sys.modules.test.entity.TestData;

/**
 * 单表生成DAO接口
 * @author ThinkGem
 * @version 2015-12-11
 */
@MyBatisDao
public interface TestDataDao extends CrudDao<TestData> {
	
}