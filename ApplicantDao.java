package com.spaceBooking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.spaceBooking.database.DbConnection;
import com.spaceBooking.model.Applicant;

public class ApplicantDao {
	
	Connection connection = null;
	Statement st = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	
	
	public int saveBooking(Applicant applicantObj){
		int result = 0;
		String insertQuery = "insert into app.space_booking(application_number,name"
				+ ",address,nric_number,home_ph_no,office_ph_no,hand_ph_no ,email,"
				+ "total_amount,booking_date,L1s1,L1s2,L1s3,L1s4,L1s5,L1s6,L1s7,L1s8,L1s9,L1s10,L1s11,"
				+ "L1s12,L1s13,L1s14,L1s15,L1s16,L1s17,L1s18,L1s19,L1s20,L2s1,L2s2,L2s3,L2s4,L2s5,"
				+ "L2s6,L2s7,L2s8,L2s9,L2s10,no_of_days_booked,approval_status,oic_comment,oic_followup_date_time,"
				+ "created_date,created_date_time) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		
		
		try {
			connection = new DbConnection().getConnection();
			preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, applicantObj.getApplicationNumber());	
			preparedStatement.setString(2, applicantObj.getName());
			preparedStatement.setString(3, applicantObj.getAddress());
			preparedStatement.setString(4, applicantObj.getNricNumber());
			preparedStatement.setString(5, applicantObj.getHomePhoneNumber());
			preparedStatement.setString(6, applicantObj.getOfficePhoneNumber());
			preparedStatement.setString(7, applicantObj.getHandPhoneNumber());
			preparedStatement.setString(8, applicantObj.getEmail());
			preparedStatement.setDouble(9, applicantObj.getTotalAmount());;
			preparedStatement.setString(10, applicantObj.getBookingDate());
			preparedStatement.setString(11, applicantObj.getL1s1());
			preparedStatement.setString(12, applicantObj.getL1s2());
			preparedStatement.setString(13, applicantObj.getL1s3());
			preparedStatement.setString(14, applicantObj.getL1s4());
			preparedStatement.setString(15, applicantObj.getL1s5());
			preparedStatement.setString(16, applicantObj.getL1s6());
			preparedStatement.setString(17, applicantObj.getL1s7());
			preparedStatement.setString(18, applicantObj.getL1s8());
			preparedStatement.setString(19, applicantObj.getL1s9());
			preparedStatement.setString(20, applicantObj.getL1s10());
			preparedStatement.setString(21, applicantObj.getL1s11());
			preparedStatement.setString(22, applicantObj.getL1s12());
			preparedStatement.setString(23, applicantObj.getL1s13());
			preparedStatement.setString(24, applicantObj.getL1s14());
			preparedStatement.setString(25, applicantObj.getL1s15());
			preparedStatement.setString(26, applicantObj.getL1s16());
			preparedStatement.setString(27, applicantObj.getL1s17());
			preparedStatement.setString(28, applicantObj.getL1s18());
			preparedStatement.setString(29, applicantObj.getL1s19());
			preparedStatement.setString(30, applicantObj.getL1s20());
			preparedStatement.setString(31, applicantObj.getL2s1());
			preparedStatement.setString(32, applicantObj.getL2s2());
			preparedStatement.setString(33, applicantObj.getL2s3());
			preparedStatement.setString(34, applicantObj.getL2s4());
			preparedStatement.setString(35, applicantObj.getL2s5());
			preparedStatement.setString(36, applicantObj.getL2s6());
			preparedStatement.setString(37, applicantObj.getL2s7());
			preparedStatement.setString(38, applicantObj.getL2s8());
			preparedStatement.setString(39, applicantObj.getL2s9());
			preparedStatement.setString(40, applicantObj.getL2s10());
			preparedStatement.setString(41, applicantObj.getNoOfDaysBooked());
			preparedStatement.setString(42, applicantObj.getApprovalStatus());
			preparedStatement.setString(43, applicantObj.getOicComment());
			preparedStatement.setString(44, applicantObj.getOicFollowUpdateTime());
			preparedStatement.setString(45, applicantObj.getCreatedDate());
			preparedStatement.setString(46, applicantObj.getCreatedDateTime());
			
			result = preparedStatement.executeUpdate();
			if (result > 0) {
				System.out.println("Successfully inserted into table");
			} else {
				System.out.println("Error while inserting into table");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				preparedStatement.close();
			} catch (SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}

		}
		
		return result;
		
	}

}
