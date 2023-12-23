package org.jsp.HR.Department.Service;

import java.util.List;

import org.jsp.HR.Department.DAO.AttendanceDao;
import org.jsp.HR.Department.DAO.PositionDao;
import org.jsp.HR.Department.DTO.Attendance;
import org.jsp.HR.Department.DTO.Position;
import org.jsp.HR.Department.Exception.UserDefinedException;
import org.jsp.HR.Department.Helper.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
@Service
public class AttendanceService {
	@Autowired
	AttendanceDao dao;

	public ResponseStructure<Attendance> save(Attendance add) {
		ResponseStructure<Attendance> structure = new ResponseStructure<Attendance>();
		structure.setData(dao.save(add));
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("Position Added Succesfully");
		return structure;
	}

	public ResponseStructure<List<Attendance>> fetchallAttendance() throws UserDefinedException {
		ResponseStructure<List<Attendance>> structure = new ResponseStructure<List<Attendance>>();

		List<Attendance> attendances = dao.viewAllAttendance();

		if (attendances.isEmpty()) {
			throw new UserDefinedException("There are No Position");
		} else {
			structure.setData(attendances);
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setMessage("These are available positon");
		}
		return structure;
	}


}
