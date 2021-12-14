/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_queue;

/**
 *
 * @author Ximena Hernandez
 */
public class Lista {   //lista simplemente enlazada (linked list)
    private Nodo Inicio;
    private Nodo fin;
    private int tama; //contador de nodos
    
    public Lista(){
        Inicio = null; //Lista vacia
        fin= null;
        tama = 0;
    }
    
    //agregar nodos
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        //Hay nodos en la lista?
        if(Inicio == null){ //lista vacia
            Inicio = nuevo; //Conectamos el primer nodo a la lista
            fin = nuevo;
        }else{ //lista con nodos
            //Hay que movernos al final de la lista
            //usando temp, nodo por nodo hasta llegar al final
           /* Nodo temp = Inicio; //Aqui empezamos
            //while
            while (temp.getSiguiente() !=null){ //MIENTRAS TEMP.SIGUIENTE es !=null vamos a mover
                temp= temp.getSiguiente(); //mover a temp al siguiente nodo
            }
            temp.setSiguiente(nuevo);// conectamos al final de la lista  al nuevo nodo*/
           fin.setSiguiente(nuevo);
           fin=nuevo;
        }
        tama ++;
    }
    //imprimir lista
    public void prinList(){
        Nodo temp = Inicio; //aqui empezamos
        //WHILE
        while (temp !=null){//Mientras temp != null nos vamos a mover
            System.out.print(temp.getDato() + "-");
            temp= temp.getSiguiente(); //mover a temp al siguiente nodo
        }
        System.out.println("");
    }
    public void clear(){ //borramos todos los nodos de la lista
        Inicio = null;
        fin = null;
        tama= 0;
    }
    //CONTAR LOS NODOS
    public int length(){ //o (N)
       /* int iCont = 0;
        Nodo temp = Inicio;//aqui empezamos
        //While
        while (temp !=null){//Mientras temp != null nos vamos a mover
            iCont ++;
            temp= temp.getSiguiente(); //mover a temp al siguiente nodo
        }
        return iCont;*/
       return tama;
    }
    //LA LISTA ESTA VACIA : TRUE, CON NODOS; FALSE
    public boolean isEmpty(){
        if (Inicio == null) 
            return true;
        else
           return false;
    }
    
    //RECUPERAR UN VALOR DE LA LISTA
    public int get(int pos) throws Exception{
        //VERIFICACION
        if (isEmpty()) { //LISTA ESTE VACIA
            throw new Exception("no hay valores almacenados en la lista¡¡");
        }else{ //POSICION QUE NO EXISTA: POSICION NEGATIVA O QUE NOS PASEMOS
         //pos tiene que estar entre o y n-1
         if((pos < 0) || (pos >= length())) //si pos es menos a cero o pos es mayor o igual a N
         throw new Exception("El valor " + pos + "no es una posicion valida en la lista ");
        }
        Nodo temp = Inicio;
        for (int i = 0; i < pos; i++) {
           temp= temp.getSiguiente(); //Mover a temp al siguiente nodo
        }
        return temp.getDato();
    }
    
    private void insertAtBeginnig ( Nodo nuevo){
        nuevo.setSiguiente(Inicio);
        Inicio = nuevo;
    }
    public void inserAt(int pos, int valor){
         Nodo nuevo = new Nodo(valor);
        //VALIDAR
        //SITUACIONES
        //INSERTAR AL INICIO
        if (pos == 0){
            insertAtBeginnig(nuevo);
        }
        else{//CUALQUIER OTRO CASO
             Nodo temp = Inicio;
        for (int i = 0; i < (pos -1 ); i++) {
           temp= temp.getSiguiente(); //Mover a temp al siguiente nodo
        }
        //FALTA RECONECTAR
        //Primero conectamos el nuevo nodo
        nuevo.setSiguiente(temp.getSiguiente());
        //Conectamos la Lista al nuevo nodo
        temp.setSiguiente(nuevo);
        }
        tama++;
    }
     public void deleteAt(int pos){
         int iTamaLista = length(); //obtengo el tamaño de la lista
        //VALIDAR
        if(iTamaLista == 1){
            clear();
        }else{
        //SITUACIONES
        if (pos == 0){ //Borrar un nodo al inicio
            Inicio = Inicio.getSiguiente();
        }
        else{//CUALQUIER OTRO CASO
             Nodo temp = Inicio;
        for (int i = 0; i < (pos -1 ); i++) {
           temp= temp.getSiguiente(); //Mover a temp al siguiente nodo
        }
        //FALTA RECONECTAR
        temp.setSiguiente(temp.getSiguiente().getSiguiente());
        if(pos ==(iTamaLista - 1)) //Verifico si es el ultimo nodo de la lista
            fin = temp;
        }
        tama--;
     }
     }
}
  