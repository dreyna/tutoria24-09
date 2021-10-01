package com.example.tutoria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutoria.model.Libro;
import com.example.tutoria.repository.LibroRepository;
@Service
public class LibroServiceImpl implements LibroService{
@Autowired
private LibroRepository libroRepository;
	@Override
	public Libro create(Libro libro) {
		// TODO Auto-generated method stub
		return libroRepository.save(libro);
	}

	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return libroRepository.findAll();
	}

}
