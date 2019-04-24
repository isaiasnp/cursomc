package com.isaias.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaias.cursomc.domain.Cliente;
import com.isaias.cursomc.repositories.ClienteRepository;
import com.isaias.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	//Automaticamente instancia a interface
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
