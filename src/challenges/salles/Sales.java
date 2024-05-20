package challenges.salles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args){
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

            for(Product product: productList){ // foreach
                System.out.println(product);
            }

            System.out.println("Which product do you wish to buy?");
            String prd = scanner.next();

            System.out.println("How many units do you wish?");
            int qt = scanner.nextInt();

            var product = new Product();
            for(Product p: productList){ // foreach
                if(p.getName().contains(prd)){
                    product = p;
                }
            }


            var salePrice = qt* product.getValue();
            if(money - salePrice < 0){
                System.out.println("You don't have enough money :(");
                System.out.println("Current money: " + money + " Sale price: "+ salePrice);

            }else{
                var sale = new SaleHistory(product,qt);
                saleHistories.add(sale);
                money = money - salePrice;
            }
            System.out.println("""
                1 - Buy product
                2 - Close
                """);
            option = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Total money: " + money);
        for(SaleHistory s: saleHistories){
            System.out.println(s);
        }
    }

}
