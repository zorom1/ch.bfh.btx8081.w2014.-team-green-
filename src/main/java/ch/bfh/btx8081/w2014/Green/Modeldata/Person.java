//*create a person
//@author Team Green


package ch.bfh.btx8081.w2014.Green.Modeldata;

public class Person {
  private String FirstName;
  private String LastName;
  private Address address;
  private char Gender;
  
  Person(){
	    };
	Person(String aFirstName,String aLastName, Address Anaddress, char aGender){
		FirstName=aFirstName;
		LastName=aLastName;
		address=Anaddress;
		Gender=aGender;
			}
	public String getFirstName(){
		return FirstName;
	}
	public void setFirstName(String firstName){
		this.FirstName=FirstName;
	
	}
	public String getLastname(){
		return LastName;
	}
	public void setLastName(String LastName){
		this.LastName=LastName;
	}
	public Address getAddresse(){
		return address;
	}
	public void setAddress(Address address){
		this.address=address;
	}
	public char getGender(){
		return Gender;
	}
	public void setGender(char Gender){
		this.Gender=Gender;
		
	}
		
	}

