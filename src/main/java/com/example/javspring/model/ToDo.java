package com.example.javspring.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "TODO_TASK")
@Data
public class ToDo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ADDRESS")
    private String address;

    @NotNull(message = "Không được để trống Name")
    @Size(max = 100,message = "Name tối đa 100 kí tự")
    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String code;
}
