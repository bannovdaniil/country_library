package com.bannovdaniil.country_library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "country_native_name", schema = "Public")
public class CountryNativeName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountryName countryName;
}
