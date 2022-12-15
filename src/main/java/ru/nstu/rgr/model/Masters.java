package ru.nstu.rgr.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "masters")
public class Masters {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @OneToMany(mappedBy = "mastersByMasterId")
    private Collection<MasterMaterials> masterMaterialsById;
    @OneToMany(mappedBy = "mastersByMasterId")
    private Collection<MasterSpecialization> masterSpecializationsById;
    @ManyToOne
    @JoinColumn(name = "staff_id", referencedColumnName = "id", nullable = false)
    private Staff staffByStaffId;
    @OneToMany(mappedBy = "mastersByMasterId")
    private Collection<OrderService> orderServicesById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Masters masters = (Masters) o;

        if (id != masters.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        return result;
    }

    public Collection<MasterMaterials> getMasterMaterialsById() {
        return masterMaterialsById;
    }

    public void setMasterMaterialsById(Collection<MasterMaterials> masterMaterialsById) {
        this.masterMaterialsById = masterMaterialsById;
    }

    public Collection<MasterSpecialization> getMasterSpecializationsById() {
        return masterSpecializationsById;
    }

    public void setMasterSpecializationsById(Collection<MasterSpecialization> masterSpecializationsById) {
        this.masterSpecializationsById = masterSpecializationsById;
    }

    public Staff getStaffByStaffId() {
        return staffByStaffId;
    }

    public void setStaffByStaffId(Staff staffByStaffId) {
        this.staffByStaffId = staffByStaffId;
    }

    public Collection<OrderService> getOrderServicesById() {
        return orderServicesById;
    }

    public void setOrderServicesById(Collection<OrderService> orderServicesById) {
        this.orderServicesById = orderServicesById;
    }
}
