package practicaMultiverse;

public class PeterParker extends Spiderman implements PeterParkerHabYPod {

    public PeterParker(String comic, String tierraOrigen, String nombre){
        super(comic, tierraOrigen, nombre);
    }

    @Override
    public void fuerzaSobreHumana() {
        System.out.println("Habilidad de fuerza sobre humana");
    }

    @Override
    public void habilidadCombativa() {
        System.out.println("Habilidad combativa");
    }

    @Override
    public void velocidadSobreHumana() {
        System.out.println("Habilidad de velocidad sobre humana");
    }

    @Override
    public void treparMuros() {
        System.out.println("Habilidad de trepar muros");
    }

    @Override
    public void sentidoAracnido() {
        System.out.println("Habilidad de sentido arácnido");
    }
}
