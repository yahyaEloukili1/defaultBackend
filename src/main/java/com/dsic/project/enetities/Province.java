package com.dsic.project.enetities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Province {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designation;
	@OneToMany(mappedBy = "province")
	private List<Commune> communes;
	@OneToMany(mappedBy = "province")
	private List<Projet> projets;
	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Province(int id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	
	public List<Commune> getCommunes() {
		return communes;
	}
	public void setCommunes(List<Commune> communes) {
		this.communes = communes;
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
	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

}
