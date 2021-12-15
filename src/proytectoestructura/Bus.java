package proytectoestructura;
public class Bus {
     private String trans;
     private String color;
     private String estilo;
     private String placa;
     private int pasajeros;

    public Bus() {
        this.trans = "";
        this.color = "";
        this.estilo = "";
        this.placa = "";
        this.pasajeros = 0;
    }

    public Bus(String trans, String color, String estilo, String placa, int pasajeros) {
        this.trans = trans;
        this.color = color;
        this.estilo = estilo;
        this.placa = placa;
        this.pasajeros = pasajeros;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
     
}
