package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name",nullable = false,length = 200)
    private String name;

    @Column(name = "age",nullable = false,length = 4)
    private Integer age;
}
