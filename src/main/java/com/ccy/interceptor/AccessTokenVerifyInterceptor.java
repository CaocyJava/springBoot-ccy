package com.ccy.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author caocy
 * @date 2017-12-05
 */
@Component
public class AccessTokenVerifyInterceptor extends HandlerInterceptorAdapter{

	private final static Logger log = LoggerFactory.getLogger(AccessTokenVerifyInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		log.info("进入了拦截器...");
		boolean flag = true;
		return flag;
	}
}
