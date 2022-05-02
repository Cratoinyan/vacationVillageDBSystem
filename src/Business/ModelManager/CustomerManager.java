package Business.ModelManager;

import Business.Model.Customer;
import DB.DAO.CustomerDAO;

public class CustomerManager {
    private CustomerDAO customerDAO;

    public CustomerManager(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void addCustomer(Customer customer){
        customerDAO.addCustomer(customer);
    }
}
