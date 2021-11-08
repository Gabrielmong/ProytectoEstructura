package proytectoestructura;

public class Estacion {

    private int numEstacion;
    private String Rutas;
    private int costoRuta;
    private String nomEstacion;
    private String horario;

    public Estacion() {
        this.numEstacion = 0;
        this.Rutas = "";
        this.costoRuta = 0;
        this.nomEstacion = "";
        this.horario = "";
    }

    public int getNumEstacion() {
        return numEstacion;
    }

    public void setNumEstacion(int numEstacion) {
        this.numEstacion = numEstacion;
    }

    public String getRutas() {
        return Rutas;
    }

    public void setRutas(String Rutas) {
        this.Rutas = Rutas;
    }

    public int getCostoRuta() {
        return costoRuta;
    }

    public void setCostoRuta(int costoRuta) {
        this.costoRuta = costoRuta;
    }

    public String getNomEstacion() {
        return nomEstacion;
    }

    public void setNomEstacion(String nomEstacion) {
        this.nomEstacion = nomEstacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
