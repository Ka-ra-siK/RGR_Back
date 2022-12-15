package ru.nstu.rgr.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "staff")
public class Staff {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "birth_date")
    private Date birthDate;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "patronymic")
    private String patronymic;
    @Basic
    @Column(name = "position")
    private String position;
    @Basic
    @Column(name = "salary")
    private Integer salary;
    @Basic
    @Column(name = "surname")
    private String surname;
    @OneToMany(mappedBy = "staffByStaffId")
    private Collection<Masters> mastersById;
    @ManyToOne
    @JoinColumn(name = "moving_information", referencedColumnName = "id", nullable = false)
    private MovingInformation movingInformationByMovingInformation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (id != staff.id) return false;
        if (address != null ? !address.equals(staff.address) : staff.address != null) return false;
        if (birthDate != null ? !birthDate.equals(staff.birthDate) : staff.birthDate != null) return false;
        if (name != null ? !name.equals(staff.name) : staff.name != null) return false;
        if (patronymic != null ? !patronymic.equals(staff.patronymic) : staff.patronymic != null) return false;
        if (position != null ? !position.equals(staff.position) : staff.position != null) return false;
        if (salary != null ? !salary.equals(staff.salary) : staff.salary != null) return false;
        if (surname != null ? !surname.equals(staff.surname) : staff.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    public Collection<Masters> getMastersById() {
        return mastersById;
    }

    public void setMastersById(Collection<Masters> mastersById) {
        this.mastersById = mastersById;
    }

    public MovingInformation getMovingInformationByMovingInformation() {
        return movingInformationByMovingInformation;
    }

    public void setMovingInformationByMovingInformation(MovingInformation movingInformationByMovingInformation) {
        this.movingInformationByMovingInformation = movingInformationByMovingInformation;
    }
}
