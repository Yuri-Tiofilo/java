
package br.com.unifacef.dc.lista3.ex2.corrigido;


public class Test {

   
    public static void main(String[] args) {
        Passanger pass1 = new Passanger("123", "Mafer");
        Passanger pass2 = new Passanger("1234", "Murilo");
        Passanger pass3 = new Passanger("345", "João");
        
        Bus bus1 = new Bus();
            bus1.setNumero(789);
            bus1.setPlaca("456-hjk");
            bus1.addPassanger(pass1);
            bus1.addPassanger(pass2);
            bus1.addPassanger(pass3);
            
            System.err.println(bus1.toString());
            
            bus1.removePassanger(pass2);
            
            System.err.println(bus1.toString());
            Passanger pass4 = new Passanger("567", "Marechal");
            
            bus1.updatePassanger(pass1, pass4);
            
        
        
    }
    
}
