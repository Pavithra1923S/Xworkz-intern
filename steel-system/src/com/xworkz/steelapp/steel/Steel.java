package com.xworkz.steelapp.steel;

public class Steel {
        private int steelId;
        private String brand;
        private String price;
        private String type;
        private boolean isCorrosive;
        private String application;
        private String strength;

        public void setSteelId(int steelId) {
            this.steelId = steelId;
        }
        public int getSteelId() {
            return steelId;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }
        public String getBrand() {
            return brand;
        }

        public void setPrice(String price) {
            this.price = price;
        }
        public String getPrice() {
            return price;
        }

        public void setType(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }

        public void setIsCorrosive(boolean isCorrosive) {
            this.isCorrosive = isCorrosive;
        }
        public boolean getIsCorrosive() {
            return isCorrosive;
        }

        public void setApplication(String application) {
            this.application = application;
        }
        public String getApplication() {
            return application;
        }

        public void setStrength(String strength) {
            this.strength = strength;
        }
        public String getStrength() {
            return strength;
        }
    }


