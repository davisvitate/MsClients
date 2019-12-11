package com.microservice.Clients.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.Clients.model.Client;
import com.microservice.Clients.repository.ClientRepoInterfaces;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientsServiceImp implements ClientsServInterface{

	@Autowired
	ClientRepoInterfaces clientrepositori;
	
	@Override
	public Flux<Client> findAll() {
	
		return  clientrepositori.findAll();
	}

	@Override
	public Mono<Client> findById(String id) {
		
		return clientrepositori.findById(id);
	}


	@Override
	public Mono<Client> save(Client cli) {
		
		return clientrepositori.save(cli);
	}

	@Override
	public Mono<Void> delete(String id) {
		
		return clientrepositori.deleteById(id);
	}

	

}
