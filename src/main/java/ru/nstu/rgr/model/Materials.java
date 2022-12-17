package ru.nstu.rgr.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "materials")
@Data
public class Materials {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "name")
    private String name;

    @Column(name = "unit_measurement")
    private String unitMeasurement;

}
