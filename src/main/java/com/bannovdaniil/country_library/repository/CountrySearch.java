package com.bannovdaniil.country_library.repository;

import com.bannovdaniil.country_library.model.CountryName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountrySearch extends JpaRepository<CountryName, Long> {

}
