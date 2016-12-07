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
        for (Concorrentes c : todosConcorrentes) {
            for (int i = 1; i <= qtdQuestoes; i++) {
                String a = gabarito.get(i);
                String b = c.getResposta().get(i);
                if (a.contains(b)) {
                 c.contarAcerto();
                }
                }
            }
    }

    @Override
    public String toString() {
        return "Prova{" + "resposta=" + gabarito + '}';
    }

}
