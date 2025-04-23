package com.xworkz.method.product;

public class ProductRunner {
   public static void main(String[] args) {
            ProductDto productDto = new ProductDto();
            productDto.setProductId(1001);
            productDto.setProductName("Laptop");
            productDto.setCategory("Electronics");
            productDto.setPrice(1200.50);
            productDto.setStock(50);

            System.out.println(productDto.toString());
        }
    }


