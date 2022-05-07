import Business.Model.User.Animator;
import Business.Model.User.Customer;
import Business.ModelManager.ActivityManager;
import Business.ModelManager.AnimatorManager;
import Business.ModelManager.CustomerManager;
import DB.DAO.ActivityDAO;
import DB.DAO.AnimatorDAO;
import DB.DAO.CustomerDAO;
import DB.DbContext;
import UI.Application;

import java.util.Arrays;

public class main {
    public static void main(String args[]) {
        DbContext db = new DbContext();
        CustomerDAO customerDAO = new CustomerDAO();
        AnimatorDAO animatorDAO = new AnimatorDAO();
        CustomerManager customerManager = new CustomerManager(customerDAO);
        AnimatorManager animatorManager = new AnimatorManager(animatorDAO);
        ActivityDAO activityDAO = new ActivityDAO();
        ActivityManager activityManager = new ActivityManager(activityDAO);

        Application application = new Application();
        application.startup();

//        Customer customer = new Customer("123456789","Umut",21,12,"5071132150");
//        customerManager.addCustomer(customer);
//        customerManager.removeCustomer("123456789");

//        if(customerManager.authenticateCustomer("5071132150", "1e79591fe1ee56e9")){
//            System.out.println("user exists");
//        }
//        else{
//            System.out.println("wrong password");
//        }

//        Animator animator = new Animator("333333333", "emp", "1234567890", "emparea");
//        animatorManager.addAnimator(animator);
//
//        if(animatorManager.authenticateAnimator("1234567890", "8025f403c01c5b34")){
//            System.out.println("animator exists");
//        }
//        else{
//            System.out.println("wrong password");
//        }

        String[] types = activityManager.getMassActivityTypes();

        System.out.println(Arrays.toString(types));

//        animatorManager.removeAnimator("333333333");
//
//        customer = new Customer("111111111","Hürmet",62,03,"5053597195");
//        customerManager.addCustomer(customer);

//        mainPage.db = db;
//        mainPage.view();
    }
}