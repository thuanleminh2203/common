package com.venesa.common.config;

import com.venesa.common.Utils.EnvironmentConstant;
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

    public String getDomainMobio(){
        return  env.getProperty(EnvironmentConstant.MOBIO_URL);
    }

    public String getSourceBooking() {
        return  getDomainMobio() + env.getProperty(EnvironmentConstant.MOBIO_BOOKING);
    }

    public String getSourceContract() {
        return  getDomainMobio() + env.getProperty(EnvironmentConstant.MOBIO_CONTRACT);
    }

    public String getSourceIntroduceFriends() {
        return getDomainMobio()+ env.getProperty(EnvironmentConstant.MOBIO_INTRODUCE_FRIENDS);
    }

    public String getSourceImportCustomers() {
        return getDomainMobio()+ env.getProperty(EnvironmentConstant.MOBIO_IMPORT_CUSTOMERS);
    }

    public String getSourceDoneService() {
        return getDomainMobio()+ env.getProperty(EnvironmentConstant.MOBIO_DONE_SERVICE);
    }

    public String getSourceTransaction() {
        return getDomainMobio() + env.getProperty(EnvironmentConstant.MOBIO_TRANSACTION);
    }
    //===============================================================//
    public String getMobioToken() {
        return env.getProperty(EnvironmentConstant.MOBIO_TOKEN);
    }

    public String getXMerchantId() {
        return  env.getProperty(EnvironmentConstant.MOBIO_XMERCHANT_ID);
    }

    public String getSourceGateway(String typeData){
        return env.getProperty(EnvironmentConstant.GATEWAY_URL) + typeData;
    }
}
