package ru.nstu.rgr.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "materials")
public class Materials {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "cost")
    private Integer cost;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "unit_measurement")
    private String unitMeasurement;
    @OneToMany(mappedBy = "materialsByMaterialId")
    private Collection<MasterMaterials> masterMaterialsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitMeasurement() {
        return unitMeasurement;
    }

    public void setUnitMeasurement(String unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Materials materials = (Materials) o;

        if (id != materials.id) return false;
        if (cost != null ? !cost.equals(materials.cost) : materials.cost != null) return false;
        if (name != null ? !name.equals(materials.name) : materials.name != null) return false;
        if (unitMeasurement != null ? !unitMeasurement.equals(materials.unitMeasurement) : materials.unitMeasurement != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (unitMeasurement != null ? unitMeasurement.hashCode() : 0);
        return result;
    }

    public Collection<MasterMaterials> getMasterMaterialsById() {
        return masterMaterialsById;
    }

    public void setMasterMaterialsById(Collection<MasterMaterials> masterMaterialsById) {
        this.masterMaterialsById = masterMaterialsById;
    }
}
