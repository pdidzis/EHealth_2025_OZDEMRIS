package model;

import java.util.ArrayList;

public class Patient {
	private long pID;
	private Address address;
	private ArrayList<PatientDiseaseHistory> history = new ArrayList<PatientDiseaseHistory>();
	private String patientCode;
	private static long counter = 0;

}
