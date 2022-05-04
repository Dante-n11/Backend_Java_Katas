import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        concierto();
    }

    private static void concierto() {
        Screen screen = new Screen();
        ArrayList<Thread> bandas;
        ArrayList<Integer> ordenLista;

        bandas = asignarBandas(screen);
        int bandera = 0, bandaInicio = 0;
        String nombreBandas = getNombreBandas(bandas), respuesta = "";

        do {
            respuesta = JOptionPane.showInputDialog(nombreBandas + "\nIngresa el número de la banda que quieres que inicie             \n(las demás tendrán un orden aleaorio)\n\n");
            if (compruebaRespuesta(respuesta)) {
                bandaInicio = Integer.parseInt(respuesta);
                if (bandaInicio > 0 && bandaInicio <= bandas.size())
                    bandera = 1;
            } else
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
        } while (bandera == 0);

        ordenLista = crearLista(bandaInicio, bandas);
        empezarConcierto(bandas, ordenLista, screen);
    }

    private static boolean compruebaRespuesta(String respuesta) {
        if (respuesta != null) {
            respuesta = respuesta.trim();
            if (respuesta.matches("-?\\d+"))
                return true;
            else
                return false;
        } else
            return false;
    }

    private static ArrayList<Thread> asignarBandas(Screen screen) {
        ArrayList<Thread> bandas = new ArrayList<>();

        ACDC acdc = new ACDC("AC/DC", "Hard Rock");
        Runnable cancionesACDC = new Runnable() {
            @Override
            public void run() {
                try {
                    acdc.presentacion(screen);
                    Thread.sleep(4000);

                    acdc.highWayToH(screen);
                    Thread.sleep(4000);

                    acdc.thunderstruck(screen);
                    Thread.sleep(4000);

                    acdc.backInB(screen);
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread bandaACDC = new Thread(cancionesACDC);
        bandaACDC.setName("ACDC");
        bandas.add(bandaACDC);

        Metallica metallica = new Metallica("Metallica", "Heavy metal");
        Runnable cancionesMetallica = new Runnable() {
            @Override
            public void run() {
                try {
                    metallica.presentacion(screen);
                    Thread.sleep(4000);

                    metallica.nothingElseM(screen);
                    Thread.sleep(3000);

                    metallica.one(screen);
                    Thread.sleep(3000);

                    metallica.theUnforgiv(screen);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread bandaMetallica = new Thread(cancionesMetallica);
        bandaMetallica.setName("Metallica");
        bandas.add(bandaMetallica);

        Nirvana nirvana = new Nirvana("Nirvana", "Rock alternativo");
        Runnable cancionesNirvana = new Runnable() {
            @Override
            public void run() {
                try {
                    nirvana.presentacion(screen);
                    Thread.sleep(4000);

                    nirvana.smellLikeTeenS(screen);
                    Thread.sleep(3000);

                    nirvana.comeAsYouA(screen);
                    Thread.sleep(3000);

                    nirvana.theManWhoSoldTheW(screen);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread bandaNirvana = new Thread(cancionesNirvana);
        bandaNirvana.setName("Nirvana");
        bandas.add(bandaNirvana);

        return bandas;
    }

    private static String getNombreBandas(ArrayList<Thread> bandas) {
        String nombreBandas = "";
        nombreBandas += "Lista de bandas\n";
        for (int i = 0; i < bandas.size(); i++) {
            nombreBandas += "    " + (i + 1) + ". " + bandas.get(i).getName() + "\n";
        }
        return nombreBandas;
    }

    private static ArrayList<Integer> crearLista(int bandaInicio, ArrayList<Thread> bandas) {
        ArrayList<Integer> listaDisponibles = new ArrayList<>();
        ArrayList<Integer> listaFinal = new ArrayList<>();

        for (int i = 0; i < bandas.size(); i++) {
            listaDisponibles.add(i);
        }

        listaFinal.add(bandaInicio - 1);
        listaDisponibles.remove(bandaInicio - 1);

        while (!listaDisponibles.isEmpty()) {
            int pos = (int) (Math.random() * listaDisponibles.size());
            listaFinal.add(listaDisponibles.get(pos));
            listaDisponibles.remove(pos);
        }

        return listaFinal;
    }

    private static void empezarConcierto(ArrayList<Thread> bandas, ArrayList<Integer> ordenLista, Screen screen) {
        try {
            screen.setVisible(true);
            screen.out("¡El concierto ha iniciado!\n\n", "Helvetica", 32, Colors.black);
            screen.showImage("concierto_img.jpg");
            screen.setBounds(369, 109, 628, 550);
            Thread.sleep(5000);

            for (int i = 0; i < bandas.size(); i++) {
                bandas.get(ordenLista.get(i)).start();
                bandas.get(ordenLista.get(i)).join();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}