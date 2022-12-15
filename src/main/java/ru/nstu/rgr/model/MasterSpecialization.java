package ru.nstu.rgr.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "master_specialization", schema = "public", catalog = "beauty_salon")
public class MasterSpecialization implements Serializable {
    @ManyToOne
    @Id
    @JoinColumn(name = "master_id", referencedColumnName = "id")
    private Masters mastersByMasterId;
    @ManyToOne
    @Id
    @JoinColumn(name = "specialization_id", referencedColumnName = "id")
    private Specialization specializationBySpecializationId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MasterSpecialization that = (MasterSpecialization) o;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public Masters getMastersByMasterId() {
        return mastersByMasterId;
    }

    public void setMastersByMasterId(Masters mastersByMasterId) {
        this.mastersByMasterId = mastersByMasterId;
    }

    public Specialization getSpecializationBySpecializationId() {
        return specializationBySpecializationId;
    }

    public void setSpecializationBySpecializationId(Specialization specializationBySpecializationId) {
        this.specializationBySpecializationId = specializationBySpecializationId;
    }
}
