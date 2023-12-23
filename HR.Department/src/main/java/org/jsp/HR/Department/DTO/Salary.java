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
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Salary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(insertable=false, updatable=false)
	private int position_id;
	private double basic_salary;
	private String hra;
	private String da;
	private double other_allowence;
	private double gross_salary;
	private Date created_at;
	private Date updated_at;
	
//	@OneToOne(mappedBy ="position")
//	private Position position2;
	
	@ManyToOne
	@JoinColumn(name = "position_id")
	private Position position;
	
}
