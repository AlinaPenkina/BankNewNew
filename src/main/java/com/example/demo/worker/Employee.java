package com.example.demo.worker;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee1")
public class Employee {
    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private Integer amount;
    private Integer price;
    private String category;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount() {
        this.amount = amount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        this.category = category;
    }
}
