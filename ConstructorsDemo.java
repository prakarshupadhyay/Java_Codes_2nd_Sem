class Product {
    int id;
    String name;
    float price;

    Product() {
        System.out.println("====Default Constructor====");
    }
    Product(int id, String name, float price) {
        System.out.println("====Parameterized Constructor====");
        this.id = id;
        this.name = name;
        this.price = price;
    }
    Product(int id, String name) {
        System.out.println("====Parameterized Constructor with 2 parameters====");
        this.id = id;
        this.name = name;
    }

    Product(Product p) {
        System.out.println("====Copy Constructor====");
        this.id = p.id;
        this.name = p.name;
        this.price = p.price;
    }

    void getDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.getDetails();

        Product product2 = new Product(101, "Laptop", 75000.0f);
        product2.getDetails();

        Product product3 = new Product(102, "Smartphone");
        product3.getDetails();

        Product product4 = new Product(product2);
        product4.getDetails();
    }
}
