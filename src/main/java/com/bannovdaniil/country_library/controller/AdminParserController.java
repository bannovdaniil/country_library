package com.bannovdaniil.country_library.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminParserController {

    @GetMapping("/parser")
    public String searchCountyByName() {
        log.info("admin Parse: ");
        return null;
    }
}
