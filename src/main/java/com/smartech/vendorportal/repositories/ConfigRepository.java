package com.smartech.vendorportal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartech.vendorportal.entities.Config;

@Repository
public interface ConfigRepository  extends JpaRepository<Config , Long> {

}
