package com.microservice.Clients.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.microservice.Clients.model.Client;
//import com.microservice.Clients.service.ClientsServInterface;
import com.microservice.Clients.service.ClientsServiceImp;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/client")
public class ClientesController {
	
	//@Autowired
	//ClientsServInterface clienteserviciosintef;
	
	@Autowired
	ClientsServiceImp clienteservicios;
	
	@GetMapping("/all")
	public Flux<Client> findAll(){
		return clienteservicios.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<Client> getById(@PathVariable String id){
		return clienteservicios.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Mono<Void>deleteById(@PathVariable String id){
		return clienteservicios.delete(id);
	} 
	@PutMapping("/update")
	public Mono<Client> update(@RequestBody final Client cli){
		return clienteservicios.save(cli);
	}
	
	//@PutMapping("/update/{id}")
	//public Mono<Client> updateClient(@PathVariable String Id) {
	//	 return clienteservicios.findById(Id)
		//   .flatMap(clienteservicios::save)
		//   .switchIfEmpty(Mono.error(new Exception("cliente no encontrado")));
		//}
	
	@PostMapping("/insert")
	public Mono<Client> addClient(@RequestBody final Client cli){
		return clienteservicios.save(cli);
	}
}
