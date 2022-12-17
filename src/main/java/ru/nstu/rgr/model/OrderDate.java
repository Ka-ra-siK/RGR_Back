package ru.nstu.rgr.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "order_date", schema = "public", catalog = "beauty_salon")
@Data
public class OrderDate implements Serializable {

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

}
