import Business.Model.Animator;
import Business.Model.Customer;
import Business.ModelManager.AnimatorManager;
import Business.ModelManager.CustomerManager;
import DB.DAO.AnimatorDAO;
import DB.DAO.CustomerDAO;
import DB.DbContext;
import UI.MainPage;

public class main {
    public static void main(String args[]) {
        MainPage mainPage = new MainPage();
        DbContext db = new DbContext();
        CustomerDAO customerDAO = new CustomerDAO();
        AnimatorDAO animatorDAO = new AnimatorDAO();
        CustomerManager customerManager = new CustomerManager(customerDAO);
        AnimatorManager animatorManager = new AnimatorManager(animatorDAO);
//        Customer customer = new Customer("123456789","Umut",21,12,"5071132150");
//        customerManager.addCustomer(customer);
//        customerManager.removeCustomer("123456789");

        Animator animator = new Animator("333333333", "emp", "1234567890", "emparea");
        animatorManager.addAnimator(animator);

//        animatorManager.removeAnimator("333333333");
//
//        customer = new Customer("111111111","Hürmet",62,03,"5053597195");
//        customerManager.addCustomer(customer);

        mainPage.db = db;
        mainPage.view();
    }
}