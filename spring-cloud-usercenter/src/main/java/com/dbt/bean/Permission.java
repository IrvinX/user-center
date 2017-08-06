package com.dbt.bean;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Permission implements Serializable {

    private static final long serialVersionUID = 6427777068765057772L;

    private Integer id;
    private String name;
    private String url;
    private String method;
    private String description;
}