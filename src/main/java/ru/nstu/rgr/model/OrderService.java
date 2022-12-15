package ru.nstu.rgr.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "order_service", schema = "public", catalog = "beauty_salon")
public class OrderService {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "service_name")
    private String serviceName;
    @Basic
    @Column(name = "service_price")
    private Integer servicePrice;
    @OneToMany(mappedBy = "orderServiceByOrderId")
    private Collection<OrderDate> orderDatesById;
    @ManyToOne
    @JoinColumn(name = "master_id", referencedColumnName = "id", nullable = false)
    private Masters mastersByMasterId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Integer servicePrice) {
        this.servicePrice = servicePrice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderService that = (OrderService) o;

        if (id != that.id) return false;
        if (serviceName != null ? !serviceName.equals(that.serviceName) : that.serviceName != null) return false;
        if (servicePrice != null ? !servicePrice.equals(that.servicePrice) : that.servicePrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (serviceName != null ? serviceName.hashCode() : 0);
        result = 31 * result + (servicePrice != null ? servicePrice.hashCode() : 0);
        return result;
    }

    public Collection<OrderDate> getOrderDatesById() {
        return orderDatesById;
    }

    public void setOrderDatesById(Collection<OrderDate> orderDatesById) {
        this.orderDatesById = orderDatesById;
    }

    public Masters getMastersByMasterId() {
        return mastersByMasterId;
    }

    public void setMastersByMasterId(Masters mastersByMasterId) {
        this.mastersByMasterId = mastersByMasterId;
    }
}
