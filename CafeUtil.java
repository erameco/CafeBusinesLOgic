import java.util.ArrayList;
public class CafeUtil {

    int sum = 0;

    void getStreakGoal() {
        for (int numWeeks = 0; numWeeks <= 10; numWeeks++) {
            sum += numWeeks;

        }

        System.out.println(sum);

    }

    public static double getOrderTotal(double prices[]) {
        double total = 0.0;
        
        for (double price : prices) {
            total += price;
        }
        
        return total;
    }
    public static void printMenuItems(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            String menu = menuItems.get(i);
            System.out.println("Index " + i + ": " + menu);
        }
        }

        public static void addCustomer(ArrayList<String> customers) {
            System.out.println("Please enter your name:");
            String userName = System.console().readLine();
            System.out.println("Hello, " + userName + "!");
    
            int numPeopleAhead = customers.size();
            System.out.println("There are " + numPeopleAhead + " people in front of you");
    
            customers.add(userName);
            System.out.println("Customers list: " + customers);
        }


    }