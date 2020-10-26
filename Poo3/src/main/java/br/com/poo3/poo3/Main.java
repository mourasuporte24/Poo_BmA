package br.com.poo3.poo3;

public class Main {

    public static void main(String[] args) {
        CalculoDeArea cl = new CalculoDeArea();
               
        int x1,y;
        x1 = 5;
        y = 2 * x1;
        
        System.out.println("O valor de X e:" + x1);
        System.out.println("O valor de y é:"   + y );
        
//Utilizando o double
        int x2;
        double y2;
        x2 = 5;
        y2 = x2*5;
        System.out.println("O valor de x é: " + x2 + x1);
        System.out.println("O valor da y é :" + y2);
     
     
        
        
    }
    
}
