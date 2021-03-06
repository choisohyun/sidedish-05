package com.codesquad.sidedish5.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Category {

    @Id
    private int id;

    private String name;

    private String description;

    private Set<Sidedish> sidedishes = new HashSet<>();

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addSidedish(Sidedish sidedish) {
        sidedishes.add(sidedish);
    }
}
