package com.test.springtestapp01.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="guitars")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestEntity {
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

}
