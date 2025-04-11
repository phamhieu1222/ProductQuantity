public class Products {
    private int id;
    String name;
    double price;
    int quantity;
   static String storeName;
    static int totalProducts =0;
    static double totalInventoryValue = 0;
    public Products(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        totalProducts++;
        totalInventoryValue += getTotalInventoryValue();
    }

    public void display() {
        System.out.println(id + " " + name + " " + price + " " + quantity);
    }
    public double getTotalInventoryValue() {
        return price*quantity;
    }
    public double getTotalProducts() {
        return totalProducts;

    }
    public static double getAveragePrice(){
        return totalInventoryValue/totalProducts;
    }
    public static String getStoreName(){
        return storeName;
    }
    public static void setStoreName(String name){
        storeName = name;

    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}

