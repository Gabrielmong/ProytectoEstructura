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

    public void agregarLDC(Pasajero p, int fac , String ruta ) {   //Lista Doble Circular
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
        } else {
            NodoLDC aux = inicioLDC;
            nLDC.setSiguiente(aux.getSiguiente());
            nLDC.setAnterior(aux);
            aux.setSiguiente(nLDC);
            nLDC.getSiguiente().setAnterior(nLDC);
        }
    }

    public void agregarLDS() {  // Lista Doble Simple   ***No estoy totalmente seguro me duele la cabeza xd
        Dato d = new Dato();

        NodoLDS nLDS = new NodoLDS();
        nLDS.setElemento(d);
        if (LDCEsVacía()) {
            inicioLDS = nLDS;
            finLDS = nLDS;
        } else {
            NodoLDS aux = inicioLDS;
            nLDS.setSiguiente(aux.getSiguiente());
            nLDS.setAnterior(aux);
            aux.setSiguiente(nLDS);
            nLDS.getSiguiente().setAnterior(nLDS);
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

    public void agregarPila() {  //Pila
        Dato d = new Dato();

        NodoPila nP = new NodoPila();
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
        if (PilaEsVacía()) {
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
                s = s + aux.getPasajero().getNombre() +" "+ aux.getPasajero().getEdad() + " " +", Vacunado: "+aux.getPasajero().getVacunado() + "\n";
                aux = aux.getSiguiente();
            }
            out = s;
        } else {
            out = "No existen elementos para mostrar.";
        }
        return out;
    }

    public String mostrarLDC() {   //Lista Doble Circular
        String s = "";
        if (!LDCEsVacía()) {
            NodoLDC aux = inicioLDC;
            s = s + aux.getElemento().getPasajero().getNombre()+" "+aux.getElemento().getPasajero().getCedula()+", Vacunado: "+aux.getElemento().getPasajero().getVacunado()+"\n"+
                        "Factura: " +aux.getElemento().getNumFac()+ "\nRuta: "+aux.getElemento().getRuta() + "\n\n";
            aux = aux.getSiguiente();
            while (aux != inicioLDC) {
                s = s + aux.getElemento().getPasajero().getNombre()+","+aux.getElemento().getPasajero().getCedula()+", Vacunado: "+aux.getElemento().getPasajero().getVacunado()+"\n"+
                        "Factura: " +aux.getElemento().getNumFac()+ "\nRuta: "+aux.getElemento().getRuta();
                aux = aux.getSiguiente();
            }
            
        } else {
            s = "No hay registro";
        }
        return s;
    }

    public void mostrarLDS() {   //Lista Doble Simple
        if (!LDSEsVacía()) {
            String s = "";
            NodoLDS aux = inicioLDS;
            while (aux != null) {
                s = s + aux.getElemento();
            }
            JOptionPane.showMessageDialog(null, s);
        }
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

    public void mostrarPila() {   //Pilä
        if (!PilaEsVacía()) {
            String s = "";
            NodoPila aux = Top;
            while (aux != null) {
                s = s + aux.getDato();
            }
            JOptionPane.showMessageDialog(null, s);
        }
    }
}
