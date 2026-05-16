package tadCola;

public interface Cola <T>{

    void encolar(T dato);
    T desencolar();
    void decapitar();
    void imprimirCola();
    int numElemCola();
    void invertirCola();
    String getNombre();
    void mostrarEstadoCola();
    void eliminarCola();
    boolean colaVacia();

}
