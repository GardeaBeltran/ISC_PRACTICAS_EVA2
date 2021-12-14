/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_tipos_datos_genericos;

/**
 *
 * @author Ximena Hernandez
 */
public class EVA2_13_TIPOS_DATOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba<Integer> prueba = new Prueba();
        prueba.setValor(100);
        System.out.println(prueba.getValor());
        System.out.println(prueba);
    }
    
}

class Prueba<T>{ //TEMPLAY---> PLANTILLA
    private T Valor;

    public Prueba() {
       
    }

    public Prueba(T Valor) {
        this.Valor = Valor;
    }

    public T getValor() {
        return Valor;
    }

    public void setValor(T Valor) {
        this.Valor = Valor;
    }
     
    

}
