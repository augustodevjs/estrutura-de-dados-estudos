package Vetor.teste;

import Vetor.Vetor;

public class class03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        try {
            vetor.add("Augusto");
            vetor.add("João");
            vetor.add("João");
            vetor.add("João");
            vetor.add("João");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
