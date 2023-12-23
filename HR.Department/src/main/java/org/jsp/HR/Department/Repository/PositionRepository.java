package org.jsp.HR.Department.Repository;

import java.util.List;

import org.jsp.HR.Department.DTO.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {

	@Query("select a from Position a ")
	List<Position> viewall();

}
