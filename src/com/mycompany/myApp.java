/**
 * 
 */
package com.mycompany;

import com.mycompany.department.Admin_Department;
import com.mycompany.department.Hr_Department;
import com.mycompany.department.Tech_Department;

/**
 * @author bharat_2
 *
 */
public class myApp {

	/**
	 * @param args
	 * driver class with main method
	 */
	public static void main(String[] args) {
		Admin_Department admn_Dept= new Admin_Department();
		System.out.println("Welcome to " + admn_Dept.departmentName());
		System.out.println(admn_Dept.getTodaysWork());
		System.out.println(admn_Dept.getWorkDeadline());
		System.out.println(admn_Dept.isTodayAHoliday() + "\n");
		
		Hr_Department hr_Dept= new Hr_Department();
		System.out.println("Welcome to " + hr_Dept.departmentName());
		System.out.println(hr_Dept.doActivity());
		System.out.println(hr_Dept.getTodaysWork());
		System.out.println(hr_Dept.getWorkDeadline());
		System.out.println(hr_Dept.isTodayAHoliday() + "\n");
		
		Tech_Department tech_Dept= new Tech_Department();
		System.out.println("Welcome to " + tech_Dept.departmentName());
		System.out.println(tech_Dept.getTodaysWork());
		System.out.println(tech_Dept.getWorkDeadline());
		System.out.println(tech_Dept.getTechStackInformation());
		System.out.println(tech_Dept.isTodayAHoliday());
		
	}

}
