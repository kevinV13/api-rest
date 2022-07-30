package com.example.apirest.domain.services;

import com.example.apirest.domain.entities.Salida;
import com.example.apirest.domain.repositories.SalidaRepository;
import org.springframework.stereotype.Service;

@Service
public class SalidaService {
    private SalidaRepository salidaRepository;

    public SalidaService(SalidaRepository salidaRepository){
        this.salidaRepository=salidaRepository;
    }

    public Salida registrar(Salida salida){
        return salidaRepository.registrar(salida);
    }

}
