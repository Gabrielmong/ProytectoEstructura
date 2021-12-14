package proytectoestructura;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Estructuras e = new Estructuras();
        int opc = 1;
        
        while (opc !=0){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "", "Central de buses", 1));
            switch (opc){
                case 1:
                    e.agregarCola();
                    e.mostrarCola();
                    e.desencolar();
                    break;
                case 2:
                    e.agregarLDC();
                    e.mostrarLDC();
                    e.quitarLDC();
                    break;
                case 3: 
                    e.agregarLDS();
                    e.mostrarLDS();
                    e.quitarLDS();
                    break;
                case 4:
                    e.agregarLS();
                    e.mostrarLS();
                    e.quitarLS();
                    break;
                case 5:
                    e.agregarLSC();
                    e.mostrarLSC();
                    e.quitarLSC();
                    break;
                case 6:
                    e.agregarPila();
                    e.mostrarPila();
                    e.quitarPila();
                case 7:
                    formulario f = new formulario();
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);
                    f.setTitle("Formulario");
                default:
                    break;
            }
        
        
        
        }
    }
    
}
