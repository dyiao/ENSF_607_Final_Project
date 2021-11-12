package com.springboot.app.springbootbackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="animal")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer animalID;
	
	@Column(name = "animalName", nullable = false)
	private String animalName;
	
	@Column(name = "animalType", nullable = false)
	private String animalType;

	@OneToMany(mappedBy = "animalID")
	List<AnimalWeight> weights;

}
