package DB.DAO;

import Business.Model.Activity.IndividualActivity;
import Business.Model.Activity.MassActivity;
import DB.DbContext;
import DB.QueryResult;

public class ActivityDAO {
    public void addIndividualActivity(IndividualActivity individualActivity){
        String sql = "call addIndActivity('" + individualActivity.getName() + "','" + individualActivity.getLink() +"','" +
                individualActivity.getDate() + "','" + individualActivity.getHour() + "'," + individualActivity.getAnimatorID() + ",'" +
                individualActivity.getAge() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void addMassActivity(MassActivity massActivity){
        String sql = "call addMassAct('" + massActivity.getName() + "','" + massActivity.getLink() +"','" +
                massActivity.getDate() + "','" + massActivity.getHour() + "'," + massActivity.getAnimatorID() + ",'" +
                massActivity.getType() + "','" + massActivity.getCapacity() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void updateMassActivityCapacity(String activityID, String newCapacity){
        String sql = "update massActivity set capacity = '" + newCapacity + "' where activityID = '" + activityID + "';";
        DbContext.ExecuteQuery(sql);
    }

    public QueryResult getActivityTypes(){
        String sql = "select activityType from massActivity";
        QueryResult queryResult;

        queryResult = DbContext.ExecuteSelectQuery(sql);
        return queryResult;
    }
}
