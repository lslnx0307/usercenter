package com.sq.usercenter.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author lslnx_0307
 * @Date: 2018/10/12 16:23
 * @Description:
 */
@Configuration
@Slf4j
public class MyMvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
       System.out.println("进入拦截器......");
        registry.addInterceptor(new LoginInterceptorConfig()).addPathPatterns("/**");
    }
}
