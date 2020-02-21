package aula;

public class Car {
    String nome;
    String ano;
    boolean motor;
    float velocidade;
    void ligaMotor() {
        if(this.motor == false) {
            this.motor = true;
        } else {
            this.motor = true;
        }
    }
    void desligaMotor() {
        if(this.motor == true) {
            this.motor = false;
        } else {
            this.motor = false;
        }
    }
    void acelera(float velocidade) {
        this.velocidade =  velocidade + this.velocidade;
    }
    void frear(float velocidade) {
        this.velocidade =  velocidade - this.velocidade;
    }
}
