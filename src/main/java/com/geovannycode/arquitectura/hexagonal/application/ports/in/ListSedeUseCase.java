package com.geovannycode.arquitectura.hexagonal.application.ports.in;

import com.geovannycode.arquitectura.hexagonal.domain.classes.SedeDomain;

import java.util.List;

@FunctionalInterface
public interface ListSedeUseCase {
    List<SedeDomain> findByLike(String nombre);
}
