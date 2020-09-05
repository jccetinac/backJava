package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MenuDao;
import com.example.demo.model.Menu;

@Service
public class MenuService {
	@Autowired
	MenuDao menuDao;
	
	public List<Menu> verMenues(){
		List<Menu> registros = (List<Menu>) menuDao.findAll();
		return registros;
	}


}
