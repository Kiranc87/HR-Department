package org.jsp.HR.Department.DTO;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter@Setter
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(insertable=false, updatable=false)
	private int employee_id;
	private double in_time;
	private double out_time;
	private Date created_at;
	private Date updated_at;
	
//	@OneToOne(mappedBy ="employee")
//	private Position position2;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
}
