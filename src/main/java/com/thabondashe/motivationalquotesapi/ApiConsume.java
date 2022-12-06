package com.thabondashe.motivationalquotesapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thabondashe.motivationalquotesapi.model.Motivation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class ApiConsume {


    @Value("${RAPID_API_KEY}")
    private  String RAPID_API_KEY;

    @Autowired
    QuoteService service;



    @Scheduled(fixedRate = 5000)
    public void saveQuote() throws JsonProcessingException {
        String URI = "https://motivational-quotes1.p.rapidapi.com/motivation";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        ObjectMapper objectMapper = new ObjectMapper();


        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("X-RapidAPI-Key", RAPID_API_KEY);
        headers.add("X-RapidAPI-Host", "motivational-quotes1.p.rapidapi.com");
        Motivation motivation = new Motivation("value", "value");

        String value = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(motivation);

        HttpEntity<String> request = new HttpEntity<String>(value, headers);

        String result = restTemplate.postForObject(URI, request, String.class);
        Quote quote = QuoteHelper.parseQuote(result);
        service.save(quote);


        System.out.println(result);


    }


}
