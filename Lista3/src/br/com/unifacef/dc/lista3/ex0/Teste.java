package br.com.unifacef.dc.lista3.ex0;

public class Teste {
   
    public static void main(String[] args) {
       Conta obj1 = new Conta();
       obj1.setAgencia("3256");
       obj1.setNome("Yuri");
       obj1.setNumero("123456");
       obj1.setSaldo(1000);
       
       CartaoDebito obj2 = new CartaoDebito();
       
       obj2.setConta(obj1);
       obj2.setCvv(123);
       obj2.setLimite(1000);
       obj2.setNumeroCartao("1222222222222");
       obj2.setSenha("123");
       obj2.setValidade("10/2021");
       
       System.out.println(obj2.toString());
       
       
    }
    
}
