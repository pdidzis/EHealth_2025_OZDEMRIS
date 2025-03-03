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

	
	//1.getters
	public long gethID() {
		return hID;
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
	
	//2.setters
	
	public void sethID() {
		hID = counter++;
	}
	
	//shortly if its not empty and if its not in the future , use input otherwise use todays date
	public void setDiseaseStartingDate(LocalDate inputDiseaseStartingDate) {
		if (inputDiseaseStartingDate != null && !inputDiseaseStartingDate.isAfter(LocalDate.now())) {
			diseaseStartingDate = inputDiseaseStartingDate;	
		}
		else 
		{
			diseaseStartingDate = LocalDate.now();
		}
	}
	
	public void setIsPresent(boolean inputIsPresent) {
		isPresent = inputIsPresent;
	}
	
	public void setDisease(Disease inputDisease) {
		disease = inputDisease;	
	}
	
	public void setTreatingDoctor(Doctor inputTreatingDoctor) {
		treatingDoctor = inputTreatingDoctor;
	}
	
	public void setNotes(String inputNotes) {
		if(inputNotes != null) {
			notes = inputNotes;
		}else 
		{
			notes = "No notes";
		}	
	}
	//
	public void setSeverity(int inputSeverity) {
		String severityString = String.valueOf(inputSeverity);
		if(severityString.matches("[1-9]|10")) {
			severity = inputSeverity;
		}
		else 
		{
			severity = 1;
		}
		
			
		
	} 
	
	public void setPrescribedMedicines(ArrayList<Medicine> inputMedicines) {
		if(inputMedicines != null) {
			prescribedMedicines = inputMedicines;
		}else 
		{
			prescribedMedicines = new ArrayList<>();
		}
	}
	
	//no arg const
	
	public PatientDiseaseHistory () {
		sethID();
		setDiseaseStartingDate(LocalDate.now());
		setIsPresent(true);
		setDisease(Disease.test);
		setTreatingDoctor(null);
		setNotes("Test");
		setSeverity(9);
		setPrescribedMedicines(null);
	}
	
	//argument constr
	
	public PatientDiseaseHistory(LocalDate inputDiseaseStartingDate, boolean inputIsPresent, Disease inputDisease, 
			Doctor inputTreatingDoctor, String inputNotes, int inputSeverity, ArrayList<Medicine> inputMedicines) {
		sethID();
		setDiseaseStartingDate(inputDiseaseStartingDate);
		setIsPresent(inputIsPresent);
		setDisease(inputDisease);
		setTreatingDoctor(inputTreatingDoctor);
		setNotes(inputNotes);
		setSeverity(inputSeverity);
		setPrescribedMedicines(inputMedicines);
	}
	
	//toString
    public String toString() {
        return "PatientDiseaseHistory => " + "hID = " + hID + ", diseaseStartingDate = " + diseaseStartingDate + ", isPresent = " + 
               isPresent + ", disease = " + disease + ", treatingDoctor = " + treatingDoctor + ", notes = '" + notes + '\'' +
               ", severity = " + severity + ", prescribedMedicines=" + prescribedMedicines + '}';
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
