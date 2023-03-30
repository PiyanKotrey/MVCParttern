package co.istad.mvcapp.view;

import co.istad.mvcapp.controller.ProductController;
import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;
import co.istad.mvcapp.model.Product;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class WelcomView {
    public static void Welcome() {
        ProductController controller = new ProductController();
        while (true){
            System.out.println("======================");
            System.out.println("Welcome to application");
            System.out.println("======================");
            System.out.println("1. Create New Product");
            System.out.println("2. List All Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Edit Product ");
            System.out.println("Choose option->>>>>");
            int option = InputView.getInputNumbers(new Scanner(System.in));

            switch (option){
                case 0->System.exit(0);
                case 1 ->{
                    CreateProductDto createProductDto = new CreateProductDto(1002,"SevenUp",10.0);
                    ProductDto productDto = controller.handleCreateNewProduct(createProductDto);
                    System.out.println("Product is Create successfully");
                    System.out.println(productDto);
                    ProductListView.productListView(controller.handleProductList());
                }
                case 2 -> {
                    ProductListView.productListView(controller.handleProductList());
                }
                case 3 -> {
                    UUID uuid=UUID.fromString(InputView.getInputData(new Scanner(System.in)));
                    controller.handleRemoveProductByUUID(uuid);
                }
                default -> System.out.println("Invalid option...!");
            }
        }
    }
}
