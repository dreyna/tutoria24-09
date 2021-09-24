package com.example.tutoria.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutoria.model.Contacto;
import com.example.tutoria.service.ContactoService;



@RestController
@RequestMapping("/api/contactos")
public class ContactoController {

	@Autowired
	private ContactoService contactoService;
	@PostMapping("/create")
	public ResponseEntity<Contacto> save(@RequestBody Contacto contacto){
		try {
			Contacto con = contactoService.create(contacto);
			return new ResponseEntity<>(con, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
