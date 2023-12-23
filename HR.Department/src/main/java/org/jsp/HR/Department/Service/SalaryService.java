package org.jsp.HR.Department.Service;

import java.util.List;

import org.jsp.HR.Department.DAO.SalaryDao;
import org.jsp.HR.Department.DTO.Position;
import org.jsp.HR.Department.DTO.Salary;
import org.jsp.HR.Department.Exception.UserDefinedException;
import org.jsp.HR.Department.Helper.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
@Service
public class SalaryService {

	@Autowired
	SalaryDao dao;
	public ResponseStructure<Salary> save(Salary add) {
		ResponseStructure<Salary> structure = new ResponseStructure<Salary>();
		structure.setData(dao.save(add));
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("Salary Added Succesfully");
		return structure;
	}
	public ResponseStructure<List<Salary>> fetchallposition() throws UserDefinedException {
		ResponseStructure<List<Salary>> structure = new ResponseStructure<List<Salary>>();

		List<Salary> salary = dao.viewAllsalary();

		if (salary.isEmpty()) {
			throw new UserDefinedException("There are No Position");
		} else {
			structure.setData(salary);
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setMessage("These are available salary");
		}
		return structure;
	}

}
