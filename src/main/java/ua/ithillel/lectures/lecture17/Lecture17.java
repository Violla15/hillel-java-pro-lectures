package ua.ithillel.lectures.lecture17;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ua.ithillel.lectures.lecture17.entity.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Lecture17 {

    public static void main(String[] args) throws IOException {
        Product product = new Product("product", 10);
        Product product1 = new Product("product_1", 100);

        List<Product> products = List.of(product, product1);

        try (Writer writer = new FileWriter("products.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(products, writer);
        }
    }
}
