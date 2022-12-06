package com.thabondashe.motivationalquotesapi;


import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class QuoteHelper {



    public static Quote parseQuote(String result) {
        String[] quote = result.split("-");
        Quote newQuote = new Quote(quote[0], quote[1], LocalDateTime.now());
        return newQuote;
    }


}
