package com.code.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
//class mapped to entity
//table has a name 
@Entity
@Table (name="category")

public class Category {
	
	//member variable
	//mapped each member variables to the column
	//declared one of the member variables as PK
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name", nullable=false, length=20)
	private String name;
	@Column(name="description")
	private String description;
	
	//Create a relationship with Product
	
	
	//create Constructor 
	public Category() 
	{
		// set default value
		
		this.name=null;
		this.description=null;
		
		
	}

	public Category( String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	

}
