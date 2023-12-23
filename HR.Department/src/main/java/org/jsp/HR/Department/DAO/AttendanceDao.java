package org.jsp.HR.Department.DAO;

import java.util.List;

import org.jsp.HR.Department.DTO.Attendance;
import org.jsp.HR.Department.DTO.Department;
import org.jsp.HR.Department.DTO.Position;
import org.jsp.HR.Department.Repository.AttendanceRepository;
import org.jsp.HR.Department.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AttendanceDao {
	@Autowired
	AttendanceRepository attendanceRepository;

	public Attendance save(Attendance attendance) {
		return attendanceRepository.save(attendance);
	}

	public List<Attendance> viewAllAttendance() {
		return attendanceRepository.viewall();
	}

}
