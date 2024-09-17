package com.geovannycode.arquitectura.hexagonal.domain.classes;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonPropertyOrder({"id","nombreCorto","nombreLargo"})

public class SedeDomain extends GenericDomain{ // Domain

    private String nombreCorto;

    private String nombreLargo;

}
