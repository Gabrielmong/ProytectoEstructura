package proytectoestructura;
public class Empresa {
    private int numEmpresa;
    private int numBuses;
    private int numChoferes;
    private int numrutas;

    public Empresa() {
        this.numEmpresa = 0;
        this.numBuses = 0;
        this.numChoferes = 0;
        this.numrutas = 0;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }

    public void setNumEmpresa(int numEmpresa) {
        this.numEmpresa = numEmpresa;
    }

    public int getNumBuses() {
        return numBuses;
    }

    public void setNumBuses(int numBuses) {
        this.numBuses = numBuses;
    }

    public int getNumChoferes() {
        return numChoferes;
    }

    public void setNumChoferes(int numChoferes) {
        this.numChoferes = numChoferes;
    }

    public int getNumrutas() {
        return numrutas;
    }

    public void setNumrutas(int numrutas) {
        this.numrutas = numrutas;
    }
}
