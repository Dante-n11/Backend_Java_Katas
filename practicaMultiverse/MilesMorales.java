package practicaMultiverse;

public class MilesMorales extends Spiderman implements MilesMoralesHabYPod {

    public MilesMorales(String comic, String tierraOrigen, String nombre) {
        super(comic, tierraOrigen, nombre);
    }

    @Override
    public void fuerzaSobreHumana() {
        System.out.println("Habilidad de fuerza sobre humana");
    }

    @Override
    public void resistenciaSobreHumana() {
        System.out.println("Habilidad de resistencia sobre humana");
    }

    @Override
    public void agilidadSobreHumana() {
        System.out.println("Habilidad de agilidad sobre humana");
    }

    @Override
    public void rayoVenenoso() {
        System.out.println("Poder rayo venenoso");
    }

    @Override
    public void explosionEnergia() {
        System.out.println("Poder explosión de energia");
    }
}
