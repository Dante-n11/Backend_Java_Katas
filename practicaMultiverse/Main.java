package practicaMultiverse;

public class Main {
    public static void main(String[] args) {
        testPeterParker();
        testMilesMorales();
        testMiguelOHara();
    }

    private static void testPeterParker() {
        PeterParker peter = new PeterParker("Amazing Fantasy #15 (1963)", "Tierra 616", "Peter Parker");
        peter.showMessage();

        Runnable habilidadesPP = new Runnable() {
            @Override
            public void run() {
                try {
                    peter.fuerzaSobreHumana();
                    Thread.sleep(500);

                    peter.habilidadCombativa();
                    Thread.sleep(500);

                    peter.velocidadSobreHumana();
                    Thread.sleep(500);

                    peter.treparMuros();
                    Thread.sleep(500);

                    peter.sentidoAracnido();
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };

        Thread habilidadesPeterP = new Thread(habilidadesPP);
        habilidadesPeterP.start();

        try{
            habilidadesPeterP.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    private static void testMilesMorales(){
        MilesMorales milesM = new MilesMorales("Ultimate Comics Fallout #4", "Tierra 1610", "Miles Morales");
        milesM.showMessage();

        Runnable habilidadesMM = new Runnable() {
            @Override
            public void run() {
                try{
                    milesM.fuerzaSobreHumana();
                    Thread.sleep(500);

                    milesM.resistenciaSobreHumana();
                    Thread.sleep(500);

                    milesM.agilidadSobreHumana();
                    Thread.sleep(500);

                    milesM.rayoVenenoso();
                    Thread.sleep(500);

                    milesM.explosionEnergia();
                    Thread.sleep(500);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread habilidadesMilesM = new Thread(habilidadesMM);
        habilidadesMilesM.start();

        try{
            habilidadesMilesM.join();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    private static void testMiguelOHara(){
        MiguelOHara miguelOH = new MiguelOHara("Amazing Spider-Man #365", "Tierra 928", "Miguel O'Hara");
        miguelOH.showMessage();

        Runnable habilidadesMOH = new Runnable() {
            @Override
            public void run() {
                try{
                    miguelOH.fuerzaSobreHumana();
                    Thread.sleep(500);

                    miguelOH.reflejosSobreHumanos();
                    Thread.sleep(500);

                    miguelOH.visionAcelerada();
                    Thread.sleep(500);

                    miguelOH.telarañaOrganica();
                    Thread.sleep(500);

                    miguelOH.señueloAcelerado();
                    Thread.sleep(500);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread habilidadesMiguelOH = new Thread(habilidadesMOH);
        habilidadesMiguelOH.start();
    }
}
