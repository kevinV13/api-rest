package com.example.apirest.infraestructure.repositories;

import com.example.apirest.domain.entities.Salida;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalidaJpaRepository extends JpaRepository<Salida,Integer> {

}
