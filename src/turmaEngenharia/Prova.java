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

    public void corrigirProva(int qtdQuestoes) {
       for (Concorrentes cand : todosConcorrentes) {
            Iterator entries2 = cand.getResposta().entrySet().iterator();
            Iterator entries = gabarito.entrySet().iterator();
            while (entries.hasNext() || entries2.hasNext()) {
                Map.Entry entry = (Map.Entry) entries.next();
                Map.Entry entry2 = (Map.Entry) entries2.next();
                Integer key = (Integer) entry.getKey();
                String value = (String) entry.getValue();
                Integer idResp = (Integer) entry2.getKey();
                String valorResp = (String) entry2.getValue();
                if (key.equals(idResp)) {
                    if (value.equals(valorResp)) {
                    cand.contarAcerto();
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Prova{" + "resposta=" + gabarito + '}';
    }

}
