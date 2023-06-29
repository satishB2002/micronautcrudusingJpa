package com.micronautCrud.dao;

import com.micronautCrud.entity.EmployeeEntity;



import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;


@Repository
public interface MyDao extends JpaRepository<EmployeeEntity, Integer> {

}
