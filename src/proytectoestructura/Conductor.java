package proytectoestructura;
public class Conductor {
    private String nombre;
    private int edad;
    private int cedula;
    private Boolean vacunado;

    public Conductor() {
        this.nombre = "";
        this.edad = 0;
        this.cedula = 0;
        this.vacunado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Boolean getVacunado() {
        return vacunado;
    }

    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }
    
    
    
}
