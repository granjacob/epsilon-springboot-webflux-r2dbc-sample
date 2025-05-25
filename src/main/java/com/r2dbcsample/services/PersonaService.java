package com.r2dbcsample.services;

import com.r2dbcsample.model.PersonaR2dbc;
import com.r2dbcsample.repositories.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    public Flux<PersonaR2dbc> findAll() {
        return personaRepository.findAll();
    }


    public Mono<PersonaR2dbc> findById(UUID id) {
        return personaRepository.findById(id);
    }

    public Mono<PersonaR2dbc> save(PersonaR2dbc persona) {
        return personaRepository.save(persona);
    }


}
