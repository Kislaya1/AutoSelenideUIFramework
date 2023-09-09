package com.auto.selenide.ui.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/prod-config.properties"
})
public interface IEnvConfig extends Config {
    @DefaultValue("prod")
    String environment();

    @Key("${environment}.url")
    String webUrl();
}
