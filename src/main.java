import DB.DbConnector;

public class main {
    public static void main(String args[]) {
        DbConnector db = new DbConnector();
        db.connect();
    }
}