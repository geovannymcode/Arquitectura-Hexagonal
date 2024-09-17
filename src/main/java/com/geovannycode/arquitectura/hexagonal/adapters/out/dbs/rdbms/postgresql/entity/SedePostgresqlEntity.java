package com.geovannycode.arquitectura.hexagonal.adapters.out.dbs.rdbms.postgresql.entity;

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
public class SedePostgresqlEntity extends GenericPostgresqlEntity {

    private static final long serialVersionUID = -1396174732526147859L;

    @Id
    @Column(name = "ID_SEDE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sede_id_generator")
    @SequenceGenerator(name="sede_id_generator", sequenceName = "sede_id_seq")
    @Builder.Default
    private Long id=0L;

    @Size(min = 4, max = 120, message = "El nombre corto es requerido y debe ser mayor que {min} y máximo {max} caracteres")
    @Column(name="NOMBRE_CORTO")
    private String nombreCorto;

    @Size(min = 20, max = 400, message = "El nombre largo es requerido y debe ser mayor que {min} y máximo {max} caracteres")
    @Column(name="NOMBRE_LARGO")
    private String nombreLargo;
}
