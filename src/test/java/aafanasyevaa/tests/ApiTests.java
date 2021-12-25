package aafanasyevaa.tests;

import aafanasyevaa.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTests {

    ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

    @Test
    public void CheckUrlTest() {
        assertThat(apiConfig.getBaseUrl()).isEqualTo("https://github.com");
    }

    @Test
    public void CheckTokenTest() {
        assertThat(apiConfig.getToken()).isEqualTo("token");
    }
}