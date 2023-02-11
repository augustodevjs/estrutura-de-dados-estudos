package Vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Adiciona um elemento no vetor, mas é mal otimizado.

    /* public void add(String element) {
        for(int i = 0; i < this.elementos.length; i++) {
            if(this.elementos[i] == null) {
                this.elementos[i] = element;
                break;
            }
        }
    } */

//    public void add(String element) throws Exception {
//        if(this.tamanho < this.elementos.length) {
//            this.elementos[this.tamanho] = element;
//            this.tamanho++;
//        } else {
//            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
//        }
//    }

    public boolean add(String element) {
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = element;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public String busca(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        return this.elementos[posicao];
    }

    public int tamanho() {
        return this.tamanho;
     }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0;  i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
