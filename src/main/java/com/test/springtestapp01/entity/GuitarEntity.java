package com.test.springtestapp01.entity;

import jakarta.persistence.*;

@Entity
@Table(name="guitars")
public class GuitarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String name;
    public String description;
    public String category;
    public String inventoryStatus;
    public String photo;
    public int price;
    public int rate;

    public GuitarEntity() {
    }

    public GuitarEntity(int id, String name, String description, String category, String inventoryStatus, String photo, int price, int rate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.inventoryStatus = inventoryStatus;
        this.photo = photo;
        this.price = price;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "GuitarEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", inventoryStatus='" + inventoryStatus + '\'' +
                ", photo='" + photo + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                '}';
    }
}
