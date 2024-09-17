package com.geovannycode.arquitectura.hexagonal.adapters.out.dbs.rdbms.postgresql.springdata;

import com.geovannycode.arquitectura.hexagonal.adapters.out.dbs.rdbms.postgresql.entity.SedePostgresqlEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SedeRepository extends GenericRepository<SedePostgresqlEntity, Long> {

    @Query("select p from SedePostgresqlEntity p where upper(p.nombreCorto) like(:nombre) and p.estado='1' ") //JPQL
    List<SedePostgresqlEntity> findLike(@Param("nombre") String nombre);
}
