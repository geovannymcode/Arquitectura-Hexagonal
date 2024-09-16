package com.geovannycode.arquitectura.hexagonal.service;

import com.geovannycode.arquitectura.hexagonal.dto.SedeDTO;
import com.geovannycode.arquitectura.hexagonal.entity.SedeEntity;
import com.geovannycode.arquitectura.hexagonal.exception.ServiceException;
import com.geovannycode.arquitectura.hexagonal.mappers.SedeMapper;
import com.geovannycode.arquitectura.hexagonal.repository.SedeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.geovannycode.arquitectura.hexagonal.commons.persitencia.QueryUtil.getLike;

@Slf4j
@Service
public class SedeServiceImpl implements SedeService{

    private final SedeRepository sedeRepository;

    public SedeServiceImpl(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }


    @Override
    public List<SedeDTO> findLike(SedeDTO sedeDTO) throws ServiceException {
        List<SedeDTO> result;
        try {
            String nombreLike = getLike(sedeDTO.getNombreCorto());
            List<SedeEntity> sedeEntities = sedeRepository.findLike(nombreLike);
            result = sedeEntities.stream()
                    .map(SedeMapper::toSede)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new ServiceException("Error al realizar la búsqueda de sedes", e);
        }
        return result;
    }

    @Override
    public Optional<SedeDTO> findById(SedeDTO sedeDTO) throws ServiceException {
        try {
            return sedeRepository.findById(sedeDTO.getId())
                    .map(SedeMapper::toSede);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new ServiceException("Error al encontrar la sede con id: " + sedeDTO.getId(), e);
        }
    }

    @Override
    public SedeDTO save(SedeDTO sedeDTO) throws ServiceException {
        try {
            SedeEntity sedeEntity = SedeMapper.toEntity(sedeDTO);
            SedeEntity savedEntity = sedeRepository.save(sedeEntity);
            return SedeMapper.toSede(savedEntity);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new ServiceException("Error al guardar la sede", e);
        }
    }
}
