package com.dao.sys.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.common.dataSource.DBContextHolder;
import com.dao.common.dataSource.DynamicDataSource;

@Component
@Aspect
public class DateSourceAop {
	
	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	DynamicDataSource  dynamicDataSource;
	
	
	@Pointcut("execution(* com.dao.sys.modules.zb.service.*.*(..)) or execution(* com.dao.sys.common.persistence.interceptor.intercept(..)) ")
	public void startUserSource(){
	}
	
	
	@Before("startUserSource()")  
    public void setDynamicDataSource(JoinPoint jp) {  
		DBContextHolder.setDBType("1"); 
    } 
	
	@After("startUserSource()")
	public void killSrouse(JoinPoint jp){
		DBContextHolder.clearDBType();
	}
	
}
