package ch.bfh.btx8081.w2014.Green.Modeldata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Case {
	//public Patient patient;
	public String PID;
	private int CaseNb;
	private Date StartDay;
	private String Description;
	public List<Diagnose> diagnoses = null;
	Case(int CaseNb, String PID, Date StartDay, String Description){
		this.CaseNb=CaseNb;
		//this.patient=patient;
		this.PID=PID;
		this.StartDay=StartDay;
		this.Description=Description;
		diagnoses = new ArrayList<Diagnose>();
	}
	}
	
	


