package ru.nstu.rgr.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "moving_information", schema = "public", catalog = "beauty_salon")
public class MovingInformation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "order_date")
    private Date orderDate;
    @Basic
    @Column(name = "order_number")
    private Integer orderNumber;
    @Basic
    @Column(name = "position")
    private String position;
    @Basic
    @Column(name = "transfer_reason")
    private String transferReason;


}
