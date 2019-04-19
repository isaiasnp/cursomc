package com.isaias.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaias.cursomc.domain.Pedido;
import com.isaias.cursomc.repositories.PedidoRepository;
import com.isaias.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	//Automaticamente instancia a interface
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

}
