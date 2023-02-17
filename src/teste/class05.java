package teste;

import Vetor.Vetor;

public class class05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);

        vetor.add("Augusto");
        vetor.add("Augusto");
        vetor.add("Augusto");
        vetor.add("João Augusto");

        System.out.println(vetor.busca(3));
    }
}
