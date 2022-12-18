package ru.nstu.rgr.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "staff")
@Data
public class Staff {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "name")
    private String name;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "position")
    private String position;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "surname")
    private String surname;

    @ManyToOne
    @JoinColumn(name = "moving_information", referencedColumnName = "id", nullable = false)
    private MovingInformation movingInformationByMovingInformation;

}
