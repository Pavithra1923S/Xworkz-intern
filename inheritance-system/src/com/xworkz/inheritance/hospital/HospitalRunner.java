package com.xworkz.inheritance.hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.admitPatient();
        hospital.dischargePatient();

        CityHospital city = new CityHospital();
        city.admitPatient();
        city.dischargePatient();
    }
}
