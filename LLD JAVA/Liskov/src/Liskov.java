public class Liskov {
    

    public static void PrintItemPrice(MenuItem item) {
        if (item instanceof BeverageItem) {
            System.out.println("BeverageItem price is");
        } else {
            System.out.println("MenuItem Price :");
        }
        System.out.println(item.getPrice());
    }

    public static void main(String[] args) throws Exception {
        MenuItem menuItem = new MenuItem(100, "bread", "bread related dish");
        BeverageItem beverageItem = new BeverageItem(20, "coke", "It contains sugar");

        PrintItemPrice(menuItem);
        PrintItemPrice(beverageItem);

    }
}
