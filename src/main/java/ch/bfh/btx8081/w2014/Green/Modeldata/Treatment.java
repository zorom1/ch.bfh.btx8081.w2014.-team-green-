package ch.bfh.btx8081.w2014.Green.Modeldata;

public class Treatment {
private String treatNb;
private String treatName;
Treatment(){
	}
Treatment(String treatNb, String treatName){
	this.treatNb=treatNb;
	this.treatName=treatName;
}
public String getTreatNb(){
	return treatNb;
}
public String getTreatName(){
	return treatName;
}
@Override
public String toString() {
  return getTreatNb()+" "+getTreatName();
}
}