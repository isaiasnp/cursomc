package com.isaias.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaias.cursomc.domain.Categoria;
import com.isaias.cursomc.repositories.CategoriaRepository;
import com.isaias.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	//Automaticamente instancia a interface
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
