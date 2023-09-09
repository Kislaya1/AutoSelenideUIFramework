package com.auto.selenide.ui.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/env.properties"
})
public interface IEnvConfig extends Config {
    @DefaultValue("prod")
    String environment();

    @Key("${environment}_url")
    String webUrl();

    @Key("${environment}_username")
    String username();

    @Key("${environment}_password")
    String password();
}
