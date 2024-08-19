package view;
import controller.ControllerSomaDigitos;
public class PrincipalSomaDigitos {
    public static void main (String [] ags){
        
        ControllerSomaDigitos m = new ControllerSomaDigitos();
        int num = 2234;
        int resp = m.SomaDigitos(num, 0);
        System.out.println("Somatório dos dígitos de " + num + " = " + resp);
    }
    
}
