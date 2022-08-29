/**
 * 
 */
package com.mycompany.department;

/**
 * @author bharat_2 HR department
 */
public class Hr_Department extends Department {

	/**
	 * returns department name as string
	 */

	public String departmentName() {
		return "HR Department";
	}

	/**
	 * returns todays work as string.
	 */
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}

	/**
	 * returns work deadline as string.
	 */
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	/**
	 * returns activity of department as string
	 */
	public String doActivity() {
		return "team Lunch";
	}

}
