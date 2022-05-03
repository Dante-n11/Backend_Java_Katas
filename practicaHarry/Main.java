package practicaHarry;

public class Main {
    public static void main(String[] args) {
        testPersonaje();
    }

    private static void testPersonaje() {
        Personaje Harry = new Personaje("Harry Potter", "Masculino", "Gryffindor", "Dementor", "Ciervo");
        Harry.showMessage();

        Personaje Hermione = new Personaje("Hermione Granger", "Femenino", "Gryffindor", "Profesora McGonagall", "Nutria");
        Hermione.showMessage();

        Personaje Ron = new Personaje("Ronald Weasley", "Masculino", "Gryffindor", "Acromántula", "Jack Russel Terrier");
        Ron.showMessage();

        Personaje Neville = new Personaje("Neville Longbottom", "Masculino", "Gryffindor", "Profesora Severus Snape", "No corpóreo");
        Neville.showMessage();

        Personaje Severus = new Personaje("Severus Snape", "Masculino", "Slytherin", "Lord Voldemort", "Cierva");
        Severus.showMessage();
    }
}
