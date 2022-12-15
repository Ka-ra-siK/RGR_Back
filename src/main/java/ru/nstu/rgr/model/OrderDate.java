package ru.nstu.rgr.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "order_date", schema = "public", catalog = "beauty_salon")
public class OrderDate implements Serializable {

    @Basic
    @Column(name = "order_date")
    private Date orderDate;
    @ManyToOne
    @Id
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Clients clientsByClientId;
    @ManyToOne
    @Id
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private OrderService orderServiceByOrderId;


    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDate orderDate1 = (OrderDate) o;

        if (orderDate != null ? !orderDate.equals(orderDate1.orderDate) : orderDate1.orderDate != null) return false;

        return true;
    }


    public Clients getClientsByClientId() {
        return clientsByClientId;
    }

    public void setClientsByClientId(Clients clientsByClientId) {
        this.clientsByClientId = clientsByClientId;
    }

    public OrderService getOrderServiceByOrderId() {
        return orderServiceByOrderId;
    }

    public void setOrderServiceByOrderId(OrderService orderServiceByOrderId) {
        this.orderServiceByOrderId = orderServiceByOrderId;
    }
}
