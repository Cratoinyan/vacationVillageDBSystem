import Business.Model.Customer;
import Business.ModelManager.CustomerManager;
import DB.DAO.CustomerDAO;
import DB.DbContext;
import UI.MainPage;

public class main {
    public static void main(String args[]) {
        MainPage mainPage = new MainPage();
        DbContext db = new DbContext();
        CustomerDAO customerDAO = new CustomerDAO();
        CustomerManager customerManager = new CustomerManager(customerDAO);
//        Customer customer = new Customer("123456789","Umut",21,12,"5071132150");
//        customerManager.addCustomer(customer);
//
//        customer = new Customer("111111111","Hürmet",62,03,"5053597195");
//        customerManager.addCustomer(customer);

        mainPage.db = db;
        mainPage.view();
    }
}