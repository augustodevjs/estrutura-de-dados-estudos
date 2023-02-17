package teste;

import Vetor.Vetor;

public class class04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.add("Augusto");
        vetor.add("Augusto");
        vetor.add("Augusto");

        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
}
