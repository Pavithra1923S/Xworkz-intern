package com.xworkz.method.hospital;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HospitalDto {

    private int hospitalId;
    private String hospitalName;
    private String location;
    private int totalBeds;
    private String specialization;

    @Override
    public String toString() {
        return "HospitalDto: \nhospitalId = " + this.hospitalId +
                " ," + "\nhospitalName = " + this.hospitalName +
                " ," + "\nlocation = " + this.location +
                " ," + "\ntotalBeds = " + this.totalBeds +
                " ," + "\nspecialization = " + this.specialization;
    }
}
