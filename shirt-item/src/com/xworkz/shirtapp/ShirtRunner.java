package com.xworkz.shirtapp;

import com.xworkz.shirtapp.shirt.Shirt;

    public class ShirtRunner {
        public static void main(String args[]) {
            System.out.println("main started");

            Shirt ref1 = new Shirt();
            ref1.setShirtCode(101);
            ref1.setBrand("Raymond");
            ref1.setPrice("1500");
            ref1.setType("Casual");
            ref1.setMaterial("Cotton");
            ref1.setSize('M');
            ref1.setColor("Blue");

            int shirtCode1 = ref1.getShirtCode();
            String brand1 = ref1.getBrand();
            String price1 = ref1.getPrice();
            String type1 = ref1.getType();
            String material1 = ref1.getMaterial();
            char size1 = ref1.getSize();
            String color1 = ref1.getColor();

            System.out.println("Shirt Code: " + shirtCode1);
            System.out.println("Brand: " + brand1);
            System.out.println("Price: Rs." + price1);
            System.out.println("Type: " + type1);
            System.out.println("Material: " + material1);
            System.out.println("Size: " + size1);
            System.out.println("Color: " + color1);
            System.out.println(" ");

            Shirt ref2 = new Shirt();
            ref2.setShirtCode(102);
            ref2.setBrand("Peter England");
            ref2.setPrice("2000");
            ref2.setType("Ethnic");
            ref2.setMaterial("Silk");
            ref2.setSize('L');
            ref2.setColor("Red");

            int shirtCode2 = ref2.getShirtCode();
            String brand2 = ref2.getBrand();
            String price2 = ref2.getPrice();
            String type2 = ref2.getType();
            String material2 = ref2.getMaterial();
            char size2 = ref2.getSize();
            String color2 = ref2.getColor();

            System.out.println("Shirt Code: " + shirtCode2);
            System.out.println("Brand: " + brand2);
            System.out.println("Price: Rs." + price2);
            System.out.println("Type: " + type2);
            System.out.println("Material: " + material2);
            System.out.println("Size: " + size2);
            System.out.println("Color: " + color2);
            System.out.println(" ");



            Shirt ref3 = new Shirt();
            ref3.setShirtCode(103);
            ref3.setBrand("Zara");
            ref3.setPrice("1800");
            ref3.setType("Casual");
            ref3.setMaterial("Denim");
            ref3.setSize('S');
            ref3.setColor("Black");

            int shirtCode3 = ref3.getShirtCode();
            String brand3 = ref3.getBrand();
            String price3 = ref3.getPrice();
            String type3 = ref3.getType();
            String material3 = ref3.getMaterial();
            char size3 = ref3.getSize();
            String color3 = ref3.getColor();

            System.out.println("Shirt Code: " + shirtCode3);
            System.out.println("Brand: " + brand3);
            System.out.println("Price: Rs." + price3);
            System.out.println("Type: " + type3);
            System.out.println("Material: " + material3);
            System.out.println("Size: " + size3);
            System.out.println("Color: " + color3);
            System.out.println(" ");



            Shirt ref4 = new Shirt();
            ref4.setShirtCode(104);
            ref4.setBrand("Allen Solly");
            ref4.setPrice("2500");
            ref4.setType("Ethnic");
            ref4.setMaterial("Linen");
            ref4.setSize('L');
            ref4.setColor("Green");

            int shirtCode4 = ref4.getShirtCode();
            String brand4 = ref4.getBrand();
            String price4 = ref4.getPrice();
            String type4 = ref4.getType();
            String material4 = ref4.getMaterial();
            char size4 = ref4.getSize();
            String color4 = ref4.getColor();

            System.out.println("Shirt Code: " + shirtCode4);
            System.out.println("Brand: " + brand4);
            System.out.println("Price: Rs." + price4);
            System.out.println("Type: " + type4);
            System.out.println("Material: " + material4);
            System.out.println("Size: " + size4);
            System.out.println("Color: " + color4);
            System.out.println(" ");



            Shirt ref5 = new Shirt();
            ref5.setShirtCode(105);
            ref5.setBrand("Van Heusen");
            ref5.setPrice("3000");
            ref5.setType("Casual");
            ref5.setMaterial("Wool");
            ref5.setSize('M');
            ref5.setColor("Grey");

            int shirtCode5 = ref5.getShirtCode();
            String brand5 = ref5.getBrand();
            String price5 = ref5.getPrice();
            String type5 = ref5.getType();
            String material5 = ref5.getMaterial();
            char size5 = ref5.getSize();
            String color5 = ref5.getColor();

            System.out.println("Shirt Code: " + shirtCode5);
            System.out.println("Brand: " + brand5);
            System.out.println("Price: Rs." + price5);
            System.out.println("Type: " + type5);
            System.out.println("Material: " + material5);
            System.out.println("Size: " + size5);
            System.out.println("Color: " + color5);
            System.out.println(" ");

        }
    }
