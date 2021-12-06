package proytectoestructura;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Estructuras e = new Estructuras();
        int opc = 1;
        
        while (opc !=0){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar a Cola 2. Eliminar Elemento de cola 3.Ver cola"));
            switch (opc){
                case 1:
                    e.agregar();
                    break;
                case 2:
                    e.desencolar();
                    break;
                case 3: 
                    e.mostrarCola();
                    break;
                default:
                    break;
            }
        
        
        
        }
    }
    
}
