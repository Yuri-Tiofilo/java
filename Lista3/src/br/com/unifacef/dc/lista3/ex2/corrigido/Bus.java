package br.com.unifacef.dc.lista3.ex2.corrigido;

import java.util.ArrayList;

public final class Bus {
    private int numero;
    private String placa;
    
    public ArrayList<Passanger>passanges;

    public Bus() {
        this.passanges = new ArrayList();
    }

    public Bus(int numero, String placa, ArrayList<Passanger> buses) {
        this.setNumero(numero);
        this.setPlaca(placa);
        this.setPassanges(buses);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public ArrayList<Passanger> getPassangers() {
        return passanges;
    }

    public void setPassanges(ArrayList<Passanger> passanger) {
        this.passanges = passanger;
    }

    @Override
    public String toString() {
        return "Bus{" + "numero=" + this.numero + ", placa=" + this.placa + ", passanges=" + this.passanges + '}';
    }
    public void addPassanger(Passanger passanger) {
        this.passanges.add(passanger);
    }
    public boolean removePassanger(Passanger passanger) {
        return this.passanges.remove(passanger);
    }
    public int getPassanger(Passanger passanger) {
        return this.passanges.indexOf(passanger);
    }
    public boolean updatePassanger(Passanger actual, Passanger newUser) {
        int pos = this.getPassanger(actual);
        if(pos != 1) {
            this.passanges.set(pos, newUser);
            return true;
        } else {
            return false;
        }
    }
    
    
}
