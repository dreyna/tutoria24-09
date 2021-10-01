package com.example.tutoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tutoria.model.Libro;
@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{

}
