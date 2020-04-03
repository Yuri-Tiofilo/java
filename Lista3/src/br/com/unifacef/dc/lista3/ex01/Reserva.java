package br.com.unifacef.dc.lista3.ex01;

import java.util.Date;

public final class Reserva {
   private int codigo;
   private Date datas;
   
   // associação
   private Voo voo;
   private Passageiro passageiro;

    public Reserva(int codigo, Date data, Voo voo, Passageiro passageito) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setVoo(voo);
        this.setPassageiro(passageito);
    }
    
    
    
    Reserva() {
         
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return datas;
    }

    public void setData(Date data) {
        this.datas = data;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageito) {
        this.passageiro = passageito;
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigo=" + this.codigo + ", data=" + this.datas + ", voo=" + this.voo + ", passageiro=" + this.passageiro + '}';
    }
    
    
   
   
   
   
   
    
    
    
}
