package com.bannovdaniil.country_library.controller;

import com.bannovdaniil.country_library.service.CountrySearchService;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
@Slf4j
public class CountrySearchController {
    CountrySearchService countrySearchService;

    @GetMapping("/countrybyname")
    public ResponseEntity<Object> searchCountyByName(@NotNull @RequestParam(name = "name") String name) {
        log.info("get County: {}", name);
        return countrySearchService.getCountryByName(name);
    }

    @GetMapping("/countrybynativename")
    public String searchCountyNameByNativeName(@NotNull @RequestParam(name = "name") String nativeName) {
        log.info("get County: {}", nativeName);
        return countrySearchService.getCountyNameByNativeName(nativeName);
    }

    @GetMapping("/nativename")
    public String getCountyNameByNativeName(@NotNull @RequestParam(name = "name") String nativeName) {
        log.info("get County: {}", nativeName);
        return countrySearchService.getCountyNameByNativeName(nativeName);
    }

    @GetMapping("/allnativename")
    public List<String> getAllNativeNameOfCounty(@NotNull @RequestParam(name = "name") String nativeName) {
        log.info("get County: {}", nativeName);
        return countrySearchService.getAllNativeNameOfCounty(nativeName);
    }

}
