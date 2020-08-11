package com.venesa.common.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;

@Configuration
@PropertySource("classpath:environment.properties")
@AllArgsConstructor
public class EnvironmentConfig {
    private final Environment env;

    public String getSourceBooking(HttpMethod method){
        return method.matches("POST") ? env.getProperty("mobio.url.booking.add") : env.getProperty("mobio.url.booking.update") ;
    }

    public String getSourceContract(HttpMethod method){
        return method.matches("POST") ? env.getProperty("mobio.url.contract.add") : env.getProperty("mobio.url.contract.update") ;
    }

    public String getSourceIntroduceFriends(){
        return env.getProperty("mobio.url.introduceFriend") ;
    }

    public String getSourceImportCustomers(){
        return env.getProperty("mobio.url.importCustomers") ;
    }

    public String getSourceDoneService(){
        return env.getProperty("mobio.url.doneService") ;
    }

    public String getSourceTransaction(){
        return env.getProperty("mobio.url.transaction") ;
    }

    public String getMobioToken(){
        return env.getProperty("mobio.token") ;
    }
}
