 package teste;

 import Vetor.VetorObjetos;

 public class class10 {
     public static void main(String[] args) {
         VetorObjetos vetor = new VetorObjetos(3);

         vetor.add("Augusto");
         vetor.add("Augusto");
         vetor.add(1);

         System.out.println("Tamanho do vetor " + vetor.tamanho());
         System.out.println(vetor);
     }
 }
