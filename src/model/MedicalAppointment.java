package model;

import java.time.LocalDateTime;

public class MedicalAppointment {
	private long aID;
	private Patient patient;
	private Doctor doctor;
	private LocalDateTime dateTime;
	private String cabinet;
	
	private static long counter = 0;

	
	
	//getters
	
	public long getaID() {
		return aID;
	}

	public Patient getPatient() {
		return patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public LocalDateTime getDatetime() {
		return dateTime;
	}

	public String getCabinet() {
		return cabinet;
	}
	
	
	//setters
	
	 public void setaID() {
	        aID = counter++;
	    }
	 
	 public void setPatient(Patient inputPatient) {
	        if (inputPatient != null) {
	            patient = inputPatient;
	        } else {
	            patient = null;  
	        }
	    }
	
	  public void setDoctor(Doctor inputDoctor) {
	        if (inputDoctor != null) {
	            doctor = inputDoctor;
	        } else {
	            doctor = null;  
	        }
	    }
	  
	  public void setDateTime(LocalDateTime inputDateTime) {
	        if (inputDateTime != null && !inputDateTime.isBefore(LocalDateTime.now())) {
	            dateTime = inputDateTime;
	        } else {
	            dateTime = LocalDateTime.now();
	        }
	    }
	  
	    public void setCabinet(String inputCabinet) {
	        if (inputCabinet != null && !inputCabinet.isEmpty()) {
	            cabinet = inputCabinet;
	        } else {
	            cabinet = "No cabinet";
	        }
	    }
	    
	    //no arg const
	    
	    public MedicalAppointment() {
	        setaID();
	        setPatient(null);
	        setDoctor(null);
	        setDateTime(LocalDateTime.now());
	        setCabinet("Test Cabinet");
	    }
	    
	    //arg constr
	    
	    public MedicalAppointment(Patient inputPatient, Doctor inputDoctor, LocalDateTime inputDateTime, String inputCabinet) {
	        setaID();
	        setPatient(inputPatient);
	        setDoctor(inputDoctor);
	        setDateTime(inputDateTime);
	        setCabinet(inputCabinet);
	    }

	    
	    //toString
	    public String toString() {
	        return "ID : " + aID + " Patient : " + patient + " Doctor : " + doctor + " Date time " + dateTime + " Cabinet " +
	        cabinet;
	    }
	}


	
	
	
	
	
	
	


