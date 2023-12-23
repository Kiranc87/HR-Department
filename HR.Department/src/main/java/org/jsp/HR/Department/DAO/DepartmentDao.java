package org.jsp.HR.Department.DAO;

import org.jsp.HR.Department.DTO.Department;
import org.jsp.HR.Department.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DepartmentDao {
	@Autowired
	DepartmentRepository departmentRepository;

	public Department save(Department department) {
		return departmentRepository.save(department);
	}
}
