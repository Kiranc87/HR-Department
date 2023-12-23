package org.jsp.HR.Department.Repository;

import java.util.List;

import org.jsp.HR.Department.DTO.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<AttendanceRepository, Integer> {

	Attendance save(Attendance attendance);

	@Query("select a from Attendance a ")
	List<Attendance> viewall();

}
