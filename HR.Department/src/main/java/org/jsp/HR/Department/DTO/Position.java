package org.jsp.HR.Department.DTO;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(insertable=false, updatable=false)
	private int department_id;
	private String name;
	private Date created_at;
	private Date updated_at;
	
//	@OneToOne(mappedBy ="position" )
//	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "position_id")
//	private Salary salary;

	@OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name = "position_id")
	private List<Salary> salaries;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "position_id")
//	private Employee employees;

	@OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name = "position_id")
	private List<Employee> employees ;

}
