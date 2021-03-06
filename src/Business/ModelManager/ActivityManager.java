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

    public void updateActivityCapacity(String date, String hour, String newCapacity){
        activityDAO.updateMassActivityCapacity(date,hour , newCapacity);
    }

    public Integer getMassActivityParticipantCount(String date, String hour){
        QueryResult queryResult = activityDAO.getMassActivityCapacity(date, hour);

        Integer indexOfSeperation;
        String dummy = null;
        String capacity = null;

        try {
            while (queryResult.resultSet.next()){
                dummy = queryResult.resultSet.getString("capacity");
                indexOfSeperation = dummy.indexOf("-");
                capacity = dummy.substring(indexOfSeperation + 1, dummy.length());
                return Integer.parseInt(capacity);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        return null;
    }

    public Integer getMassActivityCapacity(String date, String hour){
        QueryResult queryResult = activityDAO.getMassActivityCapacity(date, hour);

        Integer indexOfSeperation;
        String dummy = null;
        String participantCount = null;

        try {
            while (queryResult.resultSet.next()){
                dummy = queryResult.resultSet.getString("capacity");
                indexOfSeperation = dummy.indexOf("-");
                participantCount = dummy.substring(0, indexOfSeperation);
                return Integer.parseInt(participantCount);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        return null;
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

        queryResult.closeConnection();

        return strArr;
    }

    public String getActivityInfo(){
        String activityInfos = "";
        QueryResult query = activityDAO.getActivityInfo();

        try {
            while(query.resultSet.next()){
                activityInfos = activityInfos + query.resultSet.getString("name") + "(" + query.resultSet.getString("date") + ") " +
                query.resultSet.getString("hour") + "\n";
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        query.closeConnection();
        return activityInfos;
    }

    public String[] getIndActivityInfo(String date, String hour){
        QueryResult queryResult = activityDAO.getIndActivityInfo(date, hour);
        ArrayList<String> info = new ArrayList<String>();
        String [] resultInfo = null;

        try {
            while (queryResult.resultSet.next()){
                info.add("" + queryResult.resultSet.getInt("activityID"));
                info.add("" + queryResult.resultSet.getInt("animatorID"));
                info.add("" + queryResult.resultSet.getInt("age"));
                resultInfo = new String[info.size()];
                resultInfo = info.toArray(resultInfo);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        return resultInfo;
    }

    public String[] getMassActivityInfo(String date, String hour){
        QueryResult queryResult = activityDAO.getMassActivityInfo(date, hour);
        ArrayList<String> info = new ArrayList<String>();
        String [] resultInfo = null;

        try {
            while (queryResult.resultSet.next()){
                info.add("" + queryResult.resultSet.getInt("activityID"));
                info.add("" + queryResult.resultSet.getInt("animatorID"));

                resultInfo = new String[info.size()];
                resultInfo = info.toArray(resultInfo);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        return resultInfo;
    }

    public boolean verifyMassActivityCapacity(String date, String hour){
        if(getMassActivityCapacity(date, hour) > getMassActivityParticipantCount(date, hour)){
            return true;
        }

        return false;
    }

    public void deleteActivity(Integer ID){
        activityDAO.deleteActivity(ID);
    }
}
