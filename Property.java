/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: (Give a brief description for each Class)
 * Due: 11/13/2024
 * Platform/compiler:
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Luke Adjei
*/

public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;



	public Property() {
		this.propertyName = "";
		this.city = "";
		this.owner = "";
		this.rentAmount = 0.0;
		this.plot = new Plot();
	}
	public Property(String name, String city, double rentalAmount, String owner) {
		this.propertyName = name;
		this.city = city;
		this.rentAmount = rentalAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	public Property (String name, String city, double rentalAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = name;
		this.city = city;
		this.rentAmount = rentalAmount;
		this.owner = owner;
		this.plot = new Plot(x,y,depth,width);
	}
	Property(Property otherProperty){
		this.propertyName = otherProperty.getPropertyName();
		this.city = otherProperty.getCity();
		this.rentAmount = otherProperty.getRentAmount();
		this.owner = otherProperty.getOwner();
		this.plot = otherProperty.getPlot();
	}
	
	public String getCity() {
		return this.city;
	}
	public String getOwner() {
		return this.owner;
	}
	public Plot getPlot() {
		return this.plot;
	}
	public String getPropertyName() {
		return this.propertyName;
	}
	public double getRentAmount() {
		return this.rentAmount;
	}
	
	
	
	public void setPropertyName(String name) {
		this.propertyName = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setRentalAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public String toString() {
		return this.propertyName + "," + this.city + "," + this.owner + "," + this.rentAmount;
	}
	
	
	
	

}
