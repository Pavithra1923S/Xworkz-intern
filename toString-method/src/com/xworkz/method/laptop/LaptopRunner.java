package com.xworkz.method.laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        LaptopDto laptopDto = new LaptopDto();
        laptopDto.setSerialNo(1);
        laptopDto.setModelName("Lenovo ");
        laptopDto.setProcessor("Intel i5");
        laptopDto.setRamSize(16);
        laptopDto.setPrice(104999.00);

        System.out.println(laptopDto.toString());
    }
}
