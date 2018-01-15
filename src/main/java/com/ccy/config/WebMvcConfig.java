package com.ccy.config;

import com.ccy.interceptor.AccessTokenVerifyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author caocy
 * @date 2017-12-05
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{

	@Bean
	public AccessTokenVerifyInterceptor tokenVerifyInterceptor() {
		return new AccessTokenVerifyInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/*");
		super.addInterceptors(registry);
	}

}
