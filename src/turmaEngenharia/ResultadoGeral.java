/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turmaEngenharia;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ResultadoGeral {

    public static void main(String args[]) {
        int qtdAlunos;
        int qtdQuestoes;
        Scanner ler = new Scanner(System.in);
        Prova p = new Prova();
        //Quantidade de questoes do gabarito  e prova
        System.out.println("Digite a Quantidade de Questões : ");
        qtdQuestoes = ler.nextInt();
        for (int i = 1; i <= qtdQuestoes ; i++) {
                System.out.println("Digite gabarito da questão"+i+" :");
                String alt = ler.next();
                p.preencheGabarito(i, alt);
            }
        System.out.println("Digite a Quantidade de Alunos Inscritos : ");
        qtdAlunos = ler.nextInt();
        //Vai criar o aluno e popular na lista aluno.
        for (int j = 0; j < qtdAlunos; j++) {
            System.out.println("Digite seu nome :");
            String nome = ler.next();
            Concorrentes c = new Concorrentes(nome);
            for (int i = 1; i <= qtdQuestoes; i++) {
                System.out.println("Digite a alternativa Correta da Questão"+i+" :");
                String alter = ler.next();
                c.populaCandidatos(i, alter);
            }
            p.fazerProva(c);
            p.corrigirProva(qtdQuestoes);
            p.imprimirParticipantes();
        }
        p.imprimirParticipantes();
        System.out.println("Gabarito - "+ p);

    }
}
