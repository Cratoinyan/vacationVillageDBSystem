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

        if(customerManager.authenticateCustomer("123456789", "f53ca2e83be8774c")){
            System.out.println("user exists");
        }
        else{
            System.out.println("wrong password");
        }
//
//        Animator animator = new Animator("333333333", "emp", "1234567890", "emparea");
//        animatorManager.addAnimator(animator);

        if(animatorManager.authenticateAnimator("333333333", "9e518f8736ab6eaf")){
            System.out.println("animator exists");
        }
        else{
            System.out.println("wrong password");
        }

//        animatorManager.removeAnimator("333333333");
//
//        customer = new Customer("111111111","Hürmet",62,03,"5053597195");
//        customerManager.addCustomer(customer);

//        mainPage.db = db;
//        mainPage.view();
    }
}