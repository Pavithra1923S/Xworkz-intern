package com.xworkz.method.laptop;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LaptopDto {

    private int serialNo;
    private String modelName;
    private String processor;
    private int ramSize;
    private double price;

    @Override
    public String toString() {
        return "LaptopDto: \nserialNo = " + this.serialNo +
                " ," + "\nmodelName = " + this.modelName +
                " ," + "\nprocessor = " + this.processor +
                " ," + "\nramSize = " + this.ramSize +
                " ," + "\nprice = " + this.price;
    }


}
