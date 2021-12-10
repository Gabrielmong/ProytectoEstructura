package proytectoestructura;

public class NodoLS {

    private Dato datos;
    private NodoLS siguiente;

    public NodoLS() {
        this.siguiente = null;
    }

    public Dato getDatos() {
        return datos;
    }

    public void setDatos(Dato datos) {
        this.datos = datos;
    }

    public NodoLS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
    }

}
