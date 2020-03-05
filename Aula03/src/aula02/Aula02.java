
package aula02;

public class Aula02 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.cor = "Azul";
       c1.modelo = "Bic";
       // c1.ponta = 0.5f; -> atributo protegido
       c1.carga = 80;
       c1.destampar();
       c1.rabiscar();
       c1.status();
          
    }
    
}
