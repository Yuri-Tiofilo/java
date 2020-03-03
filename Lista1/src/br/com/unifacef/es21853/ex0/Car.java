package br.com.unifacef.es21853.ex0;

public class Car {
    public String marca;
    public String modelo;
    public boolean motor;
    public float velocidade;
    public void ligaMotor() {
        if(this.motor == false) {
            this.motor = true;
        } else {
            this.motor = true;
        }
    }
    public void desligaMotor() {
        if(this.motor == true) {
            this.motor = false;
        } else {
            this.motor = false;
        }
    }
    public void acelera(float velocidade) {
        this.velocidade +=  velocidade ;
    }
    public void frear(float velocidade) {
        this.velocidade -=  velocidade;
    }
}
