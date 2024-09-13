package com.geovannycode.arquitectura.hexagonal.service;

import com.geovannycode.arquitectura.hexagonal.entity.SedeEntity;
import com.geovannycode.arquitectura.hexagonal.exception.ServiceException;
import com.geovannycode.arquitectura.hexagonal.repository.SedeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.geovannycode.arquitectura.hexagonal.commons.persitencia.QueryUtil.getLike;

@Slf4j
@Service
public class SedeServiceImpl implements SedeService{

    private final SedeRepository sedeRepository;

    public SedeServiceImpl(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }


    @Override
    public List<SedeEntity> findLike(SedeEntity sedeEntity) throws ServiceException {
        List<SedeEntity> result = new ArrayList<>();
        try {
            String nombreLike = getLike(sedeEntity.getNombreCorto());
            result = sedeRepository.findLike(nombreLike);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new ServiceException("Error al realizar la búsqueda de sedes", e);
        }
        return result;
    }

    @Override
    public Optional<SedeEntity> findById(SedeEntity sedeEntity) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public SedeEntity save(SedeEntity sedeEntity) throws ServiceException {
        return null;
    }
}
