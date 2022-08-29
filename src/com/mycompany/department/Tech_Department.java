/**
 * 
 */
package com.mycompany.department;

/**
 * @author bharat_2 Technical Department
 */
public class Tech_Department extends Department {

	/**
	 * returns department name as string
	 */

	public String departmentName() {
		return "Tech Department";
	}

	/**
	 * returns todays work as string.
	 */
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	/**
	 * returns work deadline as string.
	 */
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	/**
	 * returns technical stack information as string
	 */
	public String getTechStackInformation() {
		return "core Java";
	}

}
