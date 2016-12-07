
package turmaEngenharia;

public class Perguntas {
    private int id;
    private String alternativa;
    
    public Perguntas (int id, String alternativa){
        this.id = id;
        this.alternativa = alternativa;
    }
    
    public int getId(){
        return id;
    }
    public void setId (int id){
        this.id = id;
    }
    public String getAlternativa(){
        return alternativa;
    }
    public void setAlternativa(String alternativa){
        this.alternativa = alternativa;
    }
    public String toString(){
        return "Questão :"+id+", Alternativa :"+alternativa;
    } 
}
