package proytectoestructura;

import javax.swing.JOptionPane;

public class Estructuras {

    private NodoCola inicio;
    private NodoCola fin;

    public Estructuras() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacía() {
        return inicio == null;
    }

    public void agregar() {
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
        if (esVacía()) {
            inicio = nc;
            fin = nc;
        } else {
            fin.setSiguiente(nc);
            fin = nc;

        }
    }

    public void desencolar() {
        if (!esVacía()) {
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "El elemento de extraído");
        } else {
            JOptionPane.showMessageDialog(null, "Cola vacía, no se puede extraer");
        }
    }

    public void mostrarCola() {
        if (!esVacía()) {
            String s = "";
            NodoCola aux = inicio;
            while (aux != null) {
                s = s + aux.getPasajero().getNombre() + aux.getPasajero().getEdad() + " " + "<--";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar.");
        }
    }
}
