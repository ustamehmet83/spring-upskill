package example1;

import example1.config.ProductConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(ProductConfig.class);

        List<Product> productList = new ArrayList<>();

//        Product product = container.getBean(Cheese.class);
//        Product product = container.getBean(Product.class);
//        Product product = container.getBean("milkBean", Product.class);
        Product product = container.getBean("cheese", Product.class);

        productList.add(product);

        ShoppingCart shoppingCart = new ShoppingCart(productList);

        System.out.println(shoppingCart.productList);
    }
}
