package com.microservice.Clients.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.Clients.model.Client;
import com.microservice.Clients.service.ClientsServInterface;
import com.microservice.Clients.service.ClientsServiceImp;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/client")
public class ClientesController {
	
	@Autowired
	ClientsServiceImp clienteservicios;
	
	@GetMapping("/all")
	public Flux<Client> getAll(){
		return clienteservicios.getAll();
	}
	
	@GetMapping("/{id}")
	public Mono<Client> getById(@PathVariable String id){
		return clienteservicios.getById(id);
	}
}
