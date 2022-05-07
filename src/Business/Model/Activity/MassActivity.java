package Business.Model.Activity;

import Business.Model.Activity.Activity;

public class MassActivity extends Activity {
    private String type;
    private String capacity;

    public MassActivity(String ID, String name, String link, String date, String hour, String animatorID, String type, String capacity) {
        super(ID, name, link, date, hour, animatorID);
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
