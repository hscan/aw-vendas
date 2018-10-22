package br.com.infoscan.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infoscan.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
