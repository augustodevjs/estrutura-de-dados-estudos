package Vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /**
     * Adiciona um valor para dentro da array de elementos.
     */
    public boolean add(String element) {
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = element;
            this.tamanho++;
            return true;
        }
        return false;
    }

    /**
     * Metodo que vai buscar o elemento pela sua posição.
     */
    public String busca(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        return this.elementos[posicao];
    }

    /**
     * Metodo que vai trazer o índice do elemento da array.
     */
    public int busca(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if(this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
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
