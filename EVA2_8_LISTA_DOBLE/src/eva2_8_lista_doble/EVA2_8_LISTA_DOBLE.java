/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_lista_doble;

/**
 *
 * @author Ximena Hernandez
 */
public class EVA2_8_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble listaDoble = new ListaDoble();
        listaDoble.add(100);
        listaDoble.add(200);
        listaDoble.add(300);
        listaDoble.add(400);
        listaDoble.add(500);
        System.out.println("Cantidad de nodos: " + listaDoble.length());
        listaDoble.prinList();
        listaDoble.inserAt(0, 0);
        System.out.println("");
        System.out.println("Cantidad de nodos: " + listaDoble.length());
        listaDoble.prinList();
        listaDoble.inserAt(3, -1);
        System.out.println("");
        System.out.println("Cantidad de nodos: " + listaDoble.length());
        listaDoble.prinList();
        listaDoble.clear();
        System.out.println("");
        System.out.println("Cantidad de nodos: " + listaDoble.length());
        listaDoble.prinList();
    }
    
}
   