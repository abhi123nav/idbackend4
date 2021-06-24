package com.idbackend4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.idbackend4.entity.idbackend4;
import com.idbackend4.sevice.idbackend4service;


@RestController
@CrossOrigin
public class idbackend4controller {

	@Autowired
	idbackend4service idbackend4service1;
		
	//@GetMapping("/cnames")
	//public ResponseEntity<List<Id1>> getcnames()
	//{
//		List<Id1> cname=id1service.getAllcnames();
	//if(cname.size()<=0)
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	//return ResponseEntity.status(HttpStatus.CREATED).body(cname);
//		}

	@GetMapping("/cnames")
	public ResponseEntity<List<idbackend4>> getallcnames()
	{
	List<idbackend4> products=(List<idbackend4>)this.idbackend4service1.getAllcnames();	
	if(products.size()<=0)
	{
	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	System.out.println("hello");
	return ResponseEntity.status(HttpStatus.CREATED).body(products);	
//		return ResponseEntity.of(Optional.of(products));

	}


	//@GetMapping("/cnames/{id}")
	//public ResponseEntity<List<Id1>> getcdetails(@PathVariable("id") int id)
	//{List<Id1> id1=id1service.getcdetails(id);
	//if(id1==null)
	//{
	//return ResponseEntity.status(HttpStatus.NOT_FOUND).build();	
	//}
	//return ResponseEntity.of(Optional.of(id1));
//		}

	@GetMapping("/cnames/{name}")
	public ResponseEntity<List<idbackend4>> getcdetails(@PathVariable("name") String name)
	{List<idbackend4> id1=idbackend4service1.getAllCompany(name);
	if(id1==null)
	{
	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();	
	}
	return ResponseEntity.of(Optional.of(id1));
		}
	


@PostMapping("/cnames")
public ResponseEntity<idbackend4> addproducts(@RequestBody idbackend4 product)
{idbackend4 p=null;
	try {
		p=this.idbackend4service1.addProducts(product);
		return ResponseEntity.of(Optional.of(p));
	}
	catch(Exception e)
	{
	e.printStackTrace();	
	}
	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
}

//delete
@DeleteMapping("/cnames/{name}")
public ResponseEntity<Void> deleteProduct(@PathVariable("name") String name)
{
try {
	this.idbackend4service1.deleteProduct(name);
	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}	
catch(Exception e)
{
e.printStackTrace();
return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
}
}
	
	
	}

