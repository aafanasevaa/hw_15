package aafanasyevaa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/api.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("token")
    String getToken();
}
