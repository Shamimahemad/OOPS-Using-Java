package Dao;

import java.sql.SQLException;
import java.util.List;

import POJO.Employee;

public interface EmloyeeDao {
    
	
	List<Employee> getEmpDetailsById(int empid) throws SQLException;
		
	
}
