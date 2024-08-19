
package controller;

public class ControllerSomaDigitos {
    public ControllerSomaDigitos (){
        super();
    }
    
    public int SomaDigitos (int num, int soma){
        if (num < 1){
            return 0;
        }
        else {
           return num % 10 + SomaDigitos ((num/10), soma);     
        }
    }
    
}
