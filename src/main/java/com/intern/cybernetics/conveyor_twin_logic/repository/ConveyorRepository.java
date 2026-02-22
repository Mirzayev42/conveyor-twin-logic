package com.intern.cybernetics.conveyor_twin_logic.repository;

import com.intern.cybernetics.conveyor_twin_logic.model.ConveyorItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConveyorRepository extends JpaRepository<ConveyorItem,Long> {

}
