public class Shop {
    public static void main(String[] args) {
        Customers[] customers = {
                new Customers("0013", 490),
                new Customers("0052", 1000),
                new Customers("0081", 290),
                new Customers("2122", 2000)
        };
        for (int i = 0; i < customers.length; i++) {
            customers[i].print();
        }
    }
}
