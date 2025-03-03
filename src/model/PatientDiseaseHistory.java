package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class PatientDiseaseHistory {

	private long hID;
	private LocalDate diseaseStartingDate;
	private boolean	isPresent;
	private Disease disease;
	private DoctorType Doctor;
	private String notes;
	private int severity;
	private ArrayList<Medicine> prescribedMedicines = new ArrayList<Medicine>();
	private static long counter = 0;
	
	
	
	
	
	
	
	
	
}
