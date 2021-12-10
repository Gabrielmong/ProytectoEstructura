package proytectoestructura;

public class NodoLDS {

    private Dato elemento;
    private NodoLDS siguiente;
    private NodoLDS anterior;

    public NodoLDS() {
        this.siguiente = null;
        this.anterior = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoLDS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLDS siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLDS getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLDS anterior) {
        this.anterior = anterior;
    }

}
