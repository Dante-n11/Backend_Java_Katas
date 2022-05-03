package practicaMona;

public class Filmtocat extends Octocat {
    Filmtocat(String nombre, String ocupacion, String vestimenta) {
        super(nombre, ocupacion, vestimenta);
    }

    public void realizarActividad() {
        System.out.println("Realizando actividades de director de cine");
    }
}
