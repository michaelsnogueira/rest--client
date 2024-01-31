package br.com.nogueira.restclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {
    @Bean
    RestClient crud() {
        return RestClient.create("https://crudcrud.com/api/a9865e3474d94d04825e2d64ba798fe6");
    }
}
