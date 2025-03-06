package model;

import java.time.LocalDate;

public class Medicine {
	
	//1.variables
	private long mID;
	private String name;
	private String dosage;
	private String usageInstructions;
	private String manufacturer;
	private LocalDate expirytime;
	private static long counter = 0;

	
	//2.getters
	public long getmID() {
		return mID;
	}

	public String getName() {
		return name;
	}

	public String getDosage() {
		return dosage;
	}

	public String getUsageInstructions() {
		return usageInstructions;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public LocalDate getExpirytime() {
		return expirytime;
	}
	
	//3.setters
	
	public void setmID() {
		mID = counter++;
	}	
	
	//I got regex from chatgpt , my source is > https://chatgpt.com/share/67c5e79c-3078-8010-b6a5-ac8039d0ce4a
	
	
	public void setName(String inputName) {
		if(inputName != null && inputName.matches("^[A-Za-z0-9\\\\-\\\\s]+$")) {
			
			name = inputName;
		}
		else 
		{
			name = "No name";
		}		
	}
	
	public void setDosage(String inputDosage) {
		if(inputDosage != null && inputDosage.matches("^\\d+(\\.\\d+)?\\s?(mg|g|ml)$")) {  //regex for 500 mg, 0,5g etc.
			dosage = inputDosage;
		}
		else 
		{
			dosage = "No dosage";
		}
	}
	public void setUsageInstructions(String inputUsageInstructions) {
		if(inputUsageInstructions != null && inputUsageInstructions.matches("^\\\\d+(\\\\.\\\\d+)?\\\\s?(mg|g|ml)$")) { //
			usageInstructions = inputUsageInstructions;
		}
		else 
		{
			usageInstructions = "No usage instructions";
		}	
	}
	public void setManufacturer(String inputManufacturer) {
		if(inputManufacturer != null && inputManufacturer.matches("^[A-Za-z0-9\\\\s\\\\-]+$")) {
			manufacturer = inputManufacturer;
		}
		else 
		{
			manufacturer = "No manufacturer";
		}
	}
	public void setExpiryTime(LocalDate inputExpiryTime) { 
			expirytime = inputExpiryTime;		
	}
	
	//So in this case if no date is added we will aceppt as expired,im not sure if there is some medicines which dont have any expire date 
	public Boolean isExpired() {
		if(expirytime == null || expirytime.isBefore(LocalDate.now())) {
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	
	//no arg constr
	
	 public Medicine() {
		 
		 setmID();
		 setName("Test Medicine");
		 setDosage("Test Dosage");
		 setUsageInstructions("Test usage instructio");
		 setManufacturer("Test manufacturer");
		 setExpiryTime(LocalDate.now());
		 isExpired();
		  
	 }
	 
	 //argument constr
	 
	 public Medicine(String inputName, String inputDosage, String inputUsageInstructions, String inputManufacturer, LocalDate inputExpiryTime) {
		 
		 setmID();
		 setName(inputName);
		 setDosage(inputDosage);
		 setUsageInstructions(inputUsageInstructions);
		 setManufacturer(inputManufacturer);
		 setExpiryTime(inputExpiryTime);
		 isExpired();
		  
	 }
	 
	 //toString
	 
	 public String toString() {
		 return "Medicine ID : " + mID + " Medicine Name : " + name + " Dosage : " + dosage + " UsageInstructions : " + usageInstructions + 
				 " Manufacturer : " + manufacturer + " ExpiryTime : " + expirytime + " Medicine is expired : " + isExpired() + " \n";
		 
	 }
}
