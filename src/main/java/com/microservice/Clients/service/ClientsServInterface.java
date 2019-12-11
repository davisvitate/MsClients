package com.microservice.Clients.service;

import com.microservice.Clients.model.Client;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientsServInterface{
	
	public Flux<Client> findAll();
	
	public Mono<Client> findById(String id);
	
	public Mono<Client> save(Client cli);
	
	public Mono<Void> delete(String cli);
}
