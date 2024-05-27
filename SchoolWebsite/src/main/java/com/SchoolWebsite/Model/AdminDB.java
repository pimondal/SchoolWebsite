package com.SchoolWebsite.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.SchoolWebsite.Beans.AdminBean;


public class AdminDB {
	String s=null;
public String ReadAdmin(AdminBean ab) {
		
		ProjectDB db=new ProjectDB();
		Connection con=db.getCon();
		ResultSet rs;
		try {
			Statement stmt= con.createStatement();
			rs=stmt.executeQuery("select aname, apassword from admin where aname='"+ab.getAname()+"' and apassword='"+ab.getApassword()+"'");
			if(rs.next()) {
				s="success";
			}
			else {
				s="unsuccess";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}

}
