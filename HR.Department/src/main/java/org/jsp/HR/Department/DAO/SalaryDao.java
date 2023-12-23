package org.jsp.HR.Department.DAO;

import java.util.List;

import org.jsp.HR.Department.DTO.Position;
import org.jsp.HR.Department.DTO.Salary;
import org.jsp.HR.Department.Repository.PositionRepository;
import org.jsp.HR.Department.Repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SalaryDao {
	@Autowired
	SalaryRepository salaryRepository;

	public Salary save(Salary salary) {
		return salaryRepository.save(salary);
	}

	public List<Salary> viewAllsalary() {
		return salaryRepository.viewall();
	}

}
