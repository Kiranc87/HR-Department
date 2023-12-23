package org.jsp.HR.Department.Controller;

import java.util.List;

import org.jsp.HR.Department.DTO.Position;
import org.jsp.HR.Department.Exception.UserDefinedException;
import org.jsp.HR.Department.Helper.ResponseStructure;
import org.jsp.HR.Department.Service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("position")
public class PositionController {
	@Autowired
	PositionService positionService;

	@PostMapping("add")
	public ResponseStructure<Position> save(@RequestBody Position add) {
		return positionService.save(add);
	}
	@GetMapping("fetchallposition")
	public ResponseStructure<List<Position>> fetchallposition() throws UserDefinedException {
		return positionService.fetchallposition();
	}
}
