package com.atguigu.gulimall.pms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity
@Configuration
public class PmsSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected  void configure(HttpSecurity http) throws  Exception{
        //super.configure(http);
        http.authorizeRequests().antMatchers("/**").permitAll();

        //csrf功能得关闭
        http.csrf().disable();
    }
}
