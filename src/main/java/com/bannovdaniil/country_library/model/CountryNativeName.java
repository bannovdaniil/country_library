package com.bannovdaniil.country_library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "COUNTRY_NATIVE_NAME", schema = "Public")
public class CountryNativeName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "COUNT_ID")
    private CountryName countryName;
}
