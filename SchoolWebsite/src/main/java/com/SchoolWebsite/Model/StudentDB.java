package com.SchoolWebsite.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.SchoolWebsite.Beans.StudentRegisterBean;

public class StudentDB {
	String s1=null;
	String s=null;
	String s3=null;
	
	public String insertStudent(StudentRegisterBean sb) {
		ProjectDB db=new ProjectDB();
		Connection con=db.getCon();
		ResultSet rs;
		int count=0;
		try {
			Statement stmt= con.createStatement();
			rs=stmt.executeQuery("select count(*) from students where email='"+sb.getEmail()+"'");
			if(rs.next()) {
				count = rs.getInt(1);
				
				System.out.println(count+ " similar record found");
			}
			if(count>0) {
				s1="Already Present";
			}
			else {
			stmt.executeUpdate("insert into students(name,email,password,phone,cls,stream) values ('"+sb.getName()+"','"+sb.getEmail()+"', '"+sb.getPassword()+"','"+sb.getPhone()+"','"+sb.getClas()+"','"+sb.getStream()+"')");
			s1="Data Inserted";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s1;
	}

public String ReadStudent(StudentRegisterBean sb) {
		
		ProjectDB db=new ProjectDB();
		Connection con=db.getCon();
		ResultSet rs;
		try {
			Statement stmt= con.createStatement();
			rs=stmt.executeQuery("select * from students where email='"+sb.getEmail()+"' and password='"+sb.getPassword()+"'");
			if(rs.next()) {
				String name= rs.getString("name"); 
				s=name;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}


public String StdPasswordResetBeforeLogin(StudentRegisterBean sb) {
	
	
	
	ResultSet rs;
	ProjectDB db2=new ProjectDB();
	Connection con=db2.getCon();
	
	try {
		Statement stmt= con.createStatement();
		
		rs=stmt.executeQuery("select password from students where email='"+sb.getEmail()+"'");
		if(rs.next()) {
			String stdclass= rs.getString("password"); 
			s3=stdclass;
			System.out.println(s+ " db before update");
		
		
		if(!s3.equals(sb.getPassword())) {
			
			stmt.executeUpdate("update students SET password='"+sb.getPassword()+"' where email='"+sb.getEmail()+"'");
		
		
			s3="Updated";
			System.out.println(sb.getPassword()+ " db update");
			
		}
        else {
            
        	
        	s3="Same Password";
        }
		}
		else {
			s3="Invalid Username";
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return s3;
	

}

	
	public String UpdatedStdPhone(StudentRegisterBean sb3) {
		
			
			String s2=null;
			ResultSet rs;
			ProjectDB db2=new ProjectDB();
			Connection con=db2.getCon();
			
			try {
				Statement stmt= con.createStatement();
				
				rs=stmt.executeQuery("select phone from students where email='"+sb3.getEmail()+"'");
				if(rs.next()) {
					String phone2= rs.getString("phone"); 
					s=phone2;
					System.out.println(s+ " db before update");
				}
				
				if(!s.equals(sb3.getPhone())) {
					
					stmt.executeUpdate("update students SET phone='"+sb3.getPhone()+"' where email='"+sb3.getEmail()+"'");
				
				
					s2="Updated";
					System.out.println(sb3.getPhone()+ " db update");
					
				}
	            else {
	                
	            	
	            	s2="Same Number";
	            }
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return s2;
			
		
	}
	
	
		
	   
	
	
	public StudentRegisterBean fetchStudentDetails(StudentRegisterBean sb) {
		
		ResultSet rs;
		ProjectDB db2=new ProjectDB();
		Connection con=db2.getCon();
        
        try {
        	Statement stmt= con.createStatement();
			rs=stmt.executeQuery("select * from students where email='"+sb.getEmail()+"'");
           
            // If user details found, create UserDetails object
            if (rs.next()) {
                
                sb.setEmail(rs.getString("email"));
                sb.setName(rs.getString("name"));
                sb.setClas(rs.getString("cls"));
                sb.setPhone(rs.getString("phone"));
                sb.setStream(rs.getString("stream"));
                 
                // Set other user details accordingly
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle database error
        
        }
        
        return sb;
    }
	
	
	public String UpdateStdName(StudentRegisterBean sb) {
		
		
		String s2=null;
		ResultSet rs;
		ProjectDB db2=new ProjectDB();
		Connection con=db2.getCon();
		
		try {
			Statement stmt= con.createStatement();
			
			rs=stmt.executeQuery("select name from students where email='"+sb.getEmail()+"'");
			if(rs.next()) {
				String name= rs.getString("name"); 
				s=name;
				System.out.println(s+ " db before update");
			}
			
			if(!s.equals(sb.getName())) {
				
				stmt.executeUpdate("update students SET name='"+sb.getName()+"' where email='"+sb.getEmail()+"'");
			
			
				s2="Updated";
				System.out.println(sb.getName()+ " db update");
				
			}
            else {
                
            	
            	s2="Same Name";
            }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return s2;
		
	
	}
	
	
public String UpdateStdClass(StudentRegisterBean sb) {
		
		
		String s2=null;
		ResultSet rs;
		ProjectDB db2=new ProjectDB();
		Connection con=db2.getCon();
		
		try {
			Statement stmt= con.createStatement();
			
			rs=stmt.executeQuery("select cls from students where email='"+sb.getEmail()+"'");
			if(rs.next()) {
				String stdclass= rs.getString("cls"); 
				s=stdclass;
				System.out.println(s+ " db before update");
			}
			
			if(!s.equals(sb.getClas())) {
				
				stmt.executeUpdate("update students SET cls='"+sb.getClas()+"' where email='"+sb.getEmail()+"'");
			
			
				s2="Updated";
				System.out.println(sb.getClas()+ " db update");
				
			}
            else {
                
            	
            	s2="Same Class";
            }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return s2;
		
	
	}


public String ResetStdPassword(StudentRegisterBean sb) {
	
	
	String s2=null;
	ResultSet rs;
	ProjectDB db2=new ProjectDB();
	Connection con=db2.getCon();
	
	try {
		Statement stmt= con.createStatement();
		
		rs=stmt.executeQuery("select password from students where email='"+sb.getEmail()+"'");
		if(rs.next()) {
			String stdclass= rs.getString("password"); 
			s=stdclass;
			System.out.println(s+ " db before update");
		}
		
		if(!s.equals(sb.getPassword())) {
			
			stmt.executeUpdate("update students SET password='"+sb.getPassword()+"' where email='"+sb.getEmail()+"'");
		
		
			s2="Updated";
			System.out.println(sb.getPassword()+ " db update");
			
		}
        else {
            
        	
        	s2="Same Password";
        }
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return s2;
	

}


public String RemoveStudent(StudentRegisterBean sb) {
	
	ProjectDB db=new ProjectDB();
	Connection con=db.getCon();
	
	/*try {
		Statement stmt= con.createStatement();
		stmt.executeUpdate("delete from students where email='"+sb.getEmail()+"'");
		
			s="Deleted";*/
	ResultSet rs;
	int count=0;
	try {
		Statement stmt= con.createStatement();
		rs=stmt.executeQuery("select count(*) from students where email='"+sb.getEmail()+"'");
		if(rs.next()) {
			count = rs.getInt(1);
			
			System.out.println(count+ " record found");
		}
		if(count>0) {
			stmt.executeUpdate("delete from students where email='"+sb.getEmail()+"'");
			
			s="Deleted";
		}
		else {
			s="Invalid Username";
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return s;
}


public List<StudentRegisterBean> viewAllStudents() {
    List<StudentRegisterBean> students = new ArrayList<>();
    ProjectDB db=new ProjectDB();
	Connection con=db.getCon();
    ResultSet rs = null;

    try {
       
       
        Statement stmt= con.createStatement();
		rs=stmt.executeQuery("SELECT * FROM students");
        // Populate list of student objects with fetched data
        while (rs.next()) {
        	StudentRegisterBean student = new StudentRegisterBean();
            student.setEmail(rs.getString("email"));
            student.setName(rs.getString("name"));
            student.setPhone(rs.getString("phone"));
            student.setClas(rs.getString("cls"));
            student.setStream(rs.getString("stream"));
          
            students.add(student);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } 
    
    return students;
}
	
}

