package com.civa.retoCiva.Business;

import com.civa.retoCiva.Model.Bus;
import com.civa.retoCiva.Model.BusDTO;
import com.civa.retoCiva.Repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class BusServiceImpl implements IBusService{

    @Autowired
    private BusRepository busRepository;

    public Page<BusDTO> findAll(int page, int size ) {
        return busRepository.findAllB(PageRequest.of(page, size));
    }

    public Bus findById(Long id ) {
        return busRepository.findById(id).orElse(null);
    }

}
