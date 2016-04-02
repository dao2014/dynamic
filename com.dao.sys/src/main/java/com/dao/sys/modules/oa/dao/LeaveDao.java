/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.dao.sys.modules.oa.dao;

import com.dao.common.persistence.annotation.MyBatisDao;
import com.dao.dao.persistence.CrudDao;
import com.dao.sys.modules.oa.entity.Leave;

/**
 * 请假DAO接口
 * @author liuj
 * @version 2013-8-23
 */
@MyBatisDao
public interface LeaveDao extends CrudDao<Leave> {
	
	/**
	 * 更新流程实例ID
	 * @param leave
	 * @return
	 */
	public int updateProcessInstanceId(Leave leave);
	
	/**
	 * 更新实际开始结束时间
	 * @param leave
	 * @return
	 */
	public int updateRealityTime(Leave leave);
	
}
