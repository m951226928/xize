package com.offcn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cat {
    @Id
	@GeneratedValue
	private Integer id;
    @Column(length = 200 ,nullable = true, name = "name")
	private String name;
    @Column(length = 4,nullable = true,name = "age")
	private Integer age;
}
