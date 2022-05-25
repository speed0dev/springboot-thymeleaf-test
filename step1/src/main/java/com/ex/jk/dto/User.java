package com.ex.jk.dto;

import lombok.Data;


@Data
public class User {
    int id;
    String username;
    String password;
    String email;
    String role;        // ROLE_USER, ROLE_ADMIN

//    @CreationTimestemp
//    private Timestemp createDate;

}
