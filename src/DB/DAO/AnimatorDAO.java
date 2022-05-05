package DB.DAO;

import Business.Model.Animator;
import DB.DbContext;

public class AnimatorDAO {

    public void addAnimator(Animator animator){
        String sql = "insert into animator values('" + animator.getID() + "','" + animator.getName() + "','" +
                animator.getPhoneNum() + "','" + animator.getExpArea() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void removeCustomer(String animatorID){
        //delete animator password
        String sql = "delete from animatorPassword where animatorID = " + animatorID;
        DbContext.ExecuteQuery(sql);

        //delete equipment used by the animator
        sql = "delete from equipment where eSSN = " + animatorID;
        DbContext.ExecuteQuery(sql);

        //delete equip person
        sql = "delete from equip_person where empID = " + animatorID;
        DbContext.ExecuteQuery(sql);

        //delete animator's appointments
        sql = "delete from appointment where animatorID = " + animatorID;
        DbContext.ExecuteQuery(sql);

        //delete animator
        sql = "delete from animator where empID = " + animatorID;
        DbContext.ExecuteQuery(sql);
    }
}
