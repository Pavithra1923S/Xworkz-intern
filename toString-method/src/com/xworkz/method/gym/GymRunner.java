package com.xworkz.method.gym;

public class GymRunner {
    public static void main(String[] args) {
        GymDto gymDto = new GymDto();
        gymDto.setGymId(1);
        gymDto.setGymName("Cult Fit");
        gymDto.setLocation("peenya");
        gymDto.setTrainersAvailable(5);
        gymDto.setMonthlyFee(1500.00);

        System.out.println(gymDto.toString());
    }
}
