package com.example.ProyectoRestaurantev2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProyectoRestaurantev2.model.CategoriaProducto;

@Repository
public interface CategoriaRepositorio extends JpaRepository<CategoriaProducto, Integer>{

}
