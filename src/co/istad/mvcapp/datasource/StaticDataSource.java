package co.istad.mvcapp.datasource;

import co.istad.mvcapp.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StaticDataSource {
    private List<Product> products;
    public StaticDataSource(){
        products=new ArrayList<>();
        products.add(new Product(UUID.randomUUID(),"Coca",1001,20.0));
        products.add(new Product(UUID.randomUUID(),"Sting",1003,20.0));
        products.add(new Product(UUID.randomUUID(),"Pepsi",1008,20.0));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
