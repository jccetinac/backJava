package com.example.demo.dao;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Registro;


@Repository
public interface RegistroDao extends CrudRepository<Registro, Serializable> {

	public abstract Registro findByEmail(String email);

	
}
