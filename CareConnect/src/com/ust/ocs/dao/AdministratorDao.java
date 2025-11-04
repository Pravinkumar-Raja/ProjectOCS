package com.ust.ocs.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import com.ust.ocs.bean.AppointmentBean;
import com.ust.ocs.bean.DoctorBean;
import com.ust.ocs.bean.PatientBean;
import com.ust.ocs.service.Administrator;

public class AdministratorDao implements Administrator{

	@Override
	public String addDoctor(DoctorBean doctoerBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modifyDoctor(DoctorBean doctorBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DoctorBean> viewAllDoctors() {
		// TODO Auto-generated method stub
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

}
