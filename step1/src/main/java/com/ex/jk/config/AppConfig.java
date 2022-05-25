package com.ex.jk.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilterRegistrationBean baseFilterRegister(){
        FilterRegistrationBean regBean = new FilterRegistrationBean(new BaseFilter());
        regBean.setOrder(1);
        return regBean;
    }

    @Bean
    public FilterRegistrationBean nextFilterRegister(){
        FilterRegistrationBean fBean = new FilterRegistrationBean(new NextFilter());
        fBean.setOrder(2);
        return fBean;
    }

}
