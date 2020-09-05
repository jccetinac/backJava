package com.example.demo.dao;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Menu;


@Repository
public interface MenuDao extends CrudRepository<Menu, Serializable> {
	
}
