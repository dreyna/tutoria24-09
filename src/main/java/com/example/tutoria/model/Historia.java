package com.example.tutoria.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Historia {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nomhistoria;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Libro_id")
	private Libro libro;
}
