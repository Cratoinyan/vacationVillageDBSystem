package Business.ModelManager;

import Business.Model.Activity.IndividualActivity;
import Business.Model.Activity.MassActivity;
import DB.DAO.ActivityDAO;

public class ActivityManager {
    private ActivityDAO activityDAO;

    public void addIndividualActivity(IndividualActivity individualActivity){
        activityDAO.addIndividualActivity(individualActivity);
    }

    public void addMassActivity(MassActivity massActivity){
        activityDAO.addMassActivity(massActivity);
    }

    public void updateActivityCapacity(String activityID, String newCapacity){
        activityDAO.updateMassActivityCapacity(activityID, newCapacity);
    }
}
