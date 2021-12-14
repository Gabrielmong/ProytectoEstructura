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
    public void agregarCola() {   // Cola
        Pasajero p = new Pasajero();
        NodoCola nc = new NodoCola();
        p.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Número de cédula: ")));
        p.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: ")));
        p.setNombre(JOptionPane.showInputDialog(null, "Nombre del pasajero: "));
        int tempop = 1;
        while (tempop != 0) {
            int temp = Integer.parseInt(JOptionPane.showInputDialog(null, "Está Vacunado? \n1. Sí   2. No"));
            switch (temp) {
                case 1:
                    p.setVacunado(Boolean.TRUE);
                    tempop = 0;
                    break;
                case 2:
                    p.setVacunado(Boolean.FALSE);
                    tempop = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido");
                    break;
            }
        }
        nc.setPasajero(p);
        if (ColaEsVacía()) {
            inicioC = nc;
            finC = nc;
        } else {
            finC.setSiguiente(nc);
            finC = nc;

        }
    }

    public void agregarLDC() {   //Lista Doble Circular
        Dato d = new Dato();

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
    public void mostrarCola() {    //Cola
        if (!ColaEsVacía()) {
            String s = "";
            NodoCola aux = inicioC;
            while (aux != null) {
                s = s + aux.getPasajero().getNombre() + aux.getPasajero().getEdad() + " " + "<--";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar.");
        }
    }

    public void mostrarLDC() {   //Lista Doble Circular
        if (!LDCEsVacía()) {
            String s = "";
            NodoLDC aux = inicioLDC;
            while (aux != null) {
                s = s + aux.getElemento();
            }
            JOptionPane.showMessageDialog(null, s);
        }
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
