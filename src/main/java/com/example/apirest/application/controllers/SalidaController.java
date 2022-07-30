package com.example.apirest.application.controllers;

import com.example.apirest.domain.entities.Salida;
import com.example.apirest.domain.services.SalidaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salida")
public class SalidaController {
    private final SalidaService salidaService;

    public SalidaController(SalidaService salidaService){
        this.salidaService=salidaService;
    }
    @PostMapping("/registrar")
    public ResponseEntity<Salida> registrar(Salida salida){
        Salida salidaNew = salidaService.registrar(salida);
        return new ResponseEntity<>(salidaNew, HttpStatus.CREATED);
    }

}
