package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RegistroDao;
import com.example.demo.model.Registro;

@Service
public class RegistroService {
	@Autowired
	RegistroDao registroDao;
	
	public List<Registro> verRegistros(){
		List<Registro> registros = (List<Registro>) registroDao.findAll();
		return registros;
	}
	
	public void guardar(Registro newRegistro) {
		registroDao.save(newRegistro);		
	}

}
