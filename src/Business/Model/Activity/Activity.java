package Business.Model.Activity;

public class Activity {
    private String ID;
    private String name;
    private String link;
    private String date;
    private String hour;
    private String animatorID;

    public Activity(String ID, String name, String link, String date, String hour, String animatorID) {
        this.ID = ID;
        this.name = name;
        this.link = link;
        this.date = date;
        this.hour = hour;
        this.animatorID = animatorID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getAnimatorID() {
        return animatorID;
    }

    public void setAnimatorID(String animatorID) {
        this.animatorID = animatorID;
    }
}
