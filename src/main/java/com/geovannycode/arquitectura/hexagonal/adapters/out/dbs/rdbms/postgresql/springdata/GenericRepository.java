package com.geovannycode.arquitectura.hexagonal.adapters.out.dbs.rdbms.postgresql.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T, ID> extends JpaRepository<T, ID> {
}
