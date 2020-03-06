package br.com.unifacef.es21853.ex0;

public class Car {
    public String marca;
    public String modelo;
    public boolean motor;
    public float velocidade;
    
    // constructor default
    
    public Car(String marca, String modelo, boolean motor, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.velocidade = velocidade;
    }
    
    // constructor  default
    
    public Car() {
        this.marca = "Não definido";
        this.modelo = "Não definido";
        this.motor = false;
        this.velocidade = 0;
    }
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
            this.velocidade = 0;
        } else {
            this.motor = false;
            this.velocidade = 0;
        }
    }
    public void acelera(float velocidade) {
        if(this.motor)
            this.velocidade +=  velocidade ;
    }
    public void frear(float velocidade) {
        if(this.motor)
            this.velocidade -=  velocidade;
    }
    @Override
    public String toString(){
        return "Marca:"+ this.marca+
                "\n modelo:" + this.modelo + 
                "\n Velo:" + this.velocidade;
    }
}
