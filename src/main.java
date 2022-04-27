import DB.DbConnector;
import UI.MainPage;

public class main {
    public static void main(String args[]) {
        MainPage mainPage = new MainPage();
        DbConnector db = new DbConnector();

        mainPage.db = db;
        mainPage.view();
    }
}