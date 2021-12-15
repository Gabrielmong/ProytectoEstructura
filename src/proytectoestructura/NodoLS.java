package proytectoestructura;

public class NodoLS {

    private Conductor datos;
    private NodoLS siguiente;

    public NodoLS() {
        this.siguiente = null;
    }

    public Conductor getDatos() {
        return datos;
    }

    public void setDatos(Conductor datos) {
        this.datos = datos;
    }

    

    public NodoLS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
    }

}
