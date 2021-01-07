package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="path")
	private String path;
	
	@Column(name="path_on")
	private String path_on;

	@Override
	public String toString() {
		return "Image [id=" + id + ", path=" + path + ", path_on=" + path_on + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getPath() {
		return path;
	}

	public String getPath_on() {
		return path_on;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setPath_on(String path_on) {
		this.path_on = path_on;
	}

}
