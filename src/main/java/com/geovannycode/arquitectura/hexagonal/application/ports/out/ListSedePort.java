package com.geovannycode.arquitectura.hexagonal.application.ports.out;

import com.geovannycode.arquitectura.hexagonal.domain.classes.SedeDomain;

import java.util.List;

@FunctionalInterface
public interface ListSedePort {
    public List<SedeDomain> findByLike(String nombre);

}
