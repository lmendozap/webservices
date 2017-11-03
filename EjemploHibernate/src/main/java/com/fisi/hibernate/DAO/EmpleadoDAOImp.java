package com.fisi.hibernate.DAO;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fisi.hibernate.model.Empleado;
import com.fisi.hibernate.model.Perfil;
import com.fisi.hibernate.model.Persona;

@Repository
public class EmpleadoDAOImp implements EmpleadoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Empleado getPersonById(int id) {
//		Session session = this.sessionFactory.getCurrentSession();		
//		Empleado e = (Empleado) session.get(Empleado.class, id);		
		return null;

	}

	@Override
	public Empleado getPersonByUser(String user, String pass) {
		// TODO Auto-generated method stub
		
//		String hql="FROM Empleado E WHERE E.usuario=\'"+user+"\'";
//		Session session = this.sessionFactory.getCurrentSession();
//		Query query = session.createQuery(hql);
//		List<Empleado> results = query.list();
//		
//		Empleado e = results.get(0);
		
		return null;
	}

	@Override
	public List<Persona> getPersonaList() {
		Session session = this.sessionFactory.getCurrentSession();
		String sql = "SELECT * FROM persona WHERE sexo = :sexo";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Persona.class);
		query.setParameter("sexo", "M");
		List<Persona> results = query.list();
		return results;
	}

	@Override
	public Perfil getPerfil(String user, String pass) {
		Session session = this.sessionFactory.getCurrentSession();
		String sql = "SELECT T0.usuario,\r\n" + 
				"	  	     T1.num_dni,T1.ape_pat,T1.ape_mat,T1.nombres,\r\n" + 
				"	         T2.cod_facultad,T3.des_facultad,T2.cod_departamento,T4.des_departamento,T2.cod_condicion,T5.des_condicion,T2.cod_categoria,T6.des_categoria,T2.cod_clase,T7.des_clase,T7.num_horas\r\n" + 
				"FROM usuario T0,\r\n" + 
				"	  persona T1, \r\n" + 
				"     docente T2, \r\n" + 
				"     facultad T3, \r\n" + 
				"     departamento_academico T4,\r\n" + 
				"     condicion T5,\r\n" + 
				"     categoria T6,\r\n" + 
				"     clase T7\r\n" + 
				"WHERE  T0.Persona_num_dni=T1.num_dni  AND T0.usuario=:user  AND T0.contraseña=:pass AND\r\n" + 
				"       T1.num_dni=T2.num_dni  and T2.cod_facultad=T3.cod_facultad and\r\n" + 
				"       T2.cod_facultad=T4.cod_facultad AND T2.cod_departamento=T4.cod_departamento and\r\n" + 
				"       T2.cod_condicion=T5.cod_condicion and T2.cod_categoria = T6.cod_categoria and T2.cod_clase=T7.cod_clase";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Perfil.class);
		query.setParameter("user", user);
		query.setParameter("pass", pass);
		List<Perfil> results = query.list();
		Perfil p;
		try {
			 p = results.get(0);
		}catch (Exception e) {
			p=null;
		}
		
		
		return p;
	}

}
