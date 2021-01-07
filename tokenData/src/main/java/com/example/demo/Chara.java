package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="kyara")
public class Chara {
	
	@Id
	@Column(name="char_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="bang")
	private Integer bang;
	
	@Column(name="char_name")
	private String charName;
	
	@Column(name="char_furi")
	private String charFuri;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tosyu_id", referencedColumnName="id")
	private Tosyu tosyu;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="toha_id", referencedColumnName="id")
	private Toha toha;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rare", referencedColumnName="id")
	private Rare rare;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="seiyu_id", referencedColumnName="id")
	private Seiyu seiyu;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="eshi_id", referencedColumnName="id")
	private Eshi eshi;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="image_id", referencedColumnName="id")
	private Image image;

	@Override
	public String toString() {
		return "Chara [id=" + id + ", bang=" + bang + ", charName=" + charName + ", charFuri=" + charFuri + ", "
				+ "tosyu="+ tosyu + ", "
				+ "toha=" + toha + ", rare=" + rare + ", seiyu=" + seiyu + ", eshi=" + eshi
				+ ", image=" + image + "]";
	}

	public Integer getId() {
		return id;
	}

	public Integer getBang() {
		return bang;
	}

	public String getCharName() {
		return charName;
	}

	public String getCharFuri() {
		return charFuri;
	}

	public Toha getToha() {
		return toha;
	}

	public Rare getRare() {
		return rare;
	}

	public Seiyu getSeiyu() {
		return seiyu;
	}

	public Eshi getEshi() {
		return eshi;
	}

	public Image getImage() {
		return image;
	}

	public Tosyu getTosyu() {
		return tosyu;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setBang(Integer bang) {
		this.bang = bang;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public void setCharFuri(String charFuri) {
		this.charFuri = charFuri;
	}

	public void setToha(Toha toha) {
		this.toha = toha;
	}

	public void setRare(Rare rare) {
		this.rare = rare;
	}

	public void setSeiyu(Seiyu seiyu) {
		this.seiyu = seiyu;
	}

	public void setEshi(Eshi eshi) {
		this.eshi = eshi;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public void setTosyu(Tosyu tosyu) {
		this.tosyu = tosyu;
	}
	
	

}
