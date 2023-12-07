package com.wassim.springsecurityexample.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name = "members")
public class User {

    @Id
    private String userName;
    private String password;
    private long active;
}
