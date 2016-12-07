/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turmaEngenharia;

import java.util.HashMap;

public class Concorrentes {
    private String nome;
    private double contAcert;
    private HashMap <Integer, String> resposta = new HashMap<>();

    public Concorrentes(String nome) {
        this.nome = nome;
    }
    
    public void populaCandidatos(int id,String alter){
        resposta.put(id,alter);
    }
    
    public void contarAcerto(){
       contAcert++;
    }
    
      @Override
    public String toString() {
        return "{" + "Nome :" + nome + ", Resposta :" + resposta  + ", Total de Acertos :" + contAcert+" }";
    }
    
    
    
    public double getContAcert() {
        return contAcert;
    }

    public void setContAcert(int contAcert) {
        this.contAcert = contAcert;
    }

    public HashMap<Integer, String> getResposta() {
        return resposta;
    }
    
  
    
}
