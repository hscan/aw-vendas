package br.com.infoscan.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infoscan.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{
	

}
