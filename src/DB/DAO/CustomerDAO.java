//This class handles the database queries that directly concern the customer model

package DB.DAO;

import Business.Model.Customer;
import DB.DbContext;

public class CustomerDAO {
    public void addCustomer(Customer customer)
    {
        String sql = "insert into customer values('" + customer.getID() + "', '" + customer.getName() + "', " + customer.getAge() + ", "
                + customer.getRoomNumber() + ", '" + customer.getPhoneNumber() + "');";
        DbContext.ExecuteQuery(sql);
    }


    //Function removes the customer with the given ID
    //First the customer password and appointments with the given customerID's are deleted then the customer itself is removed
    public void removeCustomer(String customerID){
        String sql = "delete from customerPassword where customerID = '" + customerID + "';";
        DbContext.ExecuteQuery(sql);
        sql = "delete from appointment where customerID = '" + customerID + "';";
        DbContext.ExecuteQuery(sql);
        sql = "delete from customer where customerID = '" + customerID + "';";
        DbContext.ExecuteQuery(sql);

    }
}
