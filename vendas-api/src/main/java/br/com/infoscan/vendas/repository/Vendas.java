package br.com.infoscan.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infoscan.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
