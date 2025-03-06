package model;

public class Person {
	//variables
	private String name;
	private String surname;
	private String personCode;
	
	//getters
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}
	
	//setters
	
	public void setName(String inputName) {
		if(inputName != null && inputName.matches("^[A-Za-z]+$")) {
			name = inputName;
		}else 
			name = "No name";	
		}
	
	public void setSurname(String inputSurname) {
		if(inputSurname != null && inputSurname.matches("^[A-Za-z]+$")) {
			surname = inputSurname;
		}else 
		{
			surname = "No surname";
		}
	}
	
	public void setPersonCode(String inputPersonCode) {
		if(inputPersonCode != null) { // i'll try to find regex for this later 
			personCode = inputPersonCode;
		}else 
		{
			personCode = "No person code";
		}
	}
	
	//no arg const
	public Person() {
	    setName("Test name");
	    setSurname("Test surname");
	    setPersonCode("Test code");
	    }
	
	//arg const
	public Person(String inputName, String inputSurname, String inputPersonCode) {
		setName(inputName);
		setSurname(inputSurname);
		setPersonCode(inputPersonCode);
	}
	
	//toString
	
	public String toString() {
		return "Name : " + name + " Surname : " + surname + " Person Code : " + personCode;
	}
	 
	
	}
	
	
	


