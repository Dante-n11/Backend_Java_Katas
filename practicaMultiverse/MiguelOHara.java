package practicaMultiverse;

public class MiguelOHara extends Spiderman implements MiguelOHaraHabYPod {

    public MiguelOHara(String comic, String tierraOrigen, String nombre) {
        super(comic, tierraOrigen, nombre);
    }

    @Override
    public void fuerzaSobreHumana() {
        System.out.println("Habilidad de fuerza sobre humana");
    }

    @Override
    public void reflejosSobreHumanos() {
        System.out.println("Habilidad de reflejos sobre humanos");
    }

    @Override
    public void visionAcelerada() {
        System.out.println("Habilidad de visión acelerada");
    }

    @Override
    public void telarañaOrganica() {
        System.out.println("Poder telaraña orgánica");
    }

    @Override
    public void señueloAcelerado() {
        System.out.println("Habilidad de señuelo acelerado");
    }
}
