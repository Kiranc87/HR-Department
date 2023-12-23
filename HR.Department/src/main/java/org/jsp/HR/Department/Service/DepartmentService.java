package org.jsp.HR.Department.Service;
import org.jsp.HR.Department.DAO.DepartmentDao;
import org.jsp.HR.Department.DTO.Department;
import org.jsp.HR.Department.Helper.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	@Autowired
	DepartmentDao dao;

	public ResponseStructure<Department> save(Department department) {
		ResponseStructure<Department> structure = new ResponseStructure<Department>();
		structure.setData(dao.save(department));
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("Department Added Succesfully");
		return structure;
	}
}
