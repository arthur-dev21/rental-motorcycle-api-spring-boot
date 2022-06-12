package com.arthur.locadoramotos.domain.service;

import com.arthur.locadoramotos.domain.exception.MotorcycleNotFoundException;
import com.arthur.locadoramotos.domain.model.Motorcycle;
import com.arthur.locadoramotos.domain.repository.MotocycleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class MotocycleService {

    @Autowired
    private MotocycleRepository motoCycleRepository;

    public Motorcycle searchById(Long id) {
        return motoCycleRepository.findById(id).orElseThrow(
                ()-> new MotorcycleNotFoundException("Moto  nao encontrada "));
    }


    public Motorcycle update(Long id, Motorcycle motorcycleeEdited) {
        Motorcycle motorcycle = searchById(id);
        BeanUtils.copyProperties(motorcycleeEdited,motorcycle,"id");
        return motoCycleRepository.save(motorcycle);
    }

    public void delete(Long id){
        Motorcycle motorcycle = searchById(id);
        motoCycleRepository.deleteById(motorcycle.getId());
    }
}
