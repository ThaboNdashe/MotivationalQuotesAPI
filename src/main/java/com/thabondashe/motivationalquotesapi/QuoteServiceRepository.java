package com.thabondashe.motivationalquotesapi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuoteServiceRepository extends CrudRepository<Quote,Integer>{


}
