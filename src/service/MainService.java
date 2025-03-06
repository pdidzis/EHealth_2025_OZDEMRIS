package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Address;
import model.City;
import model.Disease;
import model.Doctor;
import model.DoctorType;
import model.MedicalAppointment;
import model.Medicine;
import model.Patient;
import model.PatientDiseaseHistory;
import model.Person;

public class MainService {
	
	private static List<Doctor> allDoctors = new ArrayList<Doctor>();
	private static List<Person> allPerson = new ArrayList<Person>();
	private static List<Patient> allPatients = new ArrayList<Patient>();
	private static List<MedicalAppointment> allMedicalAppointment = new ArrayList<MedicalAppointment>();
	private static List<Medicine> allMedicines = new ArrayList<Medicine>();
	private static List<PatientDiseaseHistory> allPatientDiseaseHistory = new ArrayList<PatientDiseaseHistory>();
	
	
	
	public static void main(String[] args){
		
		//doctors
		Doctor doc3 = new Doctor();
		Doctor doc1 = new Doctor("Albert", "Kim", "101", "1341234", 5.0f, DoctorType.dermatologist);
		Doctor doc2 = new Doctor("Smith", "John", "104", "3143124321", 6.0f, DoctorType.family_doctor);
		
		allDoctors.addAll(Arrays.asList(doc1, doc2, doc3));
		allPerson.addAll(Arrays.asList(doc1 ,doc2, doc3));
		
		System.out.println("--- Doctors ---");
		//System.out.println(doc3);
		//System.out.println(doc1);
		//System.out.println(doc2);
		System.out.println(allDoctors);  
		
		//patient
		Patient p3 = new Patient();
		Patient p1 = new Patient(); //"PatientCode1", null, "+37112345678"
	    Patient p2 = new Patient("Steve", "Jobs", "3124123", "2" , new Address(City.Riga, "Briviba Street", 15), "+37187654321");
	    
	    allPatients.addAll(Arrays.asList(p1, p2, p3));
	    allPerson.addAll(Arrays.asList(p1, p2, p3));
	    System.out.println("\n--- Patients ---");
	    
	    System.out.println(allPatients); 
	    //System.out.println(p3);
	    //System.out.println(p1);
	    //System.out.println(p2);
	    
	   
	    
	    //Medicines
	    Medicine m3 = new Medicine();
	    Medicine m1 = new Medicine("Aspirin", "500 mg", "Take after meal", "PharmaInc", LocalDate.of(2025, 10, 15));
	    Medicine m2 = new Medicine("AntibioticX", "250 mg", "Take with water", "HealthCo", null);
	    
	    allMedicines.addAll(Arrays.asList(m1, m2, m3));

	    System.out.println("\n--- Medicines ---");
	    
	    System.out.println(allMedicines); 
	    //System.out.println(m3);
	    //System.out.println(m1);
	    //System.out.println(m2);
	    
	 
	    
	    PatientDiseaseHistory h1 = new PatientDiseaseHistory();
	    PatientDiseaseHistory h2 = new PatientDiseaseHistory(LocalDate.now(), true, Disease.cancer, doc1, "No notes", 7, new ArrayList<>(Arrays.asList(m2)));
	    
	    
	    allPatientDiseaseHistory.addAll(Arrays.asList(h1, h2));
	    System.out.println("\n--- PatientDiseaseHistory ---");
	    
	    //System.out.println(h1);
	    //System.out.println(h2);
	    System.out.println(allPatientDiseaseHistory);
	    
	    //Medical Appointment
	    MedicalAppointment app1 = new MedicalAppointment();
	    MedicalAppointment app2 = new MedicalAppointment(p2, doc2, java.time.LocalDateTime.now().plusDays(1), "Cabinet 101");
	    
	    
	    allMedicalAppointment.addAll(Arrays.asList(app1, app2));

	    System.out.println("\n--- Medical Appointments ---");
	    
	    System.out.println(app1);
	    System.out.println(app2);
	    
	    // or i can use System.out.println(allMedicalAppointment);
	    
	    
	    
	  
	    
	}
	   

	    
		
}
	
	


