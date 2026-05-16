package tadCola;

public class TadCola<T> implements Cola<T> {

    private NodoCola<T> principio; // puntero principio
    private NodoCola<T> fin; // puntero final
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
        NodoCola<T> aux;
        System.out.println("Cola: "+ this.nombre);
        aux = principio; // aux copia la cola principio (original)
        while(aux != null){
            System.out.print(aux.dato + " ");
            aux = aux.siguiente; // aux avanza al siguiente posicion de la Cola
        }

        System.out.println();

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
