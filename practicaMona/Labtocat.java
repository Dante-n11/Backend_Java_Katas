package practicaMona;

public class Labtocat extends Octocat {
    Labtocat(String nombre, String ocupacion, String vestimenta) {
        super(nombre, ocupacion, vestimenta);
    }

    public void realizarActividad() {
        System.out.println("Realizando actividades de director de cientifico");
    }
}