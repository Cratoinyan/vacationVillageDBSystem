package DB.DAO;

import Business.Model.Customer;
import Business.Model.EmergencyInformation;
import DB.DbContext;

public class EmergencyInformationDAO {

    public void addEmergencyInformation(EmergencyInformation emergencyInformation)
    {
        String sql = "insert into EmergencyInformation values('" + emergencyInformation.getActivityID() + "', '"
                + emergencyInformation.getPhoneNumber() + "', " + emergencyInformation.getLockerNumber() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void removeEmergencyInformation(String activityID){
        String sql = "delete from EmergencyInformation where activityID = '" + activityID + "';";
        DbContext.ExecuteQuery(sql);
    }
}
