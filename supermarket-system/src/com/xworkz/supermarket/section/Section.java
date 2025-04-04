package com.xworkz.supermarket.section;

import com.xworkz.supermarket.product.Product;

public class Section {
    public int sectionId;
    public String sectionName;
    public Product[] product;

    public void getInfo(){
        System.out.println("SectionId :" +sectionId);
        System.out.println("sectionName : " + sectionName);
        for(Product prod : product)
            prod.productInfo();

    }
}
