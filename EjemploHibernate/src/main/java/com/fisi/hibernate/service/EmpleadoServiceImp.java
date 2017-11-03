package com.fisi.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fisi.hibernate.DAO.EmpleadoDAO;
import com.fisi.hibernate.model.Empleado;
import com.fisi.hibernate.model.Perfil;
import com.fisi.hibernate.model.Persona;

@Service
@Transactional
public class EmpleadoServiceImp implements EmpleadoService {
	
	
	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	public EmpleadoServiceImp() {
		
	}
	

	public EmpleadoDAO getEmpleadoDAO() {
		return empleadoDAO;
	}

	public void setEmpleadoDAO(EmpleadoDAO empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}
	@Override
	@Transactional
	public Empleado getPersonById(int id) {
		return this.empleadoDAO.getPersonById(id);
	}
	
	@Override	
	public Empleado getPersonByUser(String user,String pass) {
		return this.empleadoDAO.getPersonByUser(user, pass);
	}
	
	@Override
	public List<Persona> getPersonaList(){
		return this.empleadoDAO.getPersonaList();
	}


	@Override
	public Perfil getPerfil(String user, String pass) {
		return this.empleadoDAO.getPerfil(user, pass);
		
	}

	
	
	
}
