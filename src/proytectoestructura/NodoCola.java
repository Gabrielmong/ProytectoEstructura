package proytectoestructura;
public class NodoCola {
    private Pasajero Pasajero;
    private NodoCola siguiente;

    public NodoCola() {
        this.siguiente = null;
    }
    
    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    public Pasajero getPasajero() {
        return Pasajero;
    }

    public void setPasajero(Pasajero Pasajero) {
        this.Pasajero = Pasajero;
    }
}
