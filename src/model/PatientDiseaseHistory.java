package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class PatientDiseaseHistory {

	private long hID;
	private LocalDate diseaseStartingDate;
	private boolean	isPresent;
	private Disease disease;
	private Doctor treatingDoctor;
	private String notes;
	private int severity;
	private ArrayList<Medicine> prescribedMedicines = new ArrayList<Medicine>();
	private static long counter = 0;
	public long gethID() {
		return hID;
		
	//1.setters	
	}
	public LocalDate getDiseaseStartingDate() {
		return diseaseStartingDate;
	}
	public boolean isPresent() {
		return isPresent;
	}
	public Disease getDisease() {
		return disease;
	}
	public Doctor getTreatingDoctor() {
		return treatingDoctor;
	}
	public String getNotes() {
		return notes;
	}
	public int getSeverity() {
		return severity;
	}
	public ArrayList<Medicine> getPrescribedMedicines() {
		return prescribedMedicines;
	}
	
	//2.getters
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
