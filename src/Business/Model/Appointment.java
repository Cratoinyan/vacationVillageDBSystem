package Business.Model;

public class Appointment {
    private String customerID;
    private String activityID;
    private int animatorID;
    private String dateAndHour;


    public Appointment(String customerID, String activityID, int animatorID, String dateAndHour) {
        this.customerID = customerID;
        this.activityID = activityID;
        this.animatorID = animatorID;
        this.dateAndHour = dateAndHour;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getActivityID() {
        return activityID;
    }

    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    public int getAnimatorID() {
        return animatorID;
    }

    public void setAnimatorID(int animatorID) {
        this.animatorID = animatorID;
    }

    public String getDateAndHour() {
        return dateAndHour;
    }

    public void setDateAndHour(String dateAndHour) {
        this.dateAndHour = dateAndHour;
    }
}
