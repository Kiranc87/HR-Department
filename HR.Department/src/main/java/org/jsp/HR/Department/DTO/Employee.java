package org.jsp.HR.Department.DTO;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(insertable=false, updatable=false)
	private int department_id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(insertable=false, updatable=false)
	private int position_id;
	private String name;
	private String email;
	private Number phone_number;
	private String address;
	private Date created_at;
	private Date updated_at;
	
//	@OneToOne(mappedBy ="position" )
//	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
//	@OneToOne(mappedBy ="position")
//	private Position position2;
	
	@ManyToOne
	@JoinColumn(name = "position_id")
	private Position position;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "employee_id")
//	private Attendance attendances;

	@OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name = "employee_id")
	private List<Attendance> attendances;
}
