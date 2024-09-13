package com.geovannycode.arquitectura.hexagonal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SEDES")
@Entity
public class SedeEntity extends GenericEntity {

    @Id
    @Column(name = "ID_SEDE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sede_id_generator")
    @SequenceGenerator(name="sede_id_generator", sequenceName = "sede_id_seq")
    @Builder.Default
    private Long id=0L;

    @Size(min = 3, max = 100, message = "El nombre debe tener entre {min}} y {max} caracteres")
    @Column(name = "NOMBRE")
    private String nombre;
}
