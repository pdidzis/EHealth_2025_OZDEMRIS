package model;

public class Doctor extends Person{
	//variables
	private long dID;
	private String certificateNumber;
	private float experienceInYears;
	private DoctorType doctorType;
	private static long counter = 0;

	
	//getters
	
	public long getdID() {
		return dID;
	}
	public String getCertificateNumber() {
		return certificateNumber;
	}
	public float getExperienceInYears() {
		return experienceInYears;
	}
	public DoctorType getDoctorType() {
		return doctorType;
	}
	
	//setters
	
	public void setdID() {
		dID = counter++;
	}
	
	public void setCertificateNumber(String inputCertificateNumber) {
		if(inputCertificateNumber != null && !inputCertificateNumber.isEmpty()) {
			certificateNumber = inputCertificateNumber;
		}else 
		{
			certificateNumber = "No certificate";
		}
	}
	
	public void setExperienceInYears(float inputExperienceInYears) {
		if(inputExperienceInYears >= 0.0f ) {
			experienceInYears = inputExperienceInYears;
		}else 
		{
			experienceInYears = 0.0f;
		}	
	}	
	
	public void setDoctorType(DoctorType inputDoctorType) {
			if(inputDoctorType != null) {
				doctorType = inputDoctorType;
			}else 
			{
				doctorType = DoctorType.not_specified;
			}
		}
	
	
	//no arg
	
	public Doctor() {
		super();
		setdID();
		setCertificateNumber(null);
		setExperienceInYears(0.0f);
		setDoctorType(DoctorType.test);
	}
	
	//arg constr
	public Doctor(String inputName , String inputSurname, String inputPersonCode, String inputCertificateNumber, float inputExperienceInYears, 
			DoctorType inputDoctorType ) {
		super(inputName, inputSurname, inputPersonCode);
		setdID();
		setCertificateNumber(inputCertificateNumber);
		setExperienceInYears(inputExperienceInYears);
		setDoctorType(inputDoctorType);
	}
	
	
	//toString
	
	public String toString() {
		return super.toString() + " dID : " + dID + " Certificate Number : " + certificateNumber + " Total Experience : " + experienceInYears +
				" DoctorType : " + doctorType + " \n";
	}
	
		

	
	
	
	
	
}
