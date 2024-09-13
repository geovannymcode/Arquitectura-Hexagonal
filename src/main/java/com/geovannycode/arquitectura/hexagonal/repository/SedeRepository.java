package com.geovannycode.arquitectura.hexagonal.repository;

import com.geovannycode.arquitectura.hexagonal.entity.SedeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SedeRepository extends GenericRepository<SedeEntity, Long> {

    @Query("select p from SedeEntity p where upper(p.nombreCorto) like(:nombre) and p.estado='1' ") //JPQL
    List<SedeEntity> findLike(@Param("nombre") String nombre);
}
