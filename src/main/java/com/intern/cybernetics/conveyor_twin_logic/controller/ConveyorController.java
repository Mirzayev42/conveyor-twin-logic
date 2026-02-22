package com.intern.cybernetics.conveyor_twin_logic.controller;

import com.intern.cybernetics.conveyor_twin_logic.model.ConveyorItem;
import com.intern.cybernetics.conveyor_twin_logic.service.ConveyorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/conveyor")
@RequiredArgsConstructor
public class ConveyorController {
    private final ConveyorService service;


    @PostMapping("/process")
    public String handleItem(@RequestBody ConveyorItem item, @RequestParam double speed) {
        return service.processItem(item, speed);
    }

}
