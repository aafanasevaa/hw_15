package aafanasyevaa.tests;

import aafanasyevaa.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static aafanasyevaa.config.Browser.CHROME;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTests {

    @Test
    public void LocalTest() {
        System.setProperty("env", "local");
        WebDriverConfig webConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        assertThat(webConfig.getBrowser()).isEqualTo(CHROME);
        assertThat(webConfig.getBrowserVersion()).isEqualTo("95.0");
    }

    @Test
    public void RemoteTest() {
        System.setProperty("env", "remote");
        WebDriverConfig webConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        assertThat(webConfig.getBrowser()).isEqualTo(CHROME);
        assertThat(webConfig.getBrowserVersion()).isEqualTo("95.0");
        assertThat(webConfig.getRemoteUrl()).isEqualTo(
              "https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }
}
