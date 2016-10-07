package com.cg.util;

import com.cg.DAO.CarDAO;
import com.cg.DAO.impl.JDBCCarDAO;

//TODO 1 Import appropriate packages based on TODOs 2 and 3

//Follow TODOs (if available)
/**
 * 
 * This is a DBUtility class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */
public class DBUtility {
	
	public static CarDAO carDao=null;

	public static CarDAO getCarDAO() {
		
		try {
			System.out.println("creating carDao");
			carDao =  new JDBCCarDAO();
		} catch (ServiceLocatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return carDao;
	}
	//TODO 2 Declare a static reference dao of type CarDAO pointing to JDBCCarDAO instance
		
	/**
	 * @return	CarDAO a factory for creating DAO 
	 */
	 //TODO 3 Implement a method getCarDAO which returns dao created in TODO 1
	
}
