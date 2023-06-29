package com.micronautCrud.controller;

import java.util.List;
import com.micronautCrud.dao.MyDao;
import com.micronautCrud.entity.EmployeeEntity;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
@Controller("/employee")
public class MyController {
	@Inject
	private MyDao myDao;
	@Post("/add")
	public EmployeeEntity addData(@Body EmployeeEntity employeeEntity)
	{
		myDao.save(employeeEntity);
		return employeeEntity;
	}
	@Post("/aA")
	public List<EmployeeEntity> addEmployees(@Body List<EmployeeEntity> employee  )
	{	
		
		myDao.saveAll(employee);
		System.out.println("D");
		return employee;
			
	}
	@Get("/get/all")
	public List<EmployeeEntity> getUsers() {
		return  myDao.findAll();
	}
	@Get("/show")
	public List<EmployeeEntity> findById()
	{
		System.out.println("C 1");
		return myDao.findAll();
	}
	@Put("/put")
	public EmployeeEntity puData(EmployeeEntity employeeEntity)
	{
		myDao.update(employeeEntity);
		return employeeEntity;
	}
	@Delete("/delete/{id}")
	public String deleteData(int id)
	{
		myDao.deleteById(id);
		return "Your Id is Deleted =="+id ;	
	}
}