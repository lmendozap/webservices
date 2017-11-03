package com.fisi.hibernate.DAO;

import java.util.List;

import com.fisi.hibernate.model.Empleado;
import com.fisi.hibernate.model.Perfil;
import com.fisi.hibernate.model.Persona;

public interface EmpleadoDAO {
	public Empleado getPersonById(int id);
	public Empleado getPersonByUser(String user,String pass);
	
	
	public List<Persona> getPersonaList();
	public Perfil getPerfil(String user, String pass);
}
