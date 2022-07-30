package com.example.apirest.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "salidas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Salida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSalida;

    @Column(name="fechaSalida")
    private LocalDate fechaSalida;

    @Column(name="placa")
    private String placa;

    @Column(name="chofer")
    private String chofer;

}
