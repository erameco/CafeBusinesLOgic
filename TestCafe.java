import java.util.ArrayList;

public class TestCafe {

    public static void main(String[] args) {
System.out.println("\n----- Streak Goal Test -----");
        CafeUtil appTest = new CafeUtil();
        System.out.printf("Purchases needed by week 10:");
        appTest.getStreakGoal();
 
        double[] prices = {3.5, 1.5, 4.0, 4.5};
        double total = CafeUtil.getOrderTotal(prices);
        System.out.println("Total order amount: $" + total);
        System.out.println("----- Display Menu Test-----");


        
        ArrayList<String> menu = new ArrayList<>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");

        CafeUtil.printMenuItems(menu);
        System.out.println("\n----- Add Customer Test-----");

        ArrayList<String> customers = new ArrayList<>();
        CafeUtil.addCustomer(customers);

    }

}
