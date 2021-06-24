package com.idbackend4.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.idbackend4.entity.idbackend4;



public interface idbackend4Repository extends CrudRepository<idbackend4,String>{
//	public Id1 findById(int id);
	public List<idbackend4> findByCname(String name);

//	public void deleteById(Integer name);

	

} 
