package com.geovannycode.arquitectura.hexagonal.mappers;

import com.geovannycode.arquitectura.hexagonal.dto.SedeDTO;
import com.geovannycode.arquitectura.hexagonal.entity.SedeEntity;

public class SedeMapper {
    public static SedeDTO toSede(SedeEntity sedeEntity) {
        return new SedeDTO(
                sedeEntity.getId(),
                sedeEntity.getNombreCorto(),
                sedeEntity.getNombreLargo()
        );
    }
}
