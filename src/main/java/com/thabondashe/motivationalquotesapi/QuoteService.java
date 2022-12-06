package com.thabondashe.motivationalquotesapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    @Autowired private QuoteServiceRepository repository;

    public void save(Quote quote) {
        repository.save(quote);
    }
}
