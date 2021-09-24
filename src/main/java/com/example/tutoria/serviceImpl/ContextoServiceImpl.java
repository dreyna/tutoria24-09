package com.example.tutoria.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutoria.model.Contacto;
import com.example.tutoria.repository.ContactoRepository;
import com.example.tutoria.service.ContactoService;
@Service
public class ContextoServiceImpl implements ContactoService{

	@Autowired
	private ContactoRepository contactoRepository;
	@Override
	public Contacto create(Contacto contact) {
		// TODO Auto-generated method stub
		return contactoRepository.save(contact);
	}

}
