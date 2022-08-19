package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}