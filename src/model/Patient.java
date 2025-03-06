package model;

import java.util.ArrayList;

public class Patient {
	//variables
	private long pID;
	private Address address;
	private String phoneNo;
	private ArrayList<PatientDiseaseHistory> history = new ArrayList<PatientDiseaseHistory>();
	private String patientCode;
	private static long counter = 0;
	
	
	//geters
	
	public long getpID() {
		return pID;
	}
	public Address getAddress() {
		return address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getPatientCode() {
		return patientCode;
	}
	
	//setters
	
	 public void setpID() {
	        pID = counter++;
	}
	 
	 public void setAddress(Address inputAddress) {
		 if(inputAddress != null) {
			 address = inputAddress;
		 }else 
		 {
			 address = null;
		 }
	 }
	 
	 public void setPhoneNo(String inputPhoneNo) {
		 if(inputPhoneNo != null && inputPhoneNo.matches("^\\+?[1-9][0-9]{7,14}$")) { //regex from > https://uibakery.io/regex-library/phone-number-java
			phoneNo = inputPhoneNo; 
		 }
		 else 
		 {
			 phoneNo = "Empty";
		 }
	 }
	 
	 public void setPatientCode(String inputPatientCode) {
		 if(inputPatientCode != null && !inputPatientCode.isEmpty()) {
			 patientCode = inputPatientCode;
		 }else 
		 {
			 patientCode = "No patient code";
		 }
	 }
	 
	 ///
	 ///
	 public void addNewHistoryRecord(PatientDiseaseHistory newHistory) {
	        if (newHistory != null) {
	            history.add(newHistory);
	        }
	    }

	 //no arg const
	 
	  public Patient() {
	        setpID();
	        setAddress(null);
	        setPhoneNo("22222222");
	        setPatientCode("Test patientcode");
	    }
	  
	  public Patient(String inputPatientCode, Address inputAddress, String inputPhoneNo) {
	        setpID();
	        setPatientCode(inputPatientCode);
	        setAddress(inputAddress);
	        setPhoneNo(inputPhoneNo);
	    }
	  
	  //toString 
	  
	  public String toString() {
	        return " pID : " + pID + "Patient Code : " + patientCode + "Address : " + address + " Phone No : " + phoneNo; 
	  }
}
