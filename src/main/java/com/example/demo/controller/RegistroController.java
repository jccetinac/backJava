package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Menu;
import com.example.demo.model.Registro;
import com.example.demo.services.MenuService;
import com.example.demo.services.RegistroService;

@RestController
public class RegistroController {

	@Autowired
	RegistroService registroService;
	
	@Autowired
	MenuService menuService;
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/menu")
	public List<Menu> menu() {	
		List<Menu> lista= menuService.verMenues();
		return lista;	
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/registros")
	public List<Registro> saludar() throws Exception {					
		List<Registro> lista= registroService.verRegistros();
		return lista;	
		
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/guardar")
	public String guardar(@RequestBody @Valid Registro registro) {					
		registroService.guardar(registro);
		return "guardado";	
		
	}
	
	@RequestMapping("/despedir")
	public String despedir() {
		return "chaito";
	}
	
}
