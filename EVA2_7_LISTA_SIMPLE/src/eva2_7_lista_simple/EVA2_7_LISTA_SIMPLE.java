 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author Ximena Hernandez
 */
public class EVA2_7_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
        //CREAR LISTA
        /*int[] miArreglo = new int [1000000];
        for (int i = 0; i < miArreglo.length; i++) {
            miArreglo[i] = (int)(Math.random()* 1000);
        }
        for (int i = 0; i < 1000000; i++) {
            miLista.add(new Nodo(1));
        }*/
        Lista miLista = new Lista(); //Creo una lista vacia
        miLista.prinList();
        
        miLista.add(100);
        miLista.add(200);//1
        miLista.add(300);//2
        miLista.add(400);//3
        miLista.add(500);//4
        System.out.println("Conteo: " + miLista.length());
        miLista.prinList();
         System.out.println("\nDespues de insertar al inicio");
        miLista.inserAt(4,999);
        System.out.println("Conteo: " + miLista.length());
        miLista.prinList();
        System.out.println("\nDespues de borrar");
         miLista.deleteAt(5);
        miLista.prinList();
        System.out.println("Conteo: " + miLista.length());
         miLista.add(7777777);
         System.out.println("\nDespues de agregar");
        miLista.prinList();
        System.out.println("Conteo: " + miLista.length());
        
        for (int i = miLista.length() - 1; i>=0; i--) {
            try {
                System.out.print(miLista.get(i) + "-");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
         
         
       /* miLista.clear();
        System.out.println("\nDespues del borrado");
        miLista.prinList();
        miLista.add(new Nodo(1000));
        miLista.add(new Nodo(2000));
        System.out.println("");
        miLista.prinList();*/
       
    }
     
}
 