/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arbol_b;

/**
 *
 * @author Ximena Hernandez
 */
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        this.root = null; //Arbol vacio
    }

    
    //APARTIR DE AQUI TODO ES RECURSIVO
    //AGREGAR NODO
    public void add(int valor){
        Nodo nuevo = new Nodo (valor);
    //VERIFICAMOS SI HAY NODOS EN EL ARBOL
    if(root==null){ //Arbol vacio
    root = nuevo;
} else{
    //METODO RECURSIVO PARA AGREGAR NODOS
    addRecu(root, nuevo);
}
    }
    //metodo recursivo (nodo actual, nodo nuevo)
    private void addRecu(Nodo actual, Nodo nuevo){
        //VERIFICAR EL LADO AL QUE VA EL NODO
        if(nuevo.getDato()< actual.getDato()){ //IZQ: VALOR NUEVO MENOR QUE NODO ACTUAL
            if(actual.getIzquierda() == null){//TENEMOS ESPACIO, AQUI INSERTAMOS EL NUEVO NODO
                actual.setIzquierda(nuevo);
            }else{//Llamar de nuevo al metodo recursivo, pero moviendome a la izquierda
                addRecu(actual.getIzquierda(), nuevo);
            }
        }else if(nuevo.getDato()> actual.getDato()){//DERECHA
            if(actual.getDerecha()== null){//TENEMOS ESPACIO, AQUI INSERTAMOS EL NUEVO NODO
                actual.setDerecha(nuevo);
            }else{//Llamar de nuevo al metodo recursivo, pero moviendome ala izq
                addRecu(actual.getDerecha(),nuevo);
            }
        }else{//VALOR IGUAL AL ACTUAL
            System.out.println("El valor ya existe en ek arbol");
        }
    }
    //IMPRIMIR NODOS EN EL ARBOL
    public void printPreOrder(){
        preOrder (root); //llama al metodo preorder recursivo
        
    }
    private void preOrder(Nodo actual){
        if (actual !=null){
            System.out.print("[" + actual.getDato() + "]"); //visit node
            preOrder(actual.getIzquierda()); //travers left subtree
            preOrder(actual.getDerecha());//travers rigth subtree
        }
    }
        /* HACER METODOS:
        POST ORDER
        IN ORDER
        */
        //IN ORDER
    public void printinOrder(){
        inOrder(root); //llama al metodo recursivo pre order
    }
        private void inOrder(Nodo actual){
            if (actual !=null){
            System.out.print("[" + actual.getDato() + "]"); //visit node
            inOrder(actual.getIzquierda()); //travers left subtree
            inOrder(actual.getDerecha());//travers rigth subtree
        }
        }
    
}
