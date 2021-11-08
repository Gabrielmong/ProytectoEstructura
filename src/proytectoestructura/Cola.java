/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proytectoestructura;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Cola {

    private NodoC inicio;
    private NodoC fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacía() {
        return inicio == null;
    }
    public void agregar() {
        Dato d = new Dato();
        NodoC nc = new NodoC();
        nc.setElemento(d);
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
            NodoC aux = inicio;
            while (aux != null) {
                s = s + " " + "--" + " " + "<--";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar.");
        }
    }
}
