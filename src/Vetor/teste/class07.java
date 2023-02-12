package Vetor.teste;

import Vetor.Vetor;

public class class07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.add("Fernanda");
        vetor.add("Roxela");
        vetor.add("Augusto");
        vetor.add("João Augusto");

        vetor.add(3, "Augusto");
    }
}
