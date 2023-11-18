package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        isValidClientName(name);
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void isValidClientName(String name) {
        if (name == null || name.length() < 3 || name.length() > 200) {
            throw new IllegalArgumentException("Invalid client name");
        }
    }
}
