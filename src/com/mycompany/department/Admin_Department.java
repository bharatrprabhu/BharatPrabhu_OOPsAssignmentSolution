/**
 * 
 */
package com.mycompany.department;

/**
 * @author bharat_2 Admin Department
 * 
 */
public class Admin_Department extends Department {
	/**
	 * returns department name as string
	 */

	public String departmentName() {
		return "Admin Department";
	}

	/**
	 * returns todays work as string.
	 */
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	/**
	 * returns work deadline as string.
	 */
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
