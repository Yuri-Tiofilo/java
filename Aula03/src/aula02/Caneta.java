
package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Sua caneta está tampada");
        }
        else {
            System.out.println("Estou rabiscando");
        }
    }
    protected void tampar() {
        this.tampada = true;
       
    }
    protected void destampar() {
        this.tampada = false;
    }
}
