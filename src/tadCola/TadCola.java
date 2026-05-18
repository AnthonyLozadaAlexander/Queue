package tadCola;

public class TadCola<T> implements Cola<T> {

    private NodoCola<T> principio; // puntero principio
    private NodoCola<T> fin; // puntero final
    private String nombre;

    public TadCola() {
        principio = null;
        fin = null;
    }

    public TadCola(String nombre) {
        super();
        principio = null;
        fin = null;
        this.nombre = nombre;
    }

    @Override
    public void encolar(T dato) {
        NodoCola<T> aux;
        aux = new NodoCola<>(dato, null);

        if (principio == null) {
            principio = aux;
            fin = aux;
        } else {
            fin.siguiente = aux;
            fin = aux;
        }
    }

    @Override
    public T desencolar() throws ColaVacia {
        if (colaVacia()) {
            throw new ColaVacia("Desencolar: la cola se encuentra vacia");
        } else {
            T resultado; // guardar el resultado
            resultado = principio.dato; // principio.dato se refiere al primer elemento de la cola
            principio = principio.siguiente; // principio avanzara al siguiente elemento de la cola
            if (principio == null) { // si principio es igual a null
                fin = null; // puntero fin apunta al null
            }
            return resultado; // muestra el resultado desencolado de la cola
        }
    }

    @Override
    public void imprimirCola() {
        NodoCola<T> aux;
        System.out.println("Cola: " + this.nombre);
        aux = principio; // aux copia la cola principio (original)
        while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.siguiente; // aux avanza al siguiente posicion de la Cola
        }

        System.out.println();

    }

    @Override
    public int numElemCola() {
        boolean vacio = colaVacia();
        int count = 0;
        NodoCola<T> aux; // nodo Auxiliar

        aux = principio; // nodo Auxiliar toma la referencia del nodo Principio (original)
        while (aux != null) {
            count++;
            aux = aux.siguiente; // vector[i] = vector[i+1]

        }

        return count;
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
        System.out.println("Estado De La Cola:");
        System.out.println("Numero Elementos: " + this.numElemCola());
        if(!colaVacia()){
            System.out.println("Primer Elemento: " + " [Principio] -> " + principio.dato); // principio.dato es el elemento primero que esta conectado al puntero principio
            System.out.println("Ultimo Elemento: " + " [Fin] -> " + fin.dato); // fin.dato es el elemento final de la cola que esta conectado al puntero fin
        }

    }

    @Override
    public void eliminarCola() {
        principio = null; // desconectamos el nodo del principio
        fin = null; // desconectamos el nodo del final
    }

    @Override
    public boolean colaVacia() {
        return principio == null;
    }
}
