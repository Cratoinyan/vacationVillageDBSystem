package DB.DAO;

import Business.Model.Customer;
import DB.DbContext;

import java.sql.Connection;

public class CustomerDAO {
    public void addCustomer(Customer customer)
    {
        String sql = "insert into customer values('" + customer.getID() + "', '" + customer.getName() + "', " + customer.getAge() + ", "
                + customer.getRoomNumber() + ", '" + customer.getPhoneNumber() + "');";
        DbContext.ExecuteQuerry(sql);
    }
}
