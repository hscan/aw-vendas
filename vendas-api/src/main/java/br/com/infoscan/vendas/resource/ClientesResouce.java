package br.com.infoscan.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infoscan.vendas.model.Cliente;
import br.com.infoscan.vendas.repository.Clientes;

@CrossOrigin("*")
@RestController
@RequestMapping("/clientes")
public class ClientesResouce {
	
	@Autowired
	private Clientes clientes;
	 
	@GetMapping
	public List<Cliente> listar(){
		return clientes.findAll();
	}

}
