package com.xworkz.method.railway;

public class TrainRunner {
    public static void main(String[] args) {
        TrainDto trainDto = new TrainDto();
        trainDto.setTrainNo(1);
        trainDto.setTrainName("Tirupati expree");
        trainDto.setOrigin("Bangalore");
        trainDto.setDestination("Tirupati");
        trainDto.setTotalCoaches(22);

        System.out.println(trainDto.toString());
    }

}
