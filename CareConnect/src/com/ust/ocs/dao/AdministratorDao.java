package com.ust.ocs.dao;
import com.ust.ocs.bean.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JOptionPane;

import com.ust.ocs.bean.AppointmentBean;
import com.ust.ocs.bean.CredentialBean;
import com.ust.ocs.bean.DoctorBean;
import com.ust.ocs.bean.PatientBean;
import com.ust.ocs.service.Administrator;

public class AdministratorDao implements Administrator{
	static ArrayList <DoctorBean>al=new ArrayList<>();
	static ArrayList <DoctorBean>ar=new ArrayList<>();
	
	public Boolean login(CredentialBean creadential)
	{
		
		return null;
	}
	
	@Override
	public String addDoctor(DoctorBean doctoerBean) {
		if(al.add(doctoerBean))
		{
			System.out.println(doctoerBean);
			return "Doctor added Successfully";
		}
		
		return "Failed to Add";
		
		
		
		
	}

	@Override
	public Boolean modifyDoctor(DoctorBean doctorBean) {
		ar.add(doctorBean);
		boolean bool=true;
		if(al==ar)
		{
			bool=false;
		}
		return bool;
	}

	@Override
	public ArrayList<DoctorBean> viewAllDoctors() {
		ArrayList<DoctorBean> adl=new ArrayList();
		
		return null;
	}

	@Override
	public int removeDoctor(String doctorID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<DoctorBean> suggestDoctors(String patientId, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<PatientBean, AppointmentBean> viewPatientsByDate(Date appointmentDate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
		DoctorBean d=new DoctorBean();
		AdministratorDao ad=new AdministratorDao();
		String choice,ch;
		boolean b;
		CredentialBean c=new CredentialBean();
		String id;
		
		String password;
		
		
		do {
			id=JOptionPane.showInputDialog("Enter the Id");
			c.setUserID(id);
			password=JOptionPane.showInputDialog("Enter the Password");
			c.setPassword(password);
			switch(id)
			{
			case "AD-001":  int n=Integer.parseInt(JOptionPane.showInputDialog("Enter the no of doctors need to be added"));
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
								System.out.println(ad.addDoctor(d));
							}
							
							
							break;
			
			case "AD-002": 	String s=JOptionPane.showInputDialog("Enter Yes or No");
							if(s.equalsIgnoreCase("Yes"))
							{

								ch=JOptionPane.showInputDialog("Enter Doctor id");
				
								for(DoctorBean arr2:al)
								{
									if(arr2.getDoctorID().equals(ch))
									{
										do {
											choice=JOptionPane.showInputDialog("Enter the field (Id,Name,Gender,DOB,Qualification,Specilization,YOE,DOJ,Street,Location,State,City,Pincode,CNo,Email,Exit");
											switch(choice)
											{
											case "Id": arr2.setDoctorID(JOptionPane.showInputDialog("Enter the new Id"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											
											break;
					
											case "Name": arr2.setDoctorName(JOptionPane.showInputDialog("Enter the new name"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "Gender":  arr2.setGender(JOptionPane.showInputDialog("Enter the new Gender"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "DOB": arr2.setDateOfBirth(JOptionPane.showInputDialog("Enter the new DOB"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "Qualification": arr2.setQualification(JOptionPane.showInputDialog("Enter the new Qualification"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "Specialization": arr2.setSpecialization(JOptionPane.showInputDialog("Enter the new Specialization"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "YOE": arr2.setYearsOfExperience(Integer.parseInt(JOptionPane.showInputDialog("Enter the new YOE")));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");;
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "DOJ":  arr2.setDateOfJoining(JOptionPane.showInputDialog("Enter the new DOJ"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "Street":  arr2.setStreet(JOptionPane.showInputDialog("Enter the new Street"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "Location":  arr2.setLocation(JOptionPane.showInputDialog("Enter the new Location"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "State":  arr2.setState(JOptionPane.showInputDialog("Enter the new State"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "City":  arr2.setCity(JOptionPane.showInputDialog("Enter the new City"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "Pincode":  arr2.setPincode(JOptionPane.showInputDialog("Enter the new Pincode"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "CNo":  arr2.setContactNumber(JOptionPane.showInputDialog("Enter the new Contact No"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;
						
											case "Email":  arr2.setEmailID(JOptionPane.showInputDialog("Enter the new Email"));
											b=ad.modifyDoctor(arr2);
											if(b)
											{
												JOptionPane.showMessageDialog(null, "Modified the details Successfully");
												System.out.println("Modified the details Successfully");
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Failed to Modify");
											}
											break;	
											case "EXIT": System.exit(0);
											}
										}while(!choice.equalsIgnoreCase("Exit"));
				
									}
									
				
								}
			
							}
							break;
			
			
			case "Exit": System.exit(0);
			}
			
		}while(!id.equalsIgnoreCase("Exit"));
	}
}
