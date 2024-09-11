package com.geovannycode.arquitectura.hexagonal.service;

import com.geovannycode.arquitectura.hexagonal.entity.SedeEntity;
import com.geovannycode.arquitectura.hexagonal.exception.ServiceException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SedeServiceImpl implements SedeService{
    @Override
    public List<SedeEntity> findLike(SedeEntity sedeEntity) throws ServiceException {
        return List.of();
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
