package proytectoestructura;
public class NodoC {
    private Pasajero Pasajero;
    private NodoC siguiente;

    public NodoC() {
        this.siguiente = null;
    }
    
    public NodoC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }

    public Pasajero getPasajero() {
        return Pasajero;
    }

    public void setPasajero(Pasajero Pasajero) {
        this.Pasajero = Pasajero;
    }
}
