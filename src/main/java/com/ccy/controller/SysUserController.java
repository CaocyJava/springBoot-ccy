package com.ccy.controller;

import com.ccy.model.SysUser;
import com.ccy.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author caocy
 * @date 2017-11-29
 */
@RestController
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public List<SysUser> show() {
		List<SysUser> list = this.sysUserService.show();
		return list;
	}
}
