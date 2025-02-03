package com.edsontomas.entities;


import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID user;
    private String name;
    private String password;
//    private List<Role> roles;



}
