package com.intern.cybernetics.conveyor_twin_logic.service;

import com.intern.cybernetics.conveyor_twin_logic.model.ConveyorItem;
import com.intern.cybernetics.conveyor_twin_logic.repository.ConveyorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConveyorService {
    private final ConveyorRepository repository;


    public String processItem(ConveyorItem item, double speed) {
        String decision = item.isDefective() ? "PICK_AT " + (item.getPositionX() + (speed * 0.85)) : "PASS";
        item.setRobotDecision(decision);
        repository.save(item);
        return decision;
    }
}
