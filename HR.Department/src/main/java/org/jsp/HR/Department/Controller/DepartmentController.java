package org.jsp.HR.Department.Controller;
import java.util.List;

import org.jsp.HR.Department.DTO.Department;
import org.jsp.HR.Department.Helper.ResponseStructure;
import org.jsp.HR.Department.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("department")
public class DepartmentController {
	@Autowired
	 DepartmentService departmentService;

	@PostMapping("add")
	public ResponseStructure<Department> save(@RequestBody Department add) {
		return departmentService.save(add);
	}
	
}
