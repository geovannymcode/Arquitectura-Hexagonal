package com.geovannycode.arquitectura.hexagonal.configuracion;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalConfig {

    public GlobalConfig() {}

    @Bean
    public JsonMapper getJsonMapper() {
        return new JsonMapper();
    }
}
