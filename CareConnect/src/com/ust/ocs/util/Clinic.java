package com.ust.ocs.util;
import java.util.*;

import javax.swing.JOptionPane;

import com.ust.ocs.bean.*;
import com.ust.ocs.dao.AdministratorDao;
public class Clinic {
	
	public static ArrayList<CredentialBean> arr1=new ArrayList<>();
//	public static ArrayList<DoctorBean> arr2=new ArrayList<>();
	public static ArrayList<AppointmentBean> arr3=new ArrayList<>();
	public static ArrayList<ProfileBean> arr4=new ArrayList<>();
	public static ArrayList<LeaveBean> arr5=new ArrayList<>();
	public static ArrayList<PatientBean> arr6=new ArrayList<>();
	public static ArrayList<ScheduleBean> arr7=new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		AdministratorDao a=new AdministratorDao();
		DoctorBean d=new DoctorBean();
		ArrayList<DoctorBean> arr2=new ArrayList<>();
		ArrayList<DoctorBean> ar=new ArrayList<>();
		int n=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of doctors need to be added"));
		for(int i=0;i<n;i++)
		{
			
			d.setDoctorID(JOptionPane.showInputDialog("Enter the Doctor id"));
			d.setDoctorName(JOptionPane.showInputDialog("Enter the Doctor Name"));
			d.setGender(JOptionPane.showInputDialog("Enter the Gender"));
			d.setDateOfBirth(JOptionPane.showInputDialog("Enter the DOB (DD/MM/YYYY)"));
			d.setQualification(JOptionPane.showInputDialog("Enter the Qualification"));
			d.setSpecialization(JOptionPane.showInputDialog("Enter the Specification"));
			d.setYearsOfExperience(Integer.parseInt(JOptionPane.showInputDialog("Enter the Years of Experience ")));
			d.setDateOfJoining(JOptionPane.showInputDialog("Enter the date of joining "));
			d.setStreet(JOptionPane.showInputDialog("Enter the Street"));
			d.setLocation(JOptionPane.showInputDialog("Enter the Location"));
			d.setState(JOptionPane.showInputDialog("Enter the State"));
			d.setCity(JOptionPane.showInputDialog("Enter the City"));
			d.setPincode(JOptionPane.showInputDialog("Enter the Pin code"));
			d.setContactNumber(JOptionPane.showInputDialog("Enter the Contact Number"));
			d.setEmailID(JOptionPane.showInputDialog("Enter the email id"));
			
			a.addDoctor(d);
			arr2.add(d);
			
		}
		System.out.println("Doctors Added Successfully");
		System.out.println(d);
		System.out.println("Details Modified Successfully");
		for(int i=0;i<arr2.size();i++)
		{
			JOptionPane.showMessageDialog(null, arr2);
		}
		
		System.out.println("Do you want to modify the details");
		String s=JOptionPane.showInputDialog("Enter Yes or No");
		String choice,ch;
		if(s.equals("Yes")||s.equals("yes"))
		{
			
			for(int i=0;i<arr2.size();i++)
			{
				JOptionPane.showMessageDialog(null, arr2);
			}
			ch=JOptionPane.showInputDialog("Enter the id");
			System.out.println(d.getDoctorID());
			for(DoctorBean d1: arr2)
			{
				ar.add(d1);
				
				if(d1.getDoctorID().equals(ch))
				{
					do {
						choice=JOptionPane.showInputDialog("Enter the field (Id,Name,Gender,DOB,Qualification,Specilization,YOE,DOJ,Street,Location,State,City,Pincode,CNo,Email,Done");
						switch(choice)
						{
						case "Id": d1.setDoctorID(JOptionPane.showInputDialog("Enter the new Id"));
						
						break;
						
						case "Name": d1.setDoctorName(JOptionPane.showInputDialog("Enter the new name"));
						break;
							
						case "Gender":
							d1.setGender(JOptionPane.showInputDialog("Enter the new Gender"));
							break;
							
						case "DOB": d1.setDateOfBirth(JOptionPane.showInputDialog("Enter the new DOB"));
						break;
							
						case "Qualification": d1.setQualification(JOptionPane.showInputDialog("Enter the new Qualification"));
						break;
							
						case "Specialization": d1.setSpecialization(JOptionPane.showInputDialog("Enter the new Specialization"));
						break;
							
						case "YOE": d1.setYearsOfExperience(Integer.parseInt(JOptionPane.showInputDialog("Enter the new YOE")));
							break;
							
						case "DOJ":  d1.setDateOfJoining(JOptionPane.showInputDialog("Enter the new DOJ"));
						break;
							
						case "Street":  d1.setStreet(JOptionPane.showInputDialog("Enter the new Street"));
						break;
							
						case "Location":  d1.setLocation(JOptionPane.showInputDialog("Enter the new Location"));
						break;
							
						case "State":  d1.setState(JOptionPane.showInputDialog("Enter the new State"));
						break;
							
						case "City":  d1.setCity(JOptionPane.showInputDialog("Enter the new City"));
						break;
							
						case "Pincode":  d1.setPincode(JOptionPane.showInputDialog("Enter the new Pincode"));
						break;
							
						case "CNo":  d1.setContactNumber(JOptionPane.showInputDialog("Enter the new Contact No"));
						break;
							
						case "Email":  d1.setEmailID(JOptionPane.showInputDialog("Enter the new Email"));
						break;
						
						case "Done": System.exit(0);
						}
					}while(choice!="Done");
					
				}
			
			}
			
		}
		System.out.println("Details Modified Successfully");
		for(int i=0;i<ar.size();i++)
		{
			JOptionPane.showMessageDialog(null, ar);
		}

		
	    

	}

}
