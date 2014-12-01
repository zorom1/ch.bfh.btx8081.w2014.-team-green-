//*create a person
//@author Team Green


package ch.bfh.btx8081.w2014.Green.Modeldata;

public abstract class Person {
  private String FirstName;
  private String LastName;
    private char Gender;
  
  Person(){
	    };
	Person(String aFirstName,String aLastName, char aGender){
		FirstName=aFirstName;
		LastName=aLastName;
		Gender=aGender;
			}
	public String getFirstName(){
		return FirstName;
	}
	public void setFirstName(String FirstName){
		this.FirstName=FirstName;
	
	}
	public String getLastName(){
		return LastName;
	}
	public void setLastName(String LastName){
		this.LastName=LastName;
	}
	
	
	public char getGender(){
		return Gender;
	}
	public void setGender(char Gender){
		this.Gender=Gender;
		
	}
	@Override
	public String toString() {
		return String.format("%s, %s", FirstName, LastName,Gender);
	}	
	}

