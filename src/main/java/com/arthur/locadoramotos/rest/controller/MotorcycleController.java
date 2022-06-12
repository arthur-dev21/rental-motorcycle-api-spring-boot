package com.arthur.locadoramotos.rest.controller;

import com.arthur.locadoramotos.domain.model.Motorcycle;
import com.arthur.locadoramotos.domain.repository.MotocycleRepository;
import com.arthur.locadoramotos.domain.service.MotocycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/motorcycles")
public class MotorcycleController {

    @Autowired
    private MotocycleRepository motocycleRepository;

    @Autowired
    private MotocycleService motocycleService;

    @GetMapping("/")
    public List<Motorcycle> list(){
        return motocycleRepository.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Motorcycle searchById(@PathVariable("id") Long id)  {
       return motocycleService.searchById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Motorcycle save( @RequestBody Motorcycle motorcycle){
        return motocycleRepository.save(motorcycle);
    }
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public Motorcycle update(@PathVariable("id") Long id , @RequestBody Motorcycle motorcycleeEdited){
        return motocycleService.update(id,motorcycleeEdited);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        motocycleService.delete(id);
    }






}
