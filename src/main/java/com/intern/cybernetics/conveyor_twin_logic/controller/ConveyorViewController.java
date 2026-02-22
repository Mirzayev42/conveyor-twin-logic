package com.intern.cybernetics.conveyor_twin_logic.controller;

import com.intern.cybernetics.conveyor_twin_logic.model.ConveyorItem;
import com.intern.cybernetics.conveyor_twin_logic.repository.ConveyorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ConveyorViewController {

    private final ConveyorRepository conveyorRepository;

    @GetMapping("/dashboard")
    public  String showDashboard(Model model){
        List<ConveyorItem> allItems = conveyorRepository.findAll();

        model.addAttribute("items", allItems);
        return "dashboard";
    }

}
