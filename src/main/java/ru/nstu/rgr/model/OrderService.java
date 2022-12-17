package ru.nstu.rgr.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "order_service", schema = "public", catalog = "beauty_salon")
@Data
public class OrderService implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "service_price")
    private Integer servicePrice;
    @ManyToOne
    @JoinColumn(name = "master_id", referencedColumnName = "id", nullable = false)
    private Masters mastersByMasterId;
}
