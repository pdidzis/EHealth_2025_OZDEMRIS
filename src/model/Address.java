package model;

public class Address {
	//variables
	private City city;
	private String streetOrHouseTitle;
	private int houseNo;

	//getters
	
	public City getCity() {
		return city;
	}
	public String getStreetOrHouseTitle() {
		return streetOrHouseTitle;
	}
	public int getHouseNo() {
		return houseNo;
	}
	
	//setters
	
	public void setCity(City inputCity) {
		if(inputCity != null) {
			city = inputCity;
		}else 
		{
			city = City.not_specified;
		}	
	}
	public void setStreetOrHouseTitle(String inputStreetOrHouseTitle) {
		if (inputStreetOrHouseTitle != null && !inputStreetOrHouseTitle.isEmpty()) {
			streetOrHouseTitle = inputStreetOrHouseTitle;
		}else 
		{
			streetOrHouseTitle = "No House Street/Title";
		}
	}
	public void setHouseNo(int inputHouseNo) {
		if(inputHouseNo > 0) {
			houseNo = inputHouseNo;
		}else 
		{
			houseNo = 0;
		}
	}	
	//no arg	
	public Address() {
		setCity(City.not_specified); // i could also use null
		setStreetOrHouseTitle("Test Street/title");
		setHouseNo(-1);
	}
	//argument const
	public Address(City inputCity, String inputStreetOrHouseTitle, int inputHouseNo) {
		setCity(inputCity);
		setStreetOrHouseTitle(inputStreetOrHouseTitle);
		setHouseNo(inputHouseNo);
	}
	
	//toString
	public String toString() {
		return "City : " + city + " Street/House Title : " + streetOrHouseTitle + " House No : " + houseNo;
	}
	
	
	

}
