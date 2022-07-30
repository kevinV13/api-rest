package com.example.apirest.infraestructure.repositories;

import com.example.apirest.domain.entities.Salida;
import com.example.apirest.domain.repositories.SalidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalidaRepositoryImpl implements SalidaRepository {
    @Autowired
    SalidaJpaRepository db;
    @Override
    public Salida registrar(Salida salida){
        return db.save(salida);
    }
}
