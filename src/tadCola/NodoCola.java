package tadCola;

public class NodoCola<T> {
    T dato;
    NodoCola<T> siguiente;

    public NodoCola(T dato, NodoCola<T> siguiente){
        this.dato = dato;
        this.siguiente = null;
    }
}
