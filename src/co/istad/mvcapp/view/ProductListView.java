package co.istad.mvcapp.view;


import co.istad.mvcapp.dto.ProductDto;

import java.util.List;

public class ProductListView {
    public static void productListView(List<ProductDto> productDtoList) {
        System.out.println("My Product List");
        System.out.println("___________________");
        productDtoList.forEach(productDto -> {
            System.out.println("UUID= "+productDto.uuid());
            System.out.println("Code= "+productDto.code());
            System.out.println("Name= "+productDto.name());
            System.out.println("Price= "+productDto.priceIn());
            System.out.println("----------------");
        });
    }
}
