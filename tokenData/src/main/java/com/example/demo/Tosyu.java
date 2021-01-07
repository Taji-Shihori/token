package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tosyu")
public class Tosyu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String tosyuName;

	@Override
	public String toString() {
		return "Tosyu [id=" + id + ", tosyuName=" + tosyuName + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getTosyuName() {
		return tosyuName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTosyuName(String tosyuName) {
		this.tosyuName = tosyuName;
	}
	
	

}
