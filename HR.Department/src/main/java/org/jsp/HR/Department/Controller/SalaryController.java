package org.jsp.HR.Department.Controller;

import java.util.List;

import org.jsp.HR.Department.DTO.Position;
import org.jsp.HR.Department.DTO.Salary;
import org.jsp.HR.Department.Exception.UserDefinedException;
import org.jsp.HR.Department.Helper.ResponseStructure;
import org.jsp.HR.Department.Service.PositionService;
import org.jsp.HR.Department.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("salary")
public class SalaryController {

		@Autowired
		SalaryService salaryService;

		@PostMapping("add")
		public ResponseStructure<Salary> save(@RequestBody Salary add) {
			return salaryService.save(add);
		}
		@GetMapping("fetchallsalary")
		public ResponseStructure<List<Salary>> fetchallposition() throws UserDefinedException {
			return salaryService.fetchallposition();
		}
}
