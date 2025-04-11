import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
Products.setStoreName("Kho tổng ABC");
Products[] products = new Products[5];
products[0]=new Products(1,"Shoes",200000, 3);
products[1]=new Products(2,"Sandals", 100000, 2);
products[2]=new Products(3,"Helmets", 200000, 1);
products[3]=new Products(4,"Hats", 150000, 3);
products[4]=new Products(5,"Jackets", 250000, 1);
        System.out.println("All products:");
        for(Products p : products){
            p.display();
        }

        System.out.println("Enter Product's name:");
String name = new Scanner(System.in).nextLine();
boolean found = false;
for(Products p : products){
    if(p.getName().equals(name)){
        found = true;
        p.display();
        break;

    }
    if(!found){
        System.out.println("Product does not exist");
    }
    Products maxproducts = products[0];
    for(int i = 1; i < products.length; i++){
        if(products[i].getquantity() > maxproducts.getquantity()){
            maxproducts = products[i];

        }
        System.out.println("Product has maximum quantity is: " + maxproducts.getName());
        System.out.println("\n TOtal price is " + Products.totalInventoryValue);
        System.out.println("Average is:"+ Products.getAveragePrice());
        Products.setStoreName("Kho miền Nam");
        System.out.println("After change: " + Products.getStoreName());

    }
}


        }
        }

