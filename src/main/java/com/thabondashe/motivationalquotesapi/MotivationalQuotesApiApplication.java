package com.thabondashe.motivationalquotesapi;

import com.thabondashe.motivationalquotesapi.model.Motivation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class MotivationalQuotesApiApplication implements CommandLineRunner {

    @Autowired
    ApiConsume apiConsume;




    public static void main(String[] args) {
        SpringApplication.run(MotivationalQuotesApiApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        this.apiConsume.saveQuote();

    }
}
