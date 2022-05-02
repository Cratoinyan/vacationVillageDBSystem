package DB.DAO;

import Business.Model.Customer;
import DB.DbContext;

import java.sql.Connection;
import java.sql.Statement;

public class CustomerDAO {
    private static Connection connection = null;

    public void addCustomer(Customer customer)
    {
        connection = DbContext.getConnection();
        Statement stm = null;
        String sql = null;
        try{
            stm = connection.createStatement();
            sql = "insert into customer values('" + customer.getID() + "', '" + customer.getName() + "', " + customer.getAge() + ", "
                    + customer.getRoomNumber() + ", '" + customer.getPhoneNumber() + "');";
            System.out.println(sql);
            stm.executeUpdate(sql);

            connection.commit();
            stm.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
}
