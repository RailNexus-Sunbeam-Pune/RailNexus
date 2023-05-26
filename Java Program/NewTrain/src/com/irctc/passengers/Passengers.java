package com.irctc.passengers;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Passengers {
	private String name;
	private String gender;
	private String pnrNo;
	private int custId;
	private int destStnNum;
	private int SourceStnNum;
	private int trnNum;
	private Timestamp bookingDate;
	private int seatNo;
	private int boogieNo;
	private String status;
	public Passengers() {
		
	}
	public Passengers(String name, String gender, String pnrNo, int custId, int destStnNum, int sourceStnNum,
			int trnNum, Timestamp bookingDate, int seatNo, int boogieNo, String status) {
		super();
		this.name = name;
		this.gender = gender;
		this.pnrNo = pnrNo;
		this.custId = custId;
		this.destStnNum = destStnNum;
		SourceStnNum = sourceStnNum;
		this.trnNum = trnNum;
		this.bookingDate = bookingDate;
		this.seatNo = seatNo;
		this.boogieNo = boogieNo;
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getBoogieNo() {
		return boogieNo;
	}
	public void setBoogieNo(int boogieNo) {
		this.boogieNo = boogieNo;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public Passengers(String name, String gender, String pnrNo, int custId, int destStnNum, int sourceStnNum,
			int trnNum, Timestamp bookingDate,String status) {
		super();
		this.name = name;
		this.gender = gender;
		this.pnrNo = pnrNo;
		this.custId = custId;
		this.destStnNum = destStnNum;
		SourceStnNum = sourceStnNum;
		this.trnNum = trnNum;
		this.bookingDate = bookingDate;
		this.status = status;
	}
	public Timestamp getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Timestamp bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getDestStnNum() {
		return destStnNum;
	}
	public void setDestStnNum(int destStnNum) {
		this.destStnNum = destStnNum;
	}
	public int getSourceStnNum() {
		return SourceStnNum;
	}
	public void setSourceStnNum(int sourceStnNum) {
		SourceStnNum = sourceStnNum;
	}
	public int getTrnNum() {
		return trnNum;
	}
	public void setTrnNum(int trnNum) {
		this.trnNum = trnNum;
	}
	
	@Override
	public String toString() {
		return "Passengers [name=" + name + ", gender=" + gender + ", pnrNo=" + pnrNo + ", custId=" + custId
				+ ", destStnNum=" + destStnNum + ", SourceStnNum=" + SourceStnNum + ", trnNum=" + trnNum
				+ ", bookingDate=" + bookingDate + ", seatNo=" + seatNo + ", boogieNo=" + boogieNo + "]";
	}
	

	

}
