import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLJDBC {
    public static void main(String args[]) {
        Connection c = null;
        Statement statement = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection(DBCredentials.url,
                            DBCredentials.user, DBCredentials.password);
            c.setAutoCommit(false);
            statement = c.createStatement();
//            ResultSet rs = statement.executeQuery("select * from wallet");
//
//            while ( rs.next() ) {
//                Long id = rs.getLong("wallet-id");
//                Long deposit = rs.getLong("deposit");
//                Long uId  = rs.getLong("user-id");
//                System.out.println( "Wallet ID = " + id );
//                System.out.println( "Deposit = " + deposit );
//                System.out.println( "User ID = " + uId );
//                System.out.println();
//            }
//            rs.close();
//            statement.close();
//            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}