package com.civa.retoCiva.Controller;

import com.civa.retoCiva.Business.BusService;
import com.civa.retoCiva.Model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping("")
    Page<Bus> getAllBus(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "2") int size){
        return busService.findAll(page, size);
    }

    @GetMapping("/{id}")
    Bus getBusId(@PathVariable Long id){
        return busService.findById(id);
    }

}
