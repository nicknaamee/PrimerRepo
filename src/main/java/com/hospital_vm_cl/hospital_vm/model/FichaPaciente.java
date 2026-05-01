package com.hospital_vm_cl.hospital_vm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FichaPaciente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id_paciente;

    @Column(unique=true, length=100,nullable=false)
    private String datos_personales;

    @Column(unique=true, length=100,nullable=false)
    private String datos_personales2;

    @Column(unique=true, length=100,nullable=false)
    private String datos_personales3;

    @Column(unique=true, length=100,nullable=false)
    private String datos_personales4;

    @Column(unique=true, length=100,nullable=false)
    private String datos_personales5;

    @Column(unique=true, length=100,nullable=false)
    private String datos_personales6;

}
