package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Doctor;
import model.DoctorType;
import model.MedicalAppointment;
import model.Medicine;
import model.Patient;
import model.PatientDiseaseHistory;

public class MainService {
	
	private static List<Doctor> allDoctors = new ArrayList<Doctor>();

	private static List<Patient> allPatients = new ArrayList<Patient>();
	private static List<MedicalAppointment> allMedicalAppointments = new ArrayList<MedicalAppointment>();
	private static List<Medicine> allMedicines = new ArrayList<Medicine>();
	private static List<PatientDiseaseHistory> allPatientDiseaseHistories = new ArrayList<PatientDiseaseHistory>();
	
	
	
	public static void main(String[] args){
		
		//doctors
		
		Doctor doc1 = new Doctor("Albert Kim", 5.0f, DoctorType.dermatologist);
		Doctor doc2 = new Doctor("Smith John", 6.0f, DoctorType.family_doctor);
		
		allDoctors.addAll(Arrays.asList(doc1, doc2));
		
		System.out.println("--- Doctors ---");
		System.out.println(doc1);
		System.out.println(doc2);
		//System.out.println(allDoctors);  //for making more user friendly to read output , im printing one by one
		
		
	}
	
	

}
