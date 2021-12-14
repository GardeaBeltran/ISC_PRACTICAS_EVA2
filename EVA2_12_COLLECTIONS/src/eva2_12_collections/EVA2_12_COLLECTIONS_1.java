/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_collections;

import java.util.LinkedList;

/**
 *
 * @author Ximena Hernandez
 */
public class EVA2_12_COLLECTIONS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LISTA ENLAZADA ---> LINKED LIST
        LinkedList<Integer> LinkedList = new LinkedList();
        /* <>Tipos de datps genericos
        
        */
        LinkedList.add(100);
        LinkedList.add(200);
        LinkedList.add(300);
        LinkedList.add(400);
        LinkedList.add(500);
        LinkedList.add(600);
        LinkedList.add(700);
        System.out.println(LinkedList);
        System.out.println(LinkedList.get(4));
        LinkedList.remove(4);
        System.out.println(LinkedList);
        LinkedList.clear();
        System.out.println(LinkedList);
    }
    
}
