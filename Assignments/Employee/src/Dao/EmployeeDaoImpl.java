package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import POJO.Employee;

import static utils.DBUtils.openConnection;

public class EmployeeDaoImpl implements EmloyeeDao{

	 private Connection connection;
	 private PreparedStatement pst;
	public EmployeeDaoImpl() throws SQLException {
	connection=openConnection();
	String sql="select ename,location,sal from my_emp where empid=?";
	pst=connection.prepareStatement(sql);
	  
	}
	public List<Employee> getEmpDetailsById(int empid) throws SQLException{
	List<Employee> elist=new ArrayList<>();
	pst.setInt(1, empid);
	try( ResultSet rs=pst.executeQuery();){
		while(rs.next()) {
elist.add(new Employee(rs.getString(1),rs.getString(2),rs.getFloat(3)));
		}
	}
	return elist;
	}
	
}
