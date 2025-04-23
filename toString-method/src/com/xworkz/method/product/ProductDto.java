package com.xworkz.method.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
        private int productId;
        private String productName;
        private String category;
        private double price;
        private int stock;

        @Override
        public String toString() {
            return "ProductDto: \nproductId = " + this.productId +
                    " ," + "\nproductName = " + this.productName +
                    " ," + "\ncategory = " + this.category +
                    " ," + "\nprice = " + this.price +
                    " ," + "\nstock = " + this.stock;
        }
    }


