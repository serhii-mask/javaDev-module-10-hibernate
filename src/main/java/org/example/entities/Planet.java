package org.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "planets")
public class Planet {

    @Id
    private String id;

    @Column
    private String name;

    public void setId(String id) {
        isValidId(id);
        this.id = id;
    }

    public void setName(String name) {
        isValidName(name);
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private static void isValidId(String id) {
        if (id == null || id.isEmpty() || !id.matches("[A-Z0-9]+") || id.length() > 10) {
            throw new IllegalArgumentException("Invalid planet ID");
        }
    }

    private static void isValidName(String name) {
        if (name == null || name.length() < 1 || name.length() > 500) {
            throw new IllegalArgumentException("Invalid planet name");
        }
    }
}
