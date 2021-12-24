import java.util.List;

/**
 * OcpApplication
 */
public class OcpApplication {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        

        List<Product> products = List.of(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();

        productFilter.filter(products, new ColorSpecification(Color.GREEN))
            .forEach(p -> System.out.println(p.getName()));
        
    
    }
}

