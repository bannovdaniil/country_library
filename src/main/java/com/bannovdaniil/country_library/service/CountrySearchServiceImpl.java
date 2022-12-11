package com.bannovdaniil.country_library.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountrySearchServiceImpl implements CountrySearchService {
    @Override
    public String getCountyNameByNativeName(String name) {
        // TODO get name form DB
        return null;
    }

    @Override
    public ResponseEntity<Object> getCountryByName(String name) {
        return null;
    }

    @Override
    public List<String> getAllNativeNameOfCounty(String nativeName) {
        return null;
    }
}
