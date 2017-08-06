package com.dbt.bean;


import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Role implements Serializable{
	private static final long serialVersionUID = 1850403515144674840L;
	private Integer id;
	private String name;
	private Integer roleLevel;
	private String description;
}