package com.isaias.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isaias.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	//Não precisa ser envolvida coma uma transação de banco de dados
	// faz ela ficar mais rapida e evita o lock
	@Transactional(readOnly = true)
	Cliente findByEmail(String email);

}
