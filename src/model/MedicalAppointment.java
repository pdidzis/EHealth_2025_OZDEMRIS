package model;

import java.time.LocalDateTime;

public class MedicalAppointment {
	private long aID;
	private Patient patient;
	private Doctor doctor;
	private LocalDateTime datetime;
	private String cabinet;
	
	private static long counter = 0;

}
