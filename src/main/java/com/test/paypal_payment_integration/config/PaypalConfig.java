package com.test.paypal_payment_integration.config;

import com.paypal.base.rest.APIContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaypalConfig {

    private String clientId = "your clientId";
    private String clientSecret = "your clientsecret";
    private String mode = "sandbox"; // just pour le test si l'application reel on utilise live mode

// Ou ( check application.yml
////    @Value("${paypal.client-id}")
//    private String clientId;
//
//    @Value("${paypal.client-secret}")
//    private String clientSecret;
//
//    @Value("${paypal.mode}")
//    private String mode;


    @Bean
    public APIContext apiContext(){
        return new APIContext(clientId,clientSecret,mode);
    }
}
