package com.dsic.project.enetities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Projet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designation;

	@ManyToOne
	private Commune commune;
	@ManyToOne
	private Province province;
	private String description;
	private int budjet;
	private Date dateDebut;
	private Date dateFin;
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Projet(String designation, Commune commune, Province province, String description, int budjet,
			Date dateDebut, Date dateFin) {
		super();
		this.designation = designation;
		this.commune = commune;
		this.province = province;
		this.description = description;
		this.budjet = budjet;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Commune getCommune() {
		return commune;
	}


	public void setCommune(Commune commune) {
		this.commune = commune;
	}


	public Province getProvince() {
		return province;
	}


	public void setProvince(Province province) {
		this.province = province;
	}


	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getBudjet() {
		return budjet;
	}
	public void setBudjet(int budjet) {
		this.budjet = budjet;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
}
