/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turmaEngenharia;

import java.util.ArrayList;
import java.util.HashMap;

public class Prova {

    private HashMap<Integer, String> gabarito = new HashMap<>();
    private ArrayList<Concorrentes> todosConcorrentes = new ArrayList<>();

    public Prova() {
    }

    public void preencheGabarito(int id, String alt) {
        gabarito.put(id, alt);
    }

    public void fazerProva(Concorrentes a) {
        todosConcorrentes.add(a);
    }

    public void imprimirParticipantes() {
        for (Concorrentes c : todosConcorrentes) {
            System.out.println("Aluno :" + c);
        }
    }

    
    public void corrigirProva(Concorrentes a) {
        Iterator entradaResp = a.getResposta().entrySet().iterator();
        Iterator entradaGab = gabarito.entrySet().iterator();
        while (entradaGab.hasNext()) {
            Map.Entry entry = (Map.Entry) entradaGab.next();
            Map.Entry entry2 = (Map.Entry) entradaResp.next();
            Integer key = (Integer) entry.getKey();
            String value = (String) entry.getValue();
            Integer idResp = (Integer) entry2.getKey();
            String valorResp = (String) entry2.getValue();
            if (key.equals(idResp)) {
                if (value.equals(valorResp)) {
                    a.contarAcerto();
                }
            }
        } 
    }

    @Override
    public String toString() {
        return "Prova{" + "resposta=" + gabarito + '}';
    }

}
