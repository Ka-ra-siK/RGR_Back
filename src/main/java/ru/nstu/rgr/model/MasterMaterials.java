package ru.nstu.rgr.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "master_materials", schema = "public", catalog = "beauty_salon")
public class MasterMaterials implements Serializable {
    @Basic
    @Column(name = "quantity")
    private Integer quantity;
    @ManyToOne
    @Id
    @JoinColumn(name = "master_id", referencedColumnName = "id")
    private Masters mastersByMasterId;
    @ManyToOne
    @Id
    @JoinColumn(name = "material_id", referencedColumnName = "id")
    private Materials materialsByMaterialId;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MasterMaterials that = (MasterMaterials) o;

        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

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

    public Materials getMaterialsByMaterialId() {
        return materialsByMaterialId;
    }

    public void setMaterialsByMaterialId(Materials materialsByMaterialId) {
        this.materialsByMaterialId = materialsByMaterialId;
    }
}
