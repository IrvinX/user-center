package com.footprint.common.config;

import com.footprint.common.config.shiro.ShiroPropertiesHolder;
import com.footprint.service.PasswordHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sunb on 17-4-7.
 */
@Configuration
public class PasswordHelperConfig {

    @Autowired
    private ShiroPropertiesHolder holder;

    @Bean(name = "passwordHelper")
    public PasswordHelper getpasswordHelper() {

        //String algorithmName = env.getProperty("shiro.matcher.hashAlgorithmName");
        //int hashIterations = Integer.parseInt(env.getProperty("shiro.matcher.hashIteration"));

        PasswordHelper passwordHelper = new PasswordHelper();
        passwordHelper.setAlgorithmName(holder.getMatcherHashAlgorithmName());
        passwordHelper.setHashIterations(holder.getMatcherHashIteration());
        return passwordHelper;
    }
}
