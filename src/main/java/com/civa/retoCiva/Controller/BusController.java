package com.civa.retoCiva.Controller;

import com.civa.retoCiva.Model.Bus;
import com.civa.retoCiva.Repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusController {

    @Autowired
    private BusRepository repository;

    @GetMapping("/bus")
    List<Bus> getAllBus(){
        return repository.findAll();
    }
    @GetMapping("/bus/{id}")
    Bus getBusId(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }
}
