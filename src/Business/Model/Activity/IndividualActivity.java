package Business.Model.Activity;

import Business.Model.Activity.Activity;

public class IndividualActivity extends Activity {

    private String age;

    public IndividualActivity(String ID, String name, String link, String date, String hour, String animatorID, String ID1, String age) {
        super(ID, name, link, date, hour, animatorID);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
