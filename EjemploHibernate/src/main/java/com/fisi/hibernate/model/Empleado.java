package com.fisi.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int idempleados;
	@Column
	private String nombre;
	@Column
	private String usuario;
	@Column
	private String password;
	
	public int getIdempleados() {
		return idempleados;
	}
	public void setIdempleados(int idempleados) {
		this.idempleados = idempleados;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString(){
		return "id="+idempleados+", name="+nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
