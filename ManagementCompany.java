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

public class ManagementCompany {
	private final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private String companyName;
	private String taxId;
	private double mangementFee;
	
	private Property [] properties;
	private Plot plot;
	private int numberOfProperties;
	
	public ManagementCompany() {
		this.companyName = "";
		this.taxId = "";
		this.mangementFee = 0;
		this.plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property [this.MAX_PROPERTY];
		this.numberOfProperties = 0;
	}
	
	public ManagementCompany(String name, String taxId, double mangementFee) {
		this.companyName = name;
		this.taxId = taxId;
		this.mangementFee = mangementFee;
		this.properties = new Property [this.MAX_PROPERTY];
		this.plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
		this.numberOfProperties = 0;
	}
	
	public ManagementCompany(String name, String taxId, double mangementFee, int x, int y, int width, int depth) {
		this.companyName = name;
		this.taxId = taxId;
		this.mangementFee = mangementFee;
		this.plot = new Plot(x,y,depth,width);
		this.properties = new Property [this.MAX_PROPERTY];
		this.numberOfProperties = 0;
	}
	public ManagementCompany (ManagementCompany otherCompany) {
		this.companyName = otherCompany.getName();
		this.taxId = otherCompany.getTaxID();
		this.mangementFee = otherCompany.getMgmFeePer();
		this.properties = otherCompany.getProperties();
		this.plot = otherCompany.getPlot();
		this.numberOfProperties = otherCompany.getPropertiesCount();
	}
	
	
	
	
	public int addProperty(String name, String city, double rent, String owner) {
		Property prop = new Property(name, city, rent, owner);
		
		if (this.numberOfProperties == this.MAX_PROPERTY) {
			return -1;
		}
		if (prop.equals(null)) {
			return -2;
		}
		if(this.plot.encompasses(prop.getPlot()) == false){
			return -3;
		}
		for (int i = 0; i < this.properties.length; i++) {
			if (this.properties[i] != null) {
				if (this.properties[i].getPlot().overlaps(prop.getPlot())) {
					return -4;
				}
			}
		}
		this.properties[this.numberOfProperties] = prop;
		this.numberOfProperties ++;
		return this.numberOfProperties-1;
	}
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property prop = new Property(name, city, rent, owner, x, y, width, depth);
		
		if (this.numberOfProperties == this.MAX_PROPERTY) {
			return -1;
		}
		if (prop.equals(null)) {
			return -2;
		}
		if(this.plot.encompasses(prop.getPlot()) == false){
			return -3;
		}
		for (int i = 0; i < this.properties.length; i++) {
			if (this.properties[i] != null) {
				if (this.properties[i].getPlot().overlaps(prop.getPlot())) {
					return -4;
				}
			}
		}
		this.properties[this.numberOfProperties] = prop;
		this.numberOfProperties ++;
		return this.numberOfProperties-1;
	}
	public int addProperty(Property otherProp) {
		Property prop = otherProp;
		
		if (this.numberOfProperties == this.MAX_PROPERTY) {
			return -1;
		}
		if (prop.equals(null)) {
			return -2;
		}
		if(this.plot.encompasses(prop.getPlot()) == false){
			return -3;
		}
		for (int i = 0; i < this.properties.length; i++) {
			if (this.properties[i] != null) {
				if (this.properties[i].getPlot().overlaps(prop.getPlot())) {
					return -4;
				}
			}
		}
		this.properties[this.numberOfProperties] = prop;
		this.numberOfProperties ++;
		return this.numberOfProperties-1;
	}
	
	
	
	public double getMgmFeePer() {
		return this.mangementFee;
	}
	public String getName() {
		return this.companyName;
	}
	public Plot getPlot() {
		return this.plot;
	}
	public Property[] getProperties() {
		return this.properties;
	}
	public int getPropertiesCount() {
		return this.numberOfProperties;
	}
	public String getTaxID() {
		return this.taxId;
	}
	public double getTotalRent() {
		double totalRent = 0.0;
		for(int i = 0; i<this.properties.length; i++) {
			if (properties[i] != null) {
				totalRent += properties[i].getRentAmount();
			}
		}
		return totalRent;
	}
	public boolean isManagementFeeValid() {
		if (this.mangementFee >= 0 && this.mangementFee <= 100) {
			return true;
		}
		return false;
	}
	public boolean isPropertiesFull() {
		if (this.numberOfProperties == this.MAX_PROPERTY) {
			return true;
		}
		return false;
	}
	public void removeLastProperty() {
		this.properties[this.numberOfProperties-1] = null;
		this.numberOfProperties --;
	}
	public String toString() {
		String tempString = "List of the properties for " + this.companyName + ", taxID: " + this.taxId + "\n" + 
				"______________________________________________________\n";
		
		for (int i = 0; i <this.properties.length; i++) {
			if (properties[i] != null) {
				tempString += this.properties[i].toString() + "\n";
			}
		}
		
		tempString += "______________________________________________________\n" + "\n" + " total management Fee: " 
		+ this.getTotalRent() * (this.mangementFee/100.0);
		
		
		return tempString;
	}
	
	
	
	
	public Property getHighestRentPropperty() {
		Property highest = this.properties[0];
		for (int i = 0; i< this.properties.length; i++) {
			if (this.properties[i] != null) {
				if (this.properties[i].getRentAmount() > highest.getRentAmount()) {
					highest = this.properties[i];
				}
			}
			
		}
		return highest;
	}
	
	
}
