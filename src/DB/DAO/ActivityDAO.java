package DB.DAO;

import Business.Model.Activity.IndividualActivity;
import Business.Model.Activity.MassActivity;
import DB.DbContext;

public class ActivityDAO {
    public void addIndividualActivity(IndividualActivity individualActivity){
        String sql = "call addIndActivity('" + individualActivity.getID() + "','"+ individualActivity.getName() + "','" + individualActivity.getLink() +"','" +
                individualActivity.getDate() + "','" + individualActivity.getHour() + "','" + individualActivity.getAge() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void addMassActivity(MassActivity massActivity){
        String sql = "call addIndActivity('" + massActivity.getID() + "','"+ massActivity.getName() + "','" + massActivity.getLink() +"','" +
                massActivity.getDate() + "','" + massActivity.getHour() + "','" + massActivity.getType() + "','" + massActivity.getCapacity() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void updateMassActivityCapacity(String activityID, String newCapacity){
        String sql = "update massActivity set capacity = '" + newCapacity + "' where activityID = '" + activityID + "';";
        DbContext.ExecuteQuery(sql);
    }
}
