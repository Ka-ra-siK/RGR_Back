package ru.nstu.rgr.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "specialization")
public class Specialization {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "specializationBySpecializationId")
    private Collection<MasterSpecialization> masterSpecializationsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Specialization that = (Specialization) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Collection<MasterSpecialization> getMasterSpecializationsById() {
        return masterSpecializationsById;
    }

    public void setMasterSpecializationsById(Collection<MasterSpecialization> masterSpecializationsById) {
        this.masterSpecializationsById = masterSpecializationsById;
    }
}
