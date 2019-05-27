package com.jpm.hr.exceptions;

public class HrExceptions extends Exception {
	private static final long serialVersionUID = 1L;

	public HrExceptions(String arg0) {
		super(arg0);
	}

	public HrExceptions(Throwable arg0) {
		super(arg0);
	}

	public HrExceptions(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
}
