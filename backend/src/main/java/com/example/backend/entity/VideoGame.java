package com.example.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
public class VideoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("category")
    private String category;

    @JsonProperty("minAge")
    private Integer minAge;

    @JsonProperty("price")
    private Double price;

    public VideoGame(String name, String category, Integer minAge, Double price) {
        this.name = name;
        this.category = category;
        this.minAge = minAge;
        this.price = price;
    }

    public VideoGame() {
    }
}
