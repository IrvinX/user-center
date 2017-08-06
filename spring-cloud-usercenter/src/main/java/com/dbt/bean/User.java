package com.dbt.bean;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = -3775289231598318475L;

    private Integer id;
    private String account;
    private String username;
    private String password;
    private String email;
    private String telephone;
    private Integer salt;
}