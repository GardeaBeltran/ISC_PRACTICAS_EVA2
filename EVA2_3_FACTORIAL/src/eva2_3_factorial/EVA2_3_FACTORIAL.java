/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_factorial;

/**
 *
 * @author Ximena Hernandez
 */
public class EVA2_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("factorial de 5-" + factorialFor(5));
    }
    
    public static int factorial (int iVal){ //facorial usando recursividad
        if(iVal==0) //determinamos la recursividad
            return 1;
        else
            return iVal * factorial(iVal-1);
    }
    public static int factorialFor (int iVal){ //facorial usando ciclo
        int iTemp=1;
        for (int i = iVal; i < 10; i++) {
            iTemp = iTemp + 1;
        }
        return iTemp;
    }
}
