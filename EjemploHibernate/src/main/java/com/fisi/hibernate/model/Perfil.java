package com.fisi.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

public class Perfil {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private String num_dni;
	@Column
	private String usuario;
	@Column
	private String ape_pat;
	@Column
	private String ape_mat;
	@Column
	private String nombres;
	@Column
	private int cod_facultad;
	@Column
	private String des_facultad;
	@Column
	private int cod_departamento;
	@Column
	private String des_departamento;
	@Column
	private int cod_condicion;
	@Column
	private String des_condicion;
	@Column
	private int cod_categoria;
	@Column
	private String des_categoria;
	@Column
	private int cod_clase;
	@Column
	private String des_clase;
	@Column
	private int num_horas;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNum_dni() {
		return num_dni;
	}
	public void setNum_dni(String num_dni) {
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
	public int getCod_facultad() {
		return cod_facultad;
	}
	public void setCod_facultad(int cod_facultad) {
		this.cod_facultad = cod_facultad;
	}
	public String getDes_facultad() {
		return des_facultad;
	}
	public void setDes_facultad(String des_facultad) {
		this.des_facultad = des_facultad;
	}
	public int getCod_departamento() {
		return cod_departamento;
	}
	public void setCod_departamento(int cod_departamento) {
		this.cod_departamento = cod_departamento;
	}
	public String getDes_departamento() {
		return des_departamento;
	}
	public void setDes_departamento(String des_departamento) {
		this.des_departamento = des_departamento;
	}
	public int getCod_condicion() {
		return cod_condicion;
	}
	public void setCod_condicion(int cod_condicion) {
		this.cod_condicion = cod_condicion;
	}
	public String getDes_condicion() {
		return des_condicion;
	}
	public void setDes_condicion(String des_condicion) {
		this.des_condicion = des_condicion;
	}
	public int getCod_categoria() {
		return cod_categoria;
	}
	public void setCod_categoria(int cod_categoria) {
		this.cod_categoria = cod_categoria;
	}
	public String getDes_categoria() {
		return des_categoria;
	}
	public void setDes_categoria(String des_categoria) {
		this.des_categoria = des_categoria;
	}
	public int getCod_clase() {
		return cod_clase;
	}
	public void setCod_clase(int cod_clase) {
		this.cod_clase = cod_clase;
	}
	public String getDes_clase() {
		return des_clase;
	}
	public void setDes_clase(String des_clase) {
		this.des_clase = des_clase;
	}
	public int getNum_horas() {
		return num_horas;
	}
	public void setNum_horas(int num_horas) {
		this.num_horas = num_horas;
	}
	
	
	
	
}
