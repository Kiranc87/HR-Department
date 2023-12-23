package org.jsp.HR.Department.Service;

import java.util.List;

import org.jsp.HR.Department.DAO.PositionDao;
import org.jsp.HR.Department.DTO.Position;
import org.jsp.HR.Department.Exception.UserDefinedException;
import org.jsp.HR.Department.Helper.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PositionService {
	@Autowired
	PositionDao dao;

	public ResponseStructure<Position> save(Position add) {
		ResponseStructure<Position> structure = new ResponseStructure<Position>();
		structure.setData(dao.save(add));
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("Position Added Succesfully");
		return structure;
	}

	public ResponseStructure<List<Position>> fetchallposition() throws UserDefinedException {
		ResponseStructure<List<Position>> structure = new ResponseStructure<List<Position>>();

		List<Position> position = dao.viewAllPosition();

		if (position.isEmpty()) {
			throw new UserDefinedException("There are No Position");
		} else {
			structure.setData(position);
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setMessage("These are available positon");
		}
		return structure;
	}

}
