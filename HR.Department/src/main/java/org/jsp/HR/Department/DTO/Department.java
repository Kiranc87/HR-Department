package org.jsp.HR.Department.DTO;

import java.util.Date;
import java.util.List;

import org.hibernate.mapping.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Date created_at;
	private Date updated_at;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "department_id")
//	private Position position;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private List<Position> positions;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "department_id")
//	private Employee employees;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private List<Employee> employees;
}
