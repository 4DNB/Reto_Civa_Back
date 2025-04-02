package com.civa.retoCiva.Business;

import com.civa.retoCiva.Model.Bus;
import com.civa.retoCiva.Model.BusDTO;
import com.civa.retoCiva.Repository.BusRepository;
import org.springframework.data.domain.Page;

public interface IBusService {

    Page<BusDTO> findAll(int page, int size );

    Bus findById(Long id );
}
