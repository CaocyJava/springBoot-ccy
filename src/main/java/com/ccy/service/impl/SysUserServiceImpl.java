package com.ccy.service.impl;

import com.ccy.dao.SysUserDao;
import com.ccy.model.SysUser;
import com.ccy.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author caocy
 * @date 2017-11-29
 */
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserDao sysUserDao;

	@Override
	public List<SysUser> show() {
		return this.sysUserDao.show();
	}
}
