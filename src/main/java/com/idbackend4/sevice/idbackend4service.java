package com.idbackend4.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idbackend4.dao.idbackend4Repository;
import com.idbackend4.entity.idbackend4;



@Service
public class idbackend4service {
	@Autowired
	private idbackend4Repository idbackend4repository;
	
public List<idbackend4> getAllcnames(){
	List<idbackend4> list=(List<idbackend4>)this.idbackend4repository.findAll();
	return list;
}

//public Id1 getcdetails(int id){
//	Id1 id1=null;
//			try {
//				id1=this.id1repository.findById(id);
//						}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//							}
//			return id1;	
//}

public List<idbackend4> getAllCompany(String name){
	List<idbackend4> id1=null;
			try {
				id1=this.idbackend4repository.findByCname(name);
						}
			catch(Exception e)
			{
				e.printStackTrace();
							}
			return id1;	
}

//public List<Id1> getcdetails(int id) {
//	List<Id1> id1=null;
//	try {
//		id1=this.id1repository.findByCname(id);
//				}
//	catch(Exception e)
//	{
//		e.printStackTrace();
//					}
//	return id1;	
//}

}

