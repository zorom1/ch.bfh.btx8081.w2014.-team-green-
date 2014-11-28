//*create a Patient
//*@version 1.0
//* @author team Green

package Modeldata;

import java.util.Date;

public class Patient extends Person {

	private String PID;
	private Date Birthday;
	private String Insurance; 
 Patient(){
	  }
 Patient(String FirstName, String LastName, Address address, char Gender, String PID,
		 Date Birthday, String Insurance){
	 super(FirstName, LastName,address, Gender);
	 this.PID=PID;
	 this.Birthday=Birthday;
	 this.Insurance=Insurance;
 }
 public String getPID(){
	 return PID;
 }
 public void setPID(String PID){
	 this.PID=PID;
 }
 public Date getBirthday(){
	 return Birthday;
 }
 public void setBirthday(Date Birthday){
	 this.Birthday=Birthday;
 }
 public String getInsurance(){
	 return Insurance;
 }
 public void setInsurance(String Insurance){
	 this.Insurance=Insurance;
 }
}
