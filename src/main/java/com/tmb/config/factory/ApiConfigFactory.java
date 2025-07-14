package com.tmb.config.factory;

import com.tmb.config.ApiConfig;
import com.tmb.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public class ApiConfigFactory {

    private ApiConfigFactory(){}

    public static ApiConfig getConfig(){
        return ConfigCache.getOrCreate(ApiConfig.class);
    }
}
