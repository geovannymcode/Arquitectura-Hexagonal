package com.geovannycode.arquitectura.hexagonal.repository;

import com.geovannycode.arquitectura.hexagonal.entity.SedeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepository extends GenericRepository<SedeEntity, Long> {
}
