package com.gnerv.cloud.platform.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: shiro 配置
 * @author: Gnerv LiGen
 * @date: 2018-05-18
 **/
@Configuration
public class ShiroConfig {
	
    @Bean("shiroFilter")
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
        shiroFilter.setSecurityManager(securityManager);
        shiroFilter.setLoginUrl("/platform/login.html");
        Map<String, String> filterMap = new LinkedHashMap<>();
        filterMap.put("/sys/login", "anon");
        filterMap.put("/platform/plug/**", "anon");
        filterMap.put("/**", "authc");
        shiroFilter.setFilterChainDefinitionMap(filterMap);
        return shiroFilter;
    }

    @Bean
    public ShiroUserRealm myShiroRealm(){
        ShiroUserRealm myShiroRealm = new ShiroUserRealm();
        return myShiroRealm;
    }

    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager =  new DefaultWebSecurityManager();
        //设置realm.
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }


}
