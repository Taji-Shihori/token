package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eshi")
public class Eshi {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String eshiName;
	
	@Column(name="furi")
	private String eshiFuri;
	
	@Column(name="daihyo")
	private String eshiDaihyo;
	
	@Column(name="link")
	private String link;

	@Override
	public String toString() {
		return "Eshi [id=" + id + ", eshiName=" + eshiName + ", eshiFuri=" + eshiFuri + ", eshiDaihyo=" + eshiDaihyo
				+ ", link=" + link + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getEshiName() {
		return eshiName;
	}

	public String getEshiFuri() {
		return eshiFuri;
	}

	public String getEshiDaihyo() {
		return eshiDaihyo;
	}

	public String getLink() {
		return link;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setEshiName(String eshiName) {
		this.eshiName = eshiName;
	}

	public void setEshiFuri(String eshiFuri) {
		this.eshiFuri = eshiFuri;
	}

	public void setEshiDaihyo(String eshiDaihyo) {
		this.eshiDaihyo = eshiDaihyo;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
