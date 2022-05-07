package Business.ModelManager;

import Business.Model.Activity.IndividualActivity;
import Business.Model.Activity.MassActivity;
import DB.DAO.ActivityDAO;
import DB.QueryResult;

import java.util.ArrayList;

public class ActivityManager {
    private ActivityDAO activityDAO;

    public ActivityManager(ActivityDAO activityDAO) {
        this.activityDAO = activityDAO;
    }

    public void addIndividualActivity(IndividualActivity individualActivity){
        activityDAO.addIndividualActivity(individualActivity);
    }

    public void addMassActivity(MassActivity massActivity){
        activityDAO.addMassActivity(massActivity);
    }

    public void updateActivityCapacity(String activityID, String newCapacity){
        activityDAO.updateMassActivityCapacity(activityID, newCapacity);
    }

    public String[] getMassActivityTypes(){
        QueryResult queryResult = activityDAO.getActivityTypes();
        ArrayList<String> types = new ArrayList<String>();
        String[] strArr = null;

        try {
            while (queryResult.resultSet.next()){
                types.add(queryResult.resultSet.getString("activityType"));
            }

            strArr = new String[types.size()];
            strArr = types.toArray(strArr);
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        return strArr;
    }
}
