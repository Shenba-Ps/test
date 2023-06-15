package com.spaceBooking.model;

import java.io.Serializable;

public class Applicant implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String applicationNumber;
	private String name;
	private String address;
	private String nricNumber;
	private String email;
	private String usageTrade;
	private String usageTradeOthers;
	private String homePhoneNumber;
	private String officePhoneNumber;
	private String handPhoneNumber;
	private Double totalAmount;
	private String bookingDate;
	private String createdDate;
	private String createdDateTime;
	private String L1s1;
	private String L1s2;
	private String L1s3;
	private String L1s4;
	private String L1s5;
	private String L1s6;
	private String L1s7;
	private String L1s8;
	private String L1s9;
	private String L1s10;
	private String L1s11;
	private String L1s12;	
	private String L1s13;
	private String L1s14;
	private String L1s15;
	private String L1s16;
	private String L1s17;
	private String L1s18;
	private String L1s19;
	private String L1s20;
	private String L2s1;
	private String L2s2;
	private String L2s3;
	private String L2s4;
	private String L2s5;
	private String L2s6;
	private String L2s7;
	private String L2s8;
	private String L2s9;
	private String L2s10;
	private String noOfDaysBooked;
	private String approvalStatus;
	private String oicComment;
	private String oicFollowUpdateTime;
	public Applicant() {
		super();
	}
	public Applicant(String applicationNumber, String name, String address,
			String nricNumber, String email, String usageTrade,
			String usageTradeOthers, String homePhoneNumber,
			String officePhoneNumber, String handPhoneNumber, Double totalAmount,
			String bookingDate, String createdDate, String createdDateTime,
			String l1s1, String l1s2, String l1s3, String l1s4, String l1s5,
			String l1s6, String l1s7, String l1s8, String l1s9, String l1s10,
			String l1s11, String l1s12, String l1s13, String l1s14,
			String l1s15, String l1s16, String l1s17, String l1s18,
			String l1s19, String l1s20, String l2s1, String l2s2, String l2s3,
			String l2s4, String l2s5, String l2s6, String l2s7, String l2s8,
			String l2s9, String l2s10, String noOfDaysBooked,
			String approvalStatus, String oicComment, String oicFollowUpdateTime) {
		super();
		this.applicationNumber = applicationNumber;
		this.name = name;
		this.address = address;
		this.nricNumber = nricNumber;
		this.email = email;
		this.usageTrade = usageTrade;
		this.usageTradeOthers = usageTradeOthers;
		this.homePhoneNumber = homePhoneNumber;
		this.officePhoneNumber = officePhoneNumber;
		this.handPhoneNumber = handPhoneNumber;
		this.totalAmount = totalAmount;
		this.bookingDate = bookingDate;
		this.createdDate = createdDate;
		this.createdDateTime = createdDateTime;
		L1s1 = l1s1;
		L1s2 = l1s2;
		L1s3 = l1s3;
		L1s4 = l1s4;
		L1s5 = l1s5;
		L1s6 = l1s6;
		L1s7 = l1s7;
		L1s8 = l1s8;
		L1s9 = l1s9;
		L1s10 = l1s10;
		L1s11 = l1s11;
		L1s12 = l1s12;
		L1s13 = l1s13;
		L1s14 = l1s14;
		L1s15 = l1s15;
		L1s16 = l1s16;
		L1s17 = l1s17;
		L1s18 = l1s18;
		L1s19 = l1s19;
		L1s20 = l1s20;
		L2s1 = l2s1;
		L2s2 = l2s2;
		L2s3 = l2s3;
		L2s4 = l2s4;
		L2s5 = l2s5;
		L2s6 = l2s6;
		L2s7 = l2s7;
		L2s8 = l2s8;
		L2s9 = l2s9;
		L2s10 = l2s10;
		this.noOfDaysBooked = noOfDaysBooked;
		this.approvalStatus = approvalStatus;
		this.oicComment = oicComment;
		this.oicFollowUpdateTime = oicFollowUpdateTime;
	}
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNricNumber() {
		return nricNumber;
	}
	public void setNricNumber(String nricNumber) {
		this.nricNumber = nricNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsageTrade() {
		return usageTrade;
	}
	public void setUsageTrade(String usageTrade) {
		this.usageTrade = usageTrade;
	}
	public String getUsageTradeOthers() {
		return usageTradeOthers;
	}
	public void setUsageTradeOthers(String usageTradeOthers) {
		this.usageTradeOthers = usageTradeOthers;
	}
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}
	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}
	public String getOfficePhoneNumber() {
		return officePhoneNumber;
	}
	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}
	public String getHandPhoneNumber() {
		return handPhoneNumber;
	}
	public void setHandPhoneNumber(String handPhoneNumber) {
		this.handPhoneNumber = handPhoneNumber;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public String getL1s1() {
		return L1s1;
	}
	public void setL1s1(String l1s1) {
		L1s1 = l1s1;
	}
	public String getL1s2() {
		return L1s2;
	}
	public void setL1s2(String l1s2) {
		L1s2 = l1s2;
	}
	public String getL1s3() {
		return L1s3;
	}
	public void setL1s3(String l1s3) {
		L1s3 = l1s3;
	}
	public String getL1s4() {
		return L1s4;
	}
	public void setL1s4(String l1s4) {
		L1s4 = l1s4;
	}
	public String getL1s5() {
		return L1s5;
	}
	public void setL1s5(String l1s5) {
		L1s5 = l1s5;
	}
	public String getL1s6() {
		return L1s6;
	}
	public void setL1s6(String l1s6) {
		L1s6 = l1s6;
	}
	public String getL1s7() {
		return L1s7;
	}
	public void setL1s7(String l1s7) {
		L1s7 = l1s7;
	}
	public String getL1s8() {
		return L1s8;
	}
	public void setL1s8(String l1s8) {
		L1s8 = l1s8;
	}
	public String getL1s9() {
		return L1s9;
	}
	public void setL1s9(String l1s9) {
		L1s9 = l1s9;
	}
	public String getL1s10() {
		return L1s10;
	}
	public void setL1s10(String l1s10) {
		L1s10 = l1s10;
	}
	public String getL1s11() {
		return L1s11;
	}
	public void setL1s11(String l1s11) {
		L1s11 = l1s11;
	}
	public String getL1s12() {
		return L1s12;
	}
	public void setL1s12(String l1s12) {
		L1s12 = l1s12;
	}
	public String getL1s13() {
		return L1s13;
	}
	public void setL1s13(String l1s13) {
		L1s13 = l1s13;
	}
	public String getL1s14() {
		return L1s14;
	}
	public void setL1s14(String l1s14) {
		L1s14 = l1s14;
	}
	public String getL1s15() {
		return L1s15;
	}
	public void setL1s15(String l1s15) {
		L1s15 = l1s15;
	}
	public String getL1s16() {
		return L1s16;
	}
	public void setL1s16(String l1s16) {
		L1s16 = l1s16;
	}
	public String getL1s17() {
		return L1s17;
	}
	public void setL1s17(String l1s17) {
		L1s17 = l1s17;
	}
	public String getL1s18() {
		return L1s18;
	}
	public void setL1s18(String l1s18) {
		L1s18 = l1s18;
	}
	public String getL1s19() {
		return L1s19;
	}
	public void setL1s19(String l1s19) {
		L1s19 = l1s19;
	}
	public String getL1s20() {
		return L1s20;
	}
	public void setL1s20(String l1s20) {
		L1s20 = l1s20;
	}
	public String getL2s1() {
		return L2s1;
	}
	public void setL2s1(String l2s1) {
		L2s1 = l2s1;
	}
	public String getL2s2() {
		return L2s2;
	}
	public void setL2s2(String l2s2) {
		L2s2 = l2s2;
	}
	public String getL2s3() {
		return L2s3;
	}
	public void setL2s3(String l2s3) {
		L2s3 = l2s3;
	}
	public String getL2s4() {
		return L2s4;
	}
	public void setL2s4(String l2s4) {
		L2s4 = l2s4;
	}
	public String getL2s5() {
		return L2s5;
	}
	public void setL2s5(String l2s5) {
		L2s5 = l2s5;
	}
	public String getL2s6() {
		return L2s6;
	}
	public void setL2s6(String l2s6) {
		L2s6 = l2s6;
	}
	public String getL2s7() {
		return L2s7;
	}
	public void setL2s7(String l2s7) {
		L2s7 = l2s7;
	}
	public String getL2s8() {
		return L2s8;
	}
	public void setL2s8(String l2s8) {
		L2s8 = l2s8;
	}
	public String getL2s9() {
		return L2s9;
	}
	public void setL2s9(String l2s9) {
		L2s9 = l2s9;
	}
	public String getL2s10() {
		return L2s10;
	}
	public void setL2s10(String l2s10) {
		L2s10 = l2s10;
	}
	public String getNoOfDaysBooked() {
		return noOfDaysBooked;
	}
	public void setNoOfDaysBooked(String noOfDaysBooked) {
		this.noOfDaysBooked = noOfDaysBooked;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getOicComment() {
		return oicComment;
	}
	public void setOicComment(String oicComment) {
		this.oicComment = oicComment;
	}
	public String getOicFollowUpdateTime() {
		return oicFollowUpdateTime;
	}
	public void setOicFollowUpdateTime(String oicFollowUpdateTime) {
		this.oicFollowUpdateTime = oicFollowUpdateTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
} 
