package personalgoals;

/**
 *
 * @author Felipe Naganava
 */
public class PersonalGoals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Goals goal1 = new Goals("Goal1", "goal1",1000,'f');
        Goals goal2 = new Goals("Goal2", "goal2",1000,'f');
        User user = new User("Felipe");
        user.AdicionaGoal(goal1);
        CumpreGoal(goal1,user);
        CumpreGoal(goal1,user);
        CumpreGoal(goal2,user);
        user.AdicionaGoal(goal2);
        CumpreGoal(goal2,user);

        System.out.println(user.getNome() +" possui "+user.getPontuacao()+" pontos");
        
    }
    
    /**
     *
     * @param goal a meta cumprida
     * @param user o usuário que cumpriu a meta
     */
    public static void CumpreGoal(Goals goal, User user){
        if (user.CumpreGoal(goal)){
            System.out.println("Meta "+goal.getNome()+" Cumprida por "+ user.getNome());
        }else if (user.PossuiGoal(goal)){
            System.out.println("Meta "+goal.getNome()+" já cumprida");
        }else {
            System.out.println("Usuário não possui a meta "+goal.getNome());
        }
    }
}
