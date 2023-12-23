package org.jsp.HR.Department.Repository;

import java.util.List;

import org.jsp.HR.Department.DTO.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> {

	Salary save(Salary salary);

	@Query("select a from Salary a ")
	List<Salary> viewall();

}
