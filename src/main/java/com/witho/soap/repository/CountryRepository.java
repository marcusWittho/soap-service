package com.witho.soap.repository;

import com.example.generated.Country;
import com.example.generated.Currency;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

  private static final Map<String, Country> countries = new HashMap<>();

  @PostConstruct
  public void initData() {
    Country country1 = new Country();
    country1.setName("Spain");
    country1.setPopulation(46704314);
    country1.setCapital("Madrid");
    country1.setCurrency(Currency.valueOf("EUR"));
    countries.put(country1.getName(), country1);

    Country country2 = new Country();
    country2.setName("Brasil");
    country2.setPopulation(203080756);
    country2.setCapital("Brasilia");
    country2.setCurrency(Currency.valueOf("BRL"));
    countries.put(country2.getName(), country2);
  }

  public Country findCountry(String name) {
    return countries.get(name);
  }
}
