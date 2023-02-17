 package teste;

import Vetor.Vetor;

public class class09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        vetor.add("Fernanda");
        vetor.add("Roxela");
        vetor.add("Roxela");
        vetor.add("Roxela");
        vetor.add("Roxela");
        vetor.add("Roxela");
        vetor.remove(0);

        System.out.println(vetor);

    }
}
