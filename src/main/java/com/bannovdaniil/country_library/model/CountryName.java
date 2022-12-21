package com.bannovdaniil.country_library.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "country_name", schema = "Public")
public class CountryName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "countryName")
    private List<CountryNativeName> countryNativeNames;
}
