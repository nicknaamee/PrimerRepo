package com.hospital_vm_cl.hospital_vm.model;
import java.util.Date;

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
public class Atencion {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique=true, length=10,nullable=false)
    private Integer id_paciente;

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique=true, length=10,nullable=false)
    private Integer id_medico;

    @Column(unique=true, length=13,nullable=false)
    private String run;

    @Column(nullable=false)
    private String comentario;

    @Column(nullable=false)
    private Date fecha_atencion;

    @Column(nullable=false)
    private Date hora_atencion;

}
