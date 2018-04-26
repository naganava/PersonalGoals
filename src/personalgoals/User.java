package personalgoals;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Felipe Naganava
 */
class User {
    private final String nome;
    private final Map goals = new HashMap();
    private int pontuacao;

    public User(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }
    
    public void AdicionaGoal(Goals goal){
        goals.put(goal,false);
    }
    
    public boolean CumpreGoal(Goals goal){
        if (this.goals.containsKey(goal) && "false".equals(this.goals.get(goal).toString())){
            this.goals.replace(goal,true);
            this.pontuacao += goal.getPontos();
            return true;
        }
        return false;
    }
    
    public boolean PossuiGoal(Goals goal){
        return this.goals.containsKey(goal);
    }
    
}
