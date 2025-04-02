package com.civa.retoCiva.Repository;

import com.civa.retoCiva.Model.Bus;
import com.civa.retoCiva.Model.BusDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

    @Query("SELECT new com.civa.retoCiva.Model.BusDTO(b.id, b.numBus) FROM Bus b")
    Page<BusDTO> findAllB(PageRequest pRequest);
}
