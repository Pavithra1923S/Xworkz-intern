package com.xworkz.method.hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        HospitalDto hospitalDto = new HospitalDto();
        hospitalDto.setHospitalId(555);
        hospitalDto.setHospitalName("Apollo Hospital");
        hospitalDto.setLocation("Bangalore");
        hospitalDto.setTotalBeds(300);
        hospitalDto.setSpecialization("Cardiology");

        System.out.println(hospitalDto.toString());
    }
}
