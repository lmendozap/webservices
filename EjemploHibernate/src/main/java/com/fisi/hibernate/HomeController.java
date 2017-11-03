package com.fisi.hibernate;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fisi.hibernate.model.Empleado;
import com.fisi.hibernate.model.Perfil;
import com.fisi.hibernate.model.Persona;
import com.fisi.hibernate.service.EmpleadoService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
 
	@Autowired
	private EmpleadoService empleadoService;

	public void setEmpleadoService(EmpleadoService es) {
		this.empleadoService = es;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/empleados/{id}", method = RequestMethod.GET)
	public @ResponseBody Empleado listPersons(@PathVariable("id") int id, Model model) {
		logger.info("Estamos respondiendo a la solicitud de /empleado");

		Empleado e = new Empleado();
		e = this.empleadoService.getPersonById(id);

		return e;
	}
	
	@RequestMapping(value = "/empleados/{user}/{pass}", method = RequestMethod.GET)
	public @ResponseBody Empleado login(@PathVariable("user") String user,@PathVariable("pass") String pass, Model model) {
		

		Empleado e = new Empleado();
		e = this.empleadoService.getPersonById(0);
		e=null;
		e = this.empleadoService.getPersonByUser(user, pass);
		
		return e;
	}


	@RequestMapping(value = "/empleado", method = RequestMethod.GET)
	public @ResponseBody Empleado obtenerHora(Locale locale, Model model) {

		logger.info("Estamos respondiendo a la solicitud de /empleado");

		Empleado e = new Empleado();
		e = this.empleadoService.getPersonById(1);

		return e;
	}
	
	@RequestMapping(value = "/personas", method = RequestMethod.GET)
	public @ResponseBody List<Persona> obtenerPersonas(Locale locale, Model model) {

		logger.info("Estamos respondiendo a la solicitud de /personas");

		List<Persona> listaPersonas;
		listaPersonas = this.empleadoService.getPersonaList();

		return listaPersonas;
	}
	
	@RequestMapping(value = "/perfil/{user}/{pass}", method = RequestMethod.GET)
	public @ResponseBody Perfil obtenerPerfil(@PathVariable("user") String user,@PathVariable("pass") String pass,Locale locale, Model model) {

		logger.info("Estamos respondiendo a la solicitud de /perfil");

		Perfil p= this.empleadoService.getPerfil(user,pass);
		

		return p;
	}

	public EmpleadoService getEmpleadoService() {
		return empleadoService;
	}

}
