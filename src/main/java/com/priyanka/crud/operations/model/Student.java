package com.priyanka.crud.operations.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student_details", catalog = "student_database")
@Data
public class Student {
    @Id
    private Integer id;

   // @Column(name = "first_name")
    private String firstName;
    //@Column(name = "last_name")
    private String lastName;
    private String email;


}
