package com.xworkz.supermarket.product;

public class Product {
    public int productId;
    public String productName;
    public String ingredients[];

    public void productInfo(){
        System.out.println("product id :" +productId);
        System.out.println("product name :" + productName);
        for(String ingred : ingredients)
            System.out.println("Ingredients :" + ingred);
    }
}
