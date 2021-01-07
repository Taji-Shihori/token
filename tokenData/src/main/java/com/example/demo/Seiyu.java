package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seiyu")
public class Seiyu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private String id;
	
	@Column(name="name")
	private String seiyuName;
	
	@Column(name="furi")
	private String seiyuFuri;
	
	@Column(name="birth")
	private String seiyuBirth;
	
	@Column(name="shozoku")
	private String shozoku;
	
	@Column(name="daihyo")
	private String seiyuDaihyo;
	
	@Column(name="ken")
	private String ken;
	
	@Column(name="btype")
	private String seiyuBtype;

	@Override
	public String toString() {
		return "Seiyu [id=" + id + ", seiyuName=" + seiyuName + ", seiyuFuri=" + seiyuFuri + ", seiyuBirth="
				+ seiyuBirth + ", shozoku=" + shozoku + ", seiyuDaihyo=" + seiyuDaihyo + ", ken=" + ken
				+ ", seiyuBtype=" + seiyuBtype + "]";
	}

	public String getId() {
		return id;
	}

	public String getSeiyuName() {
		return seiyuName;
	}

	public String getSeiyuFuri() {
		return seiyuFuri;
	}

	public String getSeiyuBirth() {
		return seiyuBirth;
	}

	public String getShozoku() {
		return shozoku;
	}

	public String getSeiyuDaihyo() {
		return seiyuDaihyo;
	}

	public String getKen() {
		return ken;
	}

	public String getSeiyuBtype() {
		return seiyuBtype;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSeiyuName(String seiyuName) {
		this.seiyuName = seiyuName;
	}

	public void setSeiyuFuri(String seiyuFuri) {
		this.seiyuFuri = seiyuFuri;
	}

	public void setSeiyuBirth(String seiyuBirth) {
		this.seiyuBirth = seiyuBirth;
	}

	public void setShozoku(String shozoku) {
		this.shozoku = shozoku;
	}

	public void setSeiyuDaihyo(String seiyuDaihyo) {
		this.seiyuDaihyo = seiyuDaihyo;
	}

	public void setKen(String ken) {
		this.ken = ken;
	}

	public void setSeiyuBtype(String seiyuBtype) {
		this.seiyuBtype = seiyuBtype;
	}
	
	

}
