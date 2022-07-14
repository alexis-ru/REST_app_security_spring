package com.spring.rest_security_spring.entity;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "flower")
public class Flower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "type")
    public String type;

    @Column(name = "sel_price")
    public int sel_price;

    @Column(name = "purch_price")
    public int purch_price;

    public Flower() {
    }

    public Flower(Long id, String name, String type, int sel_price, int purch_price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.sel_price = sel_price;
        this.purch_price = purch_price;
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

    public int getSel_price() {
        return sel_price;
    }

    public void setSel_price(int sel_price) {
        this.sel_price = sel_price;
    }

    public int getPurch_price() {
        return purch_price;
    }

    public void setPurch_price(int purch_price) {
        this.purch_price = purch_price;
    }

    public <T> Optional<T> map(Object o) {
        return null;
    }
}
