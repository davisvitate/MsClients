package com.microservice.Clients.service;

import com.microservice.Clients.model.Client;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientsServInterface{
	Flux<Client> getAll();
	Mono<Client> getById(String id);
}
