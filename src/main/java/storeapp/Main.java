package storeapp;

import storeapp.domain.Admin;
import storeapp.domain.Customer;
import storeapp.services.AdminServiceImpl;
import storeapp.services.CustumerServiceImpl;
import storeapp.userinterface.MenuApp;
import storeapp.view.AdminView;
import storeapp.view.CustomerView;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        Admin admin = new Admin();
        CustumerServiceImpl customerService = new CustumerServiceImpl(customer);
        CustomerView customerView = new CustomerView( customerService, customer);
        AdminServiceImpl adminService = new AdminServiceImpl(admin);
        AdminView adminView = new AdminView(adminService, admin);
        MenuApp menuApp = new MenuApp(customerView, adminView);

            menuApp.showMainMenu();
    }
}
