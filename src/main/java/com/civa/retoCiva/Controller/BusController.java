package com.civa.retoCiva.Controller;

import com.civa.retoCiva.Business.BusServiceImpl;
import com.civa.retoCiva.Model.Bus;
import com.civa.retoCiva.Model.BusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusServiceImpl busService;

    @GetMapping("")
    Page<BusDTO> getAllBus(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "2") int size){

        return busService.findAll(page, size);
    }

    @GetMapping("/{id}")
    Bus getBusId(@PathVariable Long id){
        return busService.findById(id);
    }

}
