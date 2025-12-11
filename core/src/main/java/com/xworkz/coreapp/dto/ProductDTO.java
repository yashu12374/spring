package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
    public class ProductDTO {
        private int productId;
        private String productName;
        private String category;
        private double price;
        private int quantity;
        private String brand;
        private String description;
    }

