package practicaMona;

public class Octocat {
    private String nombre;
    private String ocupacion;
    private String vestimenta;

    public Octocat(String nombre, String ocupacion, String vestimenta) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.vestimenta = vestimenta;
    }

    public String getNombre() { return nombre; }
    public String getOcupacion() { return ocupacion; }
    public String getTipoVestimenta() { return vestimenta; }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setOcupacion(String ocupacion) {
        if (!ocupacion.isEmpty()) {
            this.ocupacion = ocupacion;
            return true;
        } else
            return false;
    }

    public boolean setVestimenta(String vestimenta) {
        if (!vestimenta.isEmpty()) {
            this.vestimenta = vestimenta;
            return true;
        } else
            return false;
    }

    public void realizarActividad() {
        System.out.println("Realizando actividad");
    }

    public void showMessage() {
        System.out.println(
                "\nNombre: " + nombre +
                        "\nOcupacioón: " + ocupacion +
                        "\nVestimenta: " + vestimenta
        );
    }
}