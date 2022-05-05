package Business.ModelManager;

import Business.Model.Animator;
import DB.DAO.AnimatorDAO;

public class AnimatorManager {

    private AnimatorDAO animatorDAO;

    public AnimatorManager(AnimatorDAO animatorDAO) {
        this.animatorDAO = animatorDAO;
    }

    public void addAnimator(Animator animator){
        animatorDAO.addAnimator(animator);
    }

    public void removeAnimator(String animatorID){
        animatorDAO.removeAnimator(animatorID);
    }
}
