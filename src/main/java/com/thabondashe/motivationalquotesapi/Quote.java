package com.thabondashe.motivationalquotesapi;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT")
    private Integer quoteId;

    private String quote;

    private String author;

    private LocalDateTime uploaded;

    public Quote() {

    }

    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public Quote(String quote, String author, LocalDateTime uploaded) {
        this.quote = quote;
        this.author = author;
        this.uploaded = uploaded;
    }


    public LocalDateTime getUploaded() {
        return uploaded;
    }

    public void setUploaded(LocalDateTime uploaded) {
        this.uploaded = uploaded;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
