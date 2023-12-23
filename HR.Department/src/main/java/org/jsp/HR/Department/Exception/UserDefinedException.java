package org.jsp.HR.Department.Exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserDefinedException extends Exception {
	private String msg;

//	public UserDefinedException(String msg) {
//		super();
//		this.msg = msg;
//	}

	@Override
	public String toString() {
		return msg;
	}
}
