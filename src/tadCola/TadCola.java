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
        NodoCola<T> aux;
        aux = new NodoCola<>(dato, null);

        if(principio == null){
            principio = aux;
            fin = aux;
        }else{
            fin.siguiente = aux;
            fin = aux;
        }
    }

    @Override
    public T desencolar() throws ColaVacia {
        if(colaVacia()){
            throw new ColaVacia("Desencolar: la cola se encuentra vacia");
        }else{
            T resultado;
            resultado = principio.dato;
            principio = principio.siguiente;
            if(principio == null){
                fin = null;
            }
            return resultado;
        }
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
        return nombre;
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
