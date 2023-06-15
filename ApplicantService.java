package com.spaceBooking.service;

import java.sql.Timestamp;
import java.util.Calendar;

import com.spaceBooking.dao.ApplicantDao;
import com.spaceBooking.model.Applicant;

public class ApplicantService {

	private ApplicantDao applicantDao;
	
	
	public ApplicantService() {
		super();
		this.applicantDao = new ApplicantDao();
	}


	public void saveBookingDetailService(Applicant applicantObj){
		
		long millis = System.currentTimeMillis();
		java.sql.Date CreatedDate = new java.sql.Date(millis);
		Calendar calendar = Calendar.getInstance();
		Timestamp timesatmpObj = new Timestamp(calendar.getTimeInMillis());
		
		long count = applicantDao.getCount();
		long countVar = count + 1;
		String appNumber = "Space"+"-"+CreatedDate+"-"+countVar;
		applicantObj.setApplicationNumber(appNumber);
		
		applicantDao.saveBooking(applicantObj,CreatedDate,timesatmpObj);
		
		
	}
}
