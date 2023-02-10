package Vetor;

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
}
