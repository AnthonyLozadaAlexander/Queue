package tadCola;

public class TadCola<T> implements Cola<T> {

    private NodoCola<T> principio;
    private NodoCola<T> fin;
    private String nombre;

    public TadCola(){
        principio = null;
        fin = null;
    }

    public TadCola(String nombre){
        super();
        principio = null;
        fin = null;
        this.nombre = nombre;
    }
    @Override
    public void encolar(T dato) {

    }

    @Override
    public T desencolar() {
        return null;
    }

    @Override
    public void decapitar() {

    }

    @Override
    public void imprimirCola() {

    }

    @Override
    public int numElemCola() {
        return 0;
    }

    @Override
    public void invertirCola() {

    }

    @Override
    public String getNombre() {
        return "";
    }

    @Override
    public void mostrarEstadoCola() {

    }

    @Override
    public void eliminarCola() {

    }

    @Override
    public boolean colaVacia() {
        return false;
    }
}
