package com.fisi.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int num_dni;
	@Column
	private String ape_pat;
	@Column
	private String ape_mat;
	@Column
	private String nombres;
	@Column
	private String sexo;
	@Column
	private String correo;
	
	public int getNum_dni() {
		return num_dni;
	}
	public void setNum_dni(int num_dni) {
		this.num_dni = num_dni;
	}
	public String getApe_pat() {
		return ape_pat;
	}
	public void setApe_pat(String ape_pat) {
		this.ape_pat = ape_pat;
	}
	public String getApe_mat() {
		return ape_mat;
	}
	public void setApe_mat(String ape_mat) {
		this.ape_mat = ape_mat;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
