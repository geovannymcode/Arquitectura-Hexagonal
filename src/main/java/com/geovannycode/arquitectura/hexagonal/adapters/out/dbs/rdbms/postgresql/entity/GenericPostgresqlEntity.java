package com.geovannycode.arquitectura.hexagonal.adapters.out.dbs.rdbms.postgresql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class GenericPostgresqlEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "ESTADO",nullable = false)
    protected String estado="1";
}
