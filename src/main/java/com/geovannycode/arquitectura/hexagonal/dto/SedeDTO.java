package com.geovannycode.arquitectura.hexagonal.dto;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonPropertyOrder({"id", "nombreCorto", "nombreLargo"})
public class SedeDTO extends GenericDTO {

    private String nombreCorto;
    private String nombreLargo;

    public SedeDTO(Long id, String nombreCorto, String nombreLargo) {
        this.setId(id);
        this.nombreCorto = nombreCorto;
        this.nombreLargo = nombreLargo;
    }

    public static class SedeDTOBuilder {
        private Long id;

        public SedeDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public SedeDTO build() {
            SedeDTO sedeDTO = new SedeDTO();
            sedeDTO.setId(this.id);
            sedeDTO.setNombreCorto(this.nombreCorto);
            sedeDTO.setNombreLargo(this.nombreLargo);
            return sedeDTO;
        }
    }
}
