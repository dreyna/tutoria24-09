package com.example.tutoria.service;

import java.util.List;

import com.example.tutoria.model.Libro;

public interface LibroService {
	
	Libro create(Libro libro);
	List<Libro> readAll();
	
}
