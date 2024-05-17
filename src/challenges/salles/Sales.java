package challenges.salles;

import examples.classes.inheritance.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args){
        Sales sales = new Sales();
        var pencil = new Product("Pencil", 10.0F);
        var phone = new Product("Phone", 300.0F);
        var mouse = new Product("Mouse", 50.0F);
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(pencil);
        productList.add(phone);
        productList.add(mouse);

        List<SaleHistory> saleHistories = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much $$ do you have?");
        float money = scanner.nextFloat();

        System.out.println("""
                1 - Buy product
                2 - Close
                """);
        int option = scanner.nextInt();
        while(option != 2){
            sales.printProducts(productList);
            System.out.println("Which product do you wish to buy?");

        }
        scanner.close();

    }

    public static void printProducts(ArrayList<Product> products){
        for(Product product: products){ // foreach
            System.out.println(product);
        }
    }
}
