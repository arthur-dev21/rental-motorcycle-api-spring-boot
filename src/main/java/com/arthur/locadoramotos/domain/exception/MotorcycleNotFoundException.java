package com.arthur.locadoramotos.domain.exception;

import com.arthur.locadoramotos.domain.service.MotocycleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MotorcycleNotFoundException extends RuntimeException{

    public MotorcycleNotFoundException(String msg){
        super(msg);
    }
}
