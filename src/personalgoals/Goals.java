package personalgoals;

import static java.lang.Character.toUpperCase;

/**
 *
 * @author Felipe Naganava
 */
public class Goals{
    private String nome;
    private String descricao;
    private int pontos;
    private char dificuldade;
    
    public Goals(String nome, String descricao, int pontos, char dificuldade){
        if("FMD".indexOf(toUpperCase(dificuldade))>= 0){
            this.nome = nome;
            this.descricao = descricao;
            this.pontos = pontos;
            this.dificuldade = dificuldade;
        }
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public char getDificuldade() {
        return dificuldade;
    }
    
    
}
