package com.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class EmployeeDAO {
    Connection connection = null;
	    
	    public void addEmployee(Employee employee) {
	    	try {
				connection = ConnectionManager.getConnection();
				String query = "insert into employee values(?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(query);
				
				statement.setInt(1, employee.getId());
				statement.setString(2, employee.getName());
				statement.setString(3, employee.getDepartment());
				statement.setDouble(4, employee.getSalary());
				
				int count = statement.executeUpdate();
				
				if(count!=0) {
					connection.commit();
					System.out.println("Record inserted successfully.....");
				}else {
					connection.rollback();
					System.out.println("Error in record........");
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }	
    	public void removeEmployee(int id) {
    	try {
			connection = ConnectionManager.getConnection();
			String query = "delete from employee where id=?";
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1,id);
			
			
			int count = statement.executeUpdate();
			
			if(count!=0) {
				connection.commit();
				System.out.println("Record deleted successfully.....");
			}else {
				connection.rollback();
				System.out.println("Error in record........");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void upadateName(String name,int id) {
    	try {
			connection = ConnectionManager.getConnection();
			String query = "update  employee set name = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1,name);
			statement.setInt(2, id);
			
			
			int count = statement.executeUpdate();
			
			if(count!=0) {
				connection.commit();
				System.out.println("Record updated successfully.....");
			}else {
				connection.rollback();
				System.out.println("Error in record........");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
    public void upadateDepartment(String department,int id) {
    	try {
			connection = ConnectionManager.getConnection();
			String query = "update  employee set department = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1,department);
			statement.setInt(2, id);
			
			
			int count = statement.executeUpdate();
			
			if(count!=0) {
				connection.commit();
				System.out.println("Record updated successfully.....");
			}else {
				connection.rollback();
				System.out.println("Error in record........");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
    public void upadateSalary(double salary,int id) {
    	try {
			connection = ConnectionManager.getConnection();
			String query = "update  employee set salary = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setDouble(1,salary);
			statement.setInt(2, id);
			
			
			int count = statement.executeUpdate();
			
			if(count!=0) {
				connection.commit();
				System.out.println("Record updated successfully.....");
			}else {
				connection.rollback();
				System.out.println("Error in record........");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
    public void searchEmployee(int id) {

        try {
            connection = ConnectionManager.getConnection();
            String query = "select * from employee where id = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                System.out.println("Employee Found:");
                System.out.println("ID        : " + rs.getInt("id"));
                System.out.println("Name      : " + rs.getString("name"));
                System.out.println("Department: " + rs.getString("department"));
                System.out.println("Salary    : " + rs.getDouble("salary"));
            } else {
                System.out.println("Employee not found with ID: " + id);
            }

            connection.commit();

            rs.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
    
	
}
