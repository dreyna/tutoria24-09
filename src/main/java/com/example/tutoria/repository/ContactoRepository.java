package com.example.tutoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tutoria.model.Contacto;
@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Long>{

}
