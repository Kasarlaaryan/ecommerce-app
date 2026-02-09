import com.stschool.ecommerce.controller.CustomerController;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.ui.CustomerMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Signup");
        System.out.println("Enter Your Choice");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                CustomerMenu customerMenu = new CustomerMenu();
                Customer customer = customerMenu.inputCustomerSignupData();
                CustomerController customerController = new CustomerController();
                customerController.handleSignup(customer);
        }


        scanner.close();
    }
}
