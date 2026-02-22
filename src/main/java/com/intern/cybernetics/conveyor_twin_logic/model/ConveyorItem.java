package com.intern.cybernetics.conveyor_twin_logic.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "conveyor_item")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConveyorItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double positionX;
    @Column(name = "is_defective", nullable = false)
    private boolean defective = false;
    private String robotDecision;



}
