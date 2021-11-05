/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_gcd;

/**
 *
 * @author Ximena Hernandez
 */
public class EVA2_4_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("EL MCD de 48 y 100 es "+ gcd(48,100));
    }
    
    public static int gcd(int iDividiendo, int iDivisor){
        if(iDivisor== 0) //Detenernos
            return iDividiendo;
        else{  //Recursividad
            int iResi = iDividiendo % iDivisor;
            return gcd(iDivisor, iResi);
        }
    }
}
