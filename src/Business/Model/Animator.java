package Business.Model;

public class Animator {
    private String ID;
    private String name;
    private String phoneNum;
    private String expArea;

    public Animator(String ID, String name, String phoneNum, String expArea) {
        this.ID = ID;
        this.name = name;
        this.phoneNum = phoneNum;
        this.expArea = expArea;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getExpArea() {
        return expArea;
    }

    public void setExpArea(String expArea) {
        this.expArea = expArea;
    }
}
