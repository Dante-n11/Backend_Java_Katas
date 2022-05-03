package practicaMona;

public class Main {
    public static void main(String[] args) {
        Octocat bombero = new Sentrytocat("Sentrytocat", "Bombero", "Traje de bombero");
        bombero.showMessage();
        bombero.realizarActividad();

        Octocat buzo = new Scubatocat("Scubatocat", "Buzo", "Traje de buceo");
        buzo.showMessage();
        buzo.realizarActividad();

        Octocat dj = new Catstello("Catstello", "DJ", "Ropa estilo urbano");
        dj.showMessage();
        dj.realizarActividad();

        Octocat directorCine = new Filmtocat("Filmtocat", "Director de cine", "Ropa casual");
        directorCine.showMessage();
        directorCine.realizarActividad();

        Octocat luchador = new Luchadortocat("Luchadortocat", "Luchador", "Ropa de lucha libre");
        luchador.showMessage();
        luchador.realizarActividad();

        Octocat cientifico = new Labtocat("Labtocat", "Científico", "Bata de laboratorio");
        cientifico.showMessage();
        cientifico.realizarActividad();
    }
}
