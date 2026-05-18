package principal;

import tadCola.ColaVacia;
import tadCola.TadCola;

public class principalCola {
    public static void main(String[] args) {
        TadCola<String> cola = new TadCola<>("miCola");
        int tamanio = 0;
        cola.encolar("xd");
        cola.encolar("dx");
        cola.encolar("df");
        cola.imprimirCola();
        tamanio = cola.numElemCola();
        System.out.println("El tamanio de la cola es: " + tamanio);
        cola.invertirCola();
        cola.imprimirCola();

        try {
            cola.desencolar();
        } catch (ColaVacia e) {
            throw new RuntimeException(e);
        }

        cola.imprimirCola();


    }
}
