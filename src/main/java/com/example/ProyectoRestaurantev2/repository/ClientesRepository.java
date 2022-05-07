package com.example.ProyectoRestaurantev2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProyectoRestaurantev2.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer>{

}
