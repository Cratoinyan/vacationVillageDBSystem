package Business.Model;

public class EmergencyInformation {
    private String activityID;
    private String phoneNumber;
    private String lockerNumber;

    public EmergencyInformation(String activityID, String phoneNumber, String lockerNumber) {
        this.activityID = activityID;
        this.phoneNumber = phoneNumber;
        this.lockerNumber = lockerNumber;
    }

    public String getActivityID() {
        return activityID;
    }

    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLockerNumber() {
        return lockerNumber;
    }

    public void setLockerNumber(String lockerNumber) {
        this.lockerNumber = lockerNumber;
    }
}
