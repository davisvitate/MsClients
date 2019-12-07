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
	ClientRepoInterfaces clienterepositorio;
	
	@Override
	public Flux<Client> getAll() {
		// TODO Auto-generated method stub
		return  clienterepositorio.findAll();
	}

	@Override
	public Mono<Client> getById(String id) {
		// TODO Auto-generated method stub
		return clienterepositorio.findById(id);
	}

}
