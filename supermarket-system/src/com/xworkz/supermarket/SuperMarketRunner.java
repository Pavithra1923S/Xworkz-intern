package com.xworkz.supermarket;

import com.xworkz.supermarket.product.Product;
import com.xworkz.supermarket.section.Section;
import com.xworkz.supermarket.supermarket.SuperMarket;

public class SuperMarketRunner {
    public static void main(String[] args){
        System.out.println("main started");
        String branches[] = {"rajajinagar " , "Malleshwaram"};
        String ingredients[] ={"milk" , "vinegar"};
        String ingredientsforpanner[] ={"milk" , "vinegar"};
        String ingredientsformajige[] = {"milk" , "maasala"};
        String ingredientsformilkybar[] ={"milk" , " sugat"};
        String ingredientsfordairymilk[] = {"choco" , "sugar"};

    SuperMarket mart = new SuperMarket();
    mart.superMarketId = 101;
    mart.superMarketName = "Dmart";
    mart.branches = branches;

    Section section1 =new Section();
    section1.sectionId =12;
    section1.sectionName = "dairy";

        Product product1 = new Product();
        product1.productId =1;
        product1.productName ="Panner";
        product1.ingredients= ingredientsforpanner;

        Product product2 = new Product();
        product2.productId =2;
        product2.productName ="milk";
        product2.ingredients= ingredientsformajige;

        Product product[] =new Product[2];
        product[0] = product1;
        product[1] = product2;

    Section section2 =new Section();
    section2.sectionId =13;
    section2.sectionName = "chocolates";

    Section section[] = new Section[2];
     section[0] = section1;
     section[1] = section2;



        Product product3 = new Product();
        product3.productId =3;
        product3.productName ="milkybar";
        product3.ingredients= ingredientsformilkybar;

        Product product4 = new Product();
        product4.productId =4;
        product4.productName ="dairymilk";
        product4.ingredients= ingredientsfordairymilk;

        Product anotherproduct[] =new Product[2];
        anotherproduct[0] = product3;
        anotherproduct[1] = product4;



        section1.product = product;

       section2.product = anotherproduct;

        mart.section =section;


  mart.getSuperMarketInfo();

        System.out.println("main ended");
    }

}
