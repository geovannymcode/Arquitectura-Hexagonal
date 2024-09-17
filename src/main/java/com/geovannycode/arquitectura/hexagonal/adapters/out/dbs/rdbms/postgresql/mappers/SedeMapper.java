package com.geovannycode.arquitectura.hexagonal.adapters.out.dbs.rdbms.postgresql.mappers;

import com.geovannycode.arquitectura.hexagonal.dto.SedeDTO;
import com.geovannycode.arquitectura.hexagonal.adapters.out.dbs.rdbms.postgresql.entity.SedePostgresqlEntity;

public class SedeMapper {
    public static SedeDTO toSede(SedePostgresqlEntity sedePostgresqlEntity) {
        return new SedeDTO(
                sedePostgresqlEntity.getId(),
                sedePostgresqlEntity.getNombreCorto(),
                sedePostgresqlEntity.getNombreLargo()
        );
    }

    public static SedePostgresqlEntity toEntity(SedeDTO sedeDTO) {
        SedePostgresqlEntity sedePostgresqlEntity = new SedePostgresqlEntity();
        sedePostgresqlEntity.setId(sedeDTO.getId());
        sedePostgresqlEntity.setNombreCorto(sedeDTO.getNombreCorto());
        sedePostgresqlEntity.setNombreLargo(sedeDTO.getNombreLargo());
        return sedePostgresqlEntity;
    }
}
