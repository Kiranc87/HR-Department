package org.jsp.HR.Department.Repository;

import org.jsp.HR.Department.DTO.Department;
import org.jsp.HR.Department.DTO.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	Position save(Position position);
  
}
