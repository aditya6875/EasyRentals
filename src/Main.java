import com.easyrentals.model.Customer;
import com.easyrentals.ui.UserInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer's DATA\n");
        UserInterface user = new UserInterface();
        user.getDetails();

        System.out.println("\nBike DATA: ");

        user.displayAvailableBikesForCustomer();



    }

}