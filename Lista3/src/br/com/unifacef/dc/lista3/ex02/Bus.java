package br.com.unifacef.dc.lista3.ex02;

public class Bus {
    private int number;
    private String placa;
    private Passanger passanger;

    public Bus(int number, String placa, Passanger passanger) {
        this.number = number;
        this.placa = placa;
        this.passanger = passanger;
    }
    public Bus() {
        
    }
    
    

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Passanger getPassanger() {
        return passanger;
    }

    public void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }

    @Override
    public String toString() {
        return "Bus{" + "number=" + number + ", placa=" + placa + ", passanger=" + passanger + '}';
    }
    
    
    
    
    
}
