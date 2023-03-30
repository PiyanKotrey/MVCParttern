package co.istad.mvcapp.controller;

import co.istad.mvcapp.dao.ProductDaoImp;
import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;

import java.util.List;
import java.util.UUID;

public class ProductController {
    private final ProductDaoImp productDao;
    public ProductController(){
        productDao = new ProductDaoImp();
    }
    public List<ProductDto> handleProductList(){
        return productDao.select();
    }
    public ProductDto handleCreateNewProduct(CreateProductDto createProductDto){
        return productDao.insert(createProductDto);
    }
    public void handleRemoveProductByUUID(UUID uuid){
         productDao.removeByUUID(uuid);
    }
}
