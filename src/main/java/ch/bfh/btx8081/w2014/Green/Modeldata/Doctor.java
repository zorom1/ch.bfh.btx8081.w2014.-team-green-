//*create a Doctor (User)
//*@Version 1.0
//*@author Team Green

package ch.bfh.bxt8081.w2014.Green.Modeldata;

public class Doctor extends Person {
  private String UID;
  Doctor(){
	    }
  Doctor(String FirstName, String LastName, Address address, char Gender, String UID ){
	  super(FirstName, LastName, address, Gender);
	  this.UID=UID;
  }
  public String getUID(){
	  return UID;
  }
    public void setUID(String UID){
    	this.UID=UID;
    }
}
