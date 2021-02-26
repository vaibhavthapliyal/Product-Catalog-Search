package com.catalogsearch.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalogsearch.application.entity.Color;

@Repository
public interface ColorRepository 
        extends JpaRepository<Color, Integer> {
}
