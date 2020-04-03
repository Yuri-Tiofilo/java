package br.com.unifacef.dc.lista3.ex01;

import java.util.Calendar;
import java.util.Date;

public class Teste {

    
    public static void main(String[] args) {
        Passageiro pessoa1 = new Passageiro();
        pessoa1.setNome("Yuri");
        pessoa1.setCpf("45512734814");
        
        Voo voo1 = new Voo();
        voo1.setDestino("Holanda");
        voo1.setNumero("123");
        
        Reserva obj1 = new Reserva();
        
        obj1.setCodigo(12369);
        obj1.setPassageiro(pessoa1);
        obj1.setVoo(voo1);
        
        Calendar date = Calendar.getInstance();
        date.set(Calendar.MONTH, Calendar.APRIL);
        date.set(Calendar.YEAR, 2020);
        date.set(Calendar.DAY_OF_MONTH, 1);

        Date data = date.getTime();
        obj1.setData(data);
       
        
        System.out.println(obj1.toString());
        
       
        
    }
    
}
