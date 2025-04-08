package com.xworkz.shirtapp.shirt;

    public class Shirt {
        private int shirtCode;
        private String brand;
        private String price;
        private String type;
        private String material; // Cotton, Woolen, etc.
        private char size;
        private String color;

        public void setShirtCode(int shirtCode){
            this.shirtCode = shirtCode;
        }
        public int getShirtCode(){
            return shirtCode;
        }

        public void setBrand(String brand){
            this.brand = brand;
        }
        public String getBrand(){
            return brand;
        }

        public void setPrice(String price){
            this.price = price;
        }
        public String getPrice(){
            return price;
        }

        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return type;
        }

        public void setMaterial(String material){
            this.material = material;
        }
        public String getMaterial(){
            return material;
        }

        public void setSize(char size){
            this.size = size;
        }
        public char getSize(){
            return size;
        }

        public void setColor(String color){
            this.color = color;
        }
        public String getColor(){
            return color;
        }
    }


