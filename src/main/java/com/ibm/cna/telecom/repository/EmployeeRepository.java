package com.ibm.cna.telecom.repository;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.cna.telecom.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{
	
}
