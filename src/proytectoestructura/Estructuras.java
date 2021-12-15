package proytectoestructura;

import javax.swing.JOptionPane;

public class Estructuras {

    private NodoCola inicioC;
    private NodoCola finC;
    private NodoLDC inicioLDC;
    private NodoLDC finLDC;
    private NodoLDS inicioLDS;
    private NodoLDS finLDS;
    private NodoLS inicioLS;
    private NodoLS finLS;
    private NodoLSC inicioLSC;
    private NodoLSC finLSC;
    private NodoPila Top;

    public Estructuras() {
        this.inicioC = null;
        this.finC = null;
        this.inicioLDC = null;
        this.finLDC = null;
        this.inicioLDS = null;
        this.finLDS = null;
        this.inicioLS = null;
        this.finLS = null;
        this.inicioLSC = null;
        this.finLSC = null;
        this.Top = null;
    }

    /*
            Métodos booleanos
     */
    public boolean ColaEsVacía() {
        return inicioC == null;
    }

    public boolean LDCEsVacía() {
        return inicioLDC == null;
    }

    public boolean LDSEsVacía() {
        return inicioLDS == null;
    }

    public boolean LSEsVacía() {
        return inicioLS == null;
    }

    public boolean LSCEsVacía() {
        return inicioLSC == null;
    }

    public boolean PilaEsVacía() {
        return Top == null;
    }

    /* 
            Métodos para agregar a las estructuras
     */
    public void agregarCola(String Nombre, int Cedula, int edad, boolean vacuna) {   // Cola
        Pasajero p = new Pasajero();
        NodoCola nc = new NodoCola();
        p.setCedula(Cedula);
        p.setEdad(edad);
        p.setNombre(Nombre);
        p.setVacunado(vacuna);
        nc.setPasajero(p);
        if (ColaEsVacía()) {
            inicioC = nc;
            finC = nc;
        } else {
            finC.setSiguiente(nc);
            finC = nc;

        }
    }

    public void agregarLDC(Pasajero p, int fac, String ruta) {   //Lista Doble Circular
        Dato d = new Dato();
        d.setNumFac(fac);
        d.setPasajero(p);
        d.setRuta(ruta);
        NodoLDC nLDC = new NodoLDC();
        nLDC.setElemento(d);
        if (LDCEsVacía()) {
            inicioLDC = nLDC;
            finLDC = nLDC;
            finLDC.setSiguiente(inicioLDC);
            inicioLDC.setAnterior(finLDC);
        } else if (d.getNumFac() > finLDC.getElemento().getNumFac()) {
            finLDC.setSiguiente(nLDC);
            finLDC = finLDC.getSiguiente();
            finLDC.setSiguiente(inicioLDC);
            inicioLDC.setAnterior(finLDC);

        } else {
            NodoLDC aux = inicioLDC;
            while (aux.getSiguiente().getElemento().getNumFac() < d.getNumFac()) {
                aux = aux.getSiguiente();
            }
            nLDC.setSiguiente(aux.getSiguiente());
            nLDC.setAnterior(aux);
            aux.setSiguiente(nLDC);
            nLDC.getSiguiente().setAnterior(nLDC);
        }
    }

    public void agregarLDS(String color, String estilo, int pasajeros, String placa, String trans) {  // Lista Doble Simple   ***No estoy totalmente seguro me duele la cabeza xd
        Bus b = new Bus();
        b.setColor(color);
        b.setEstilo(estilo);
        b.setPasajeros(pasajeros);
        b.setPlaca(placa);
        b.setTrans(trans);
        NodoLDS nLDS = new NodoLDS();
        nLDS.setElemento(b);
        if (LDSEsVacía()) {
            inicioLDS = nLDS;
            finLDS = nLDS;
        } else if (b.getPasajeros()>=finLDS.getElemento().getPasajeros()) {
            finLDS.setSiguiente(nLDS);
            finLDS = finLDS.getSiguiente();
            
        } else {
            NodoLDS aux = inicioLDS;

            nLDS.setAnterior(aux);
            aux.setSiguiente(nLDS);
        }
    }

    public void agregarLS() {    //Lista Simple
        Dato d = new Dato();

        NodoLS nLS = new NodoLS();
        if (LSEsVacía()) {
            inicioLS = nLS;
        } else {
            NodoLS aux = inicioLS;
            nLS.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nLS);
        }
    }

    public void agregarLSC() {   //Lista Simple Circular
        Dato d = new Dato();

        NodoLSC nLSC = new NodoLSC();
        if (LSCEsVacía()) {
            inicioLSC = nLSC;
            finLSC = nLSC;
            finLSC.setSiguiente(inicioLSC);
        } else {
            NodoLSC aux = inicioLSC;
            nLSC.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nLSC);
        }
    }

    public void agregarPila(String color, String placa, String trans) {  //Pila
        Bus bus = new Bus();
        bus.setColor(color);
        bus.setPlaca(placa);
        bus.setTrans(trans);
        bus.setEstilo("");
        bus.setPasajeros(0);
        NodoPila nP = new NodoPila();
        nP.setDato(bus);
        if (PilaEsVacía()) {
            Top = nP;
        } else {
            nP.setNext(Top);
            Top = nP;
        }
    }

    /*
            Métodos para eliminar un elemento de las estructuras
     */
    public void desencolar() {  //Cola
        if (!ColaEsVacía()) {
            inicioC = inicioC.getSiguiente();
            JOptionPane.showMessageDialog(null, "El elemento de extraído");
        } else {
            JOptionPane.showMessageDialog(null, "Cola vacía, no se puede extraer");
        }
    }

    public void quitarLDC() {   //Lista Doble Circular
        if (LDCEsVacía()) {
            inicioLDC = inicioLDC.getSiguiente();
            finLDC.setSiguiente(inicioLDC);
        }
    }

    public void quitarLDS() {   //Lista Doble Simple
        if (LSEsVacía()) {
            inicioLS = inicioLS.getSiguiente();
        }
    }

    public void quitarLS() {   //Lista Simple
        if (LSCEsVacía()) {
            inicioLS = inicioLS.getSiguiente();
        }
    }

    public void quitarLSC() {   //Lista Simple Circular
        if (LSCEsVacía()) {
            inicioLSC = inicioLSC.getSiguiente();
            finLSC.setSiguiente(inicioLSC);
        }
    }

    public void quitarPila() {   //Pila
        if (!PilaEsVacía()) {
            Top = Top.getNext();
        }
    }


    /*
            Métodos para mostrar las estructuras
     */
    public String mostrarCola() {    //Cola
        String out = "";
        if (!ColaEsVacía()) {
            String s = "";
            NodoCola aux = inicioC;
            while (aux != null) {
                s = s + aux.getPasajero().getNombre() + " " + aux.getPasajero().getEdad() + " " + ", Vacunado: " + aux.getPasajero().getVacunado() + "\n";
                aux = aux.getSiguiente();
            }
            out = s;
        } else {
            out = "No hay registros.";
        }
        return out;
    }

    public String mostrarLDC() {   //Lista Doble Circular
        String s = "";
        if (!LDCEsVacía()) {
            NodoLDC aux = inicioLDC;
            s = s + aux.getElemento().getPasajero().getNombre() + " " + aux.getElemento().getPasajero().getCedula() + ", Vacunado: " + aux.getElemento().getPasajero().getVacunado() + "\n"
                    + "Factura: " + aux.getElemento().getNumFac() + "\nRuta: " + aux.getElemento().getRuta() + "\n\n";
            aux = aux.getSiguiente();
            while (aux != inicioLDC) {
                s = s + aux.getElemento().getPasajero().getNombre() + "," + aux.getElemento().getPasajero().getCedula() + ", Vacunado: " + aux.getElemento().getPasajero().getVacunado() + "\n"
                        + "Factura: " + aux.getElemento().getNumFac() + "\nRuta: " + aux.getElemento().getRuta() + "\n\n";
                aux = aux.getSiguiente();
            }

        } else {
            s = "No hay registros";
        }
        return s;
    }

    public String mostrarLDS() {   //Lista Doble Simple
        String s = "";
        if (!LDSEsVacía()) {

            NodoLDS aux = inicioLDS;
            s = s + "Bus " + aux.getElemento().getColor() + ", Estilo: " + aux.getElemento().getEstilo() + ", Placa: " + aux.getElemento().getPlaca() + ", Transmisión " + aux.getElemento().getTrans() + ", PasajerosL " + aux.getElemento().getPasajeros() + "\n\n";
            aux = aux.getSiguiente();
            while (aux != null) {
                s = s + "Bus " + aux.getElemento().getColor() + ", Estilo: " + aux.getElemento().getEstilo() + ", Placa: " + aux.getElemento().getPlaca() + ", Transmisión " + aux.getElemento().getTrans() + ", PasajerosL " + aux.getElemento().getPasajeros() + "\n\n";
                aux = aux.getSiguiente();
            }

        } else {
            s = "No hay registros";
        }
        return s;
    }

    public void mostrarLS() {   //Lista Simple
        if (!LSEsVacía()) {
            String s = "";
            NodoLS aux = inicioLS;
            while (aux != null) {
                s = s + aux.getDatos();
            }
            JOptionPane.showMessageDialog(null, s);
        }
    }

    public void mostrarLSC() {   //Lista Simple Circular
        if (!LSCEsVacía()) {
            String s = "";
            NodoLSC aux = inicioLSC;
            while (aux != null) {
                s = s + aux.getDatos();
            }
            JOptionPane.showMessageDialog(null, s);
        }
    }

    public String mostrarPila() {   //Pila
        String s = "";
        if (!PilaEsVacía()) {
            NodoPila aux = Top;
            while (aux != null) {
                s = s + "-----------\n" + "Placa: " + aux.getDato().getPlaca() + "\nColor: " + aux.getDato().getColor() + "\nTransmision: " + aux.getDato().getTrans() + "\n\n";
                aux = aux.getNext();
            }
        }
        return s;
    }

    public String buscarplacaBus(String Placa) {
        String s = "";
        if (!LDSEsVacía()) {

            NodoLDS aux = inicioLDS;
            String temp = aux.getElemento().getPlaca();;
            if (Placa.equals(temp)) {
                s = aux.getElemento().getPlaca();
            }
            aux = aux.getSiguiente();
            while (aux != null) {
                temp = aux.getElemento().getPlaca();
                if (Placa.equals(temp)) {
                    s = aux.getElemento().getPlaca();
                }
                aux = aux.getSiguiente();
            }

        } else {
            s = "No hay registros";
        }
        return s;
    }

    public String buscarcolorbus(String placa) {
        String s = "";
        if (!LDSEsVacía()) {

            NodoLDS aux = inicioLDS;
            String temp = aux.getElemento().getPlaca();;
            if (placa.equals(temp)) {
                s = aux.getElemento().getColor();
            }
            aux = aux.getSiguiente();
            while (aux != null) {
                temp = aux.getElemento().getPlaca();
                if (placa.equals(temp)) {
                    s = aux.getElemento().getColor();
                }
                aux = aux.getSiguiente();
            }

        } else {
            s = "No hay registros";
        }
        return s;
    }

    public String buscartransbus(String placa) {
        String s = "";
        if (!LDSEsVacía()) {

            NodoLDS aux = inicioLDS;
            String temp = aux.getElemento().getPlaca();;
            if (placa.equals(temp)) {
                s = aux.getElemento().getTrans();
            }
            aux = aux.getSiguiente();
            while (aux != null) {
                temp = aux.getElemento().getPlaca();
                if (placa.equals(temp)) {
                    s = aux.getElemento().getTrans();
                }
                aux = aux.getSiguiente();
            }

        } else {
            s = "No hay registros";
        }
        return s;
    }
}
