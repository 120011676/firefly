package com.github.firefly.task.entity;

import org.jooq.impl.CustomRecord;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by say on 8/10/16.
 */
@Entity
@Table(name = "user")
public class User extends CustomRecord<User> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String username;
    @NotNull
    private String password;

    protected User(org.jooq.Table<User> table) {
        super(table);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
