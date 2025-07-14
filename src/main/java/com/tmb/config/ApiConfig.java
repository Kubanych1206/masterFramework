package com.tmb.config;


import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/api-config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface ApiConfig extends  Config{

    @Key("api.baseurl")
    String apiBaseUrl();

    @Key("list.users")
    String listUserEndPoint();
}
