package com.geovannycode.arquitectura.hexagonal.rest;

import com.geovannycode.arquitectura.hexagonal.entity.SedeEntity;
import com.geovannycode.arquitectura.hexagonal.service.SedeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.geovannycode.arquitectura.hexagonal.rest.api.APIEndPointConst.API_SEDE;
import static com.geovannycode.arquitectura.hexagonal.rest.api.APIMessageConst.MSG_INTERNAL_SERVER_ERROR;
import static java.util.Objects.isNull;

@Slf4j
@RestController
@RequestMapping(API_SEDE)
public class SedeREST {

   private final SedeService sedeService;

    public SedeREST(SedeService sedeService) {
        this.sedeService = sedeService;
    }

    @GetMapping
    public ResponseEntity<?> findLike(@RequestParam(value = "nombre", defaultValue="") String nombre) {
        try{
            List<SedeEntity> sedes = sedeService.findLike(SedeEntity.builder().nombreCorto(nombre).build());
            if(isNull(sedes) || sedes.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(sedes);
        }
        catch (Exception e) {
            log.error(e.getMessage(),e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(MSG_INTERNAL_SERVER_ERROR);
        }
    }
}
