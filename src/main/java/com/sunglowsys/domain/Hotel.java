package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "hotel_01")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "address",nullable = false)
    private String address;

    public Hotel() {
    }

    public Hotel(String name, String type, String address) {
        this.name = name;
        this.type = type;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(getId(), hotel.getId()) && Objects.equals(getName(), hotel.getName()) && Objects.equals(getType(), hotel.getType()) && Objects.equals(getAddress(), hotel.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getType(), getAddress());
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
