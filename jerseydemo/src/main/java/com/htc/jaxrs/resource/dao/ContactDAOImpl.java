package com.htc.jaxrs.resource.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.htc.jaxrs.bo.ContactInfo;

public class ContactDAOImpl implements ContactDAO{

	private Connection getConnection(){
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/University","postgres","123Welcome");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	public ContactInfo findContactById(String contactId) {
		ContactInfo contactInfo = null;
		Connection con = getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("select contactName, organization, address, landlineno, mobileno, emailid from contactInfo where contactId = ?");
			pst.setString(1, contactId);
			ResultSet contactResult = pst.executeQuery();
			if(contactResult.next()) {
				contactInfo = new ContactInfo(contactId, contactResult.getString(1),contactResult.getString(2),contactResult.getString(3),contactResult.getString(4),contactResult.getString(5),contactResult.getString(6));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return contactInfo;
	}

	
	public ArrayList<ContactInfo> findContactByOrganization(String organization) {
		ArrayList<ContactInfo> contactList = new ArrayList<ContactInfo>();
		Connection con = getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("select contactId, contactName, address, landlineno, mobileno, emailid from contactInfo where organization = ?");
			pst.setString(1, organization);
			ResultSet contactResult = pst.executeQuery();
			while(contactResult.next()) {
				contactList.add(new ContactInfo(contactResult.getString(1), contactResult.getString(2), organization, contactResult.getString(3),contactResult.getString(4),contactResult.getString(5),contactResult.getString(6)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return contactList;	
	}

}
