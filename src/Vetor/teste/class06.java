package Vetor.teste;

import Vetor.Vetor;

public class class06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);

        vetor.add("Fernanda");
        vetor.add("Roxela");
        vetor.add("Augusto");
        vetor.add("João Augusto");

        System.out.println(vetor.busca("Augusto"));
    }
}
