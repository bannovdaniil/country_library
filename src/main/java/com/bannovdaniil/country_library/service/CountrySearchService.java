package com.bannovdaniil.country_library.service;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CountrySearchService {
    String getCountyNameByNativeName(String name);

    ResponseEntity<Object> getCountryByName(String name);

    List<String> getAllNativeNameOfCounty(String nativeName);
}
