package org.jsp.HR.Department.DAO;

import java.util.List;

import org.jsp.HR.Department.DTO.Position;
import org.jsp.HR.Department.Repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PositionDao {
	@Autowired
	PositionRepository positionRepository;

	public Position save(Position position) {
		return positionRepository.save(position);
	}

	public List<Position> viewAllPosition() {
		
		return positionRepository.viewall();
	}
}
