package principio;

import tadCola.TadCola;

public class principalCola {
    public static void main(String[] args) {
        TadCola<String> cola = new TadCola<>("miCola");
        int tamanio = 0;
        cola.encolar("xd");
        cola.encolar("dx");
        cola.imprimirCola();
        tamanio = cola.numElemCola();
        System.out.println("El tamanio de la cola es: " + tamanio);


    }
}
