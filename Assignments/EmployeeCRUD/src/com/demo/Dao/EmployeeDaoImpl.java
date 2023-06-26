package com.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.*;
import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static Connection con;
	private static PreparedStatement psadd, psgetall, psdelById,psdisById,psudEmp,psSortBySal;
	static {

		try {
			con = DBUtils.getMyConnection();
			psadd = con.prepareStatement("insert into my_emp values(?,?,?,?);");
			psgetall = con.prepareStatement("select * from my_emp");
			psdelById = con.prepareStatement("delete from my_emp where empid=?");
			psdisById=con.prepareStatement("select * from my_emp where empid=?");
			psudEmp=con.prepareStatement("update my_emp set sal=? where empid=?");
			psSortBySal=con.prepareStatement("select * from my_emp order by sal");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void save(Employee e) {

		try {
			psadd.setInt(1, e.getEmpid());
			psadd.setString(2, e.getEname());
			psadd.setString(3, e.getLocation());
			psadd.setFloat(4, e.getSal());
			psadd.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void closeConnection() {

		DBUtils.closeMyConnection();

	}

	@Override
	public boolean deletById(int id) {
		try {
			psdelById.setInt(1, id);
			int n = psdelById.executeUpdate();
			return n > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<Employee> displayAll() {
		List<Employee> elist = new ArrayList<>();
		try {
			ResultSet rs = psgetall.executeQuery();
			while (rs.next()) {
				elist.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4)));
			}
			return elist;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee displayById(int empid) {
		try {
			psdisById.setInt(1, empid);
			ResultSet rs=psdisById.executeQuery();
			while(rs.next()) {
				return new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean UpdateEmp(int empid, float sal) {
		try {
			psudEmp.setFloat(1, sal);
			psudEmp.setInt(2, empid);
		
			int n=psudEmp.executeUpdate();
			return n>0?true:false;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Employee> SortBySal() {
		List<Employee> elist=new ArrayList<>();
		
		try {
			ResultSet rs=psSortBySal.executeQuery();
			
			while(rs.next()) {
				 elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4)));
			}
			return elist;
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return null;
	}



}
