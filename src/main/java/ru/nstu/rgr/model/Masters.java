package ru.nstu.rgr.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "masters")
@Data
public class Masters {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "staff_id", referencedColumnName = "id", nullable = false)
    private Staff staffByStaffId;

    @ManyToMany
    @JoinTable(
            name="master_specialization",
            joinColumns = @JoinColumn(name= "master_id"),
            inverseJoinColumns = @JoinColumn(name= "specialization_id")
    )
    private List<Specialization> specializations = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name="master_materials",
            joinColumns = @JoinColumn(name= "master_id"),
            inverseJoinColumns = @JoinColumn(name= "material_id")
    )
    private List<Materials> materials = new ArrayList<>();
}
