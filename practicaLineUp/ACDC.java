import java.awt.*;

public class ACDC extends BandaMusica implements ACDCCanciones{
    public ACDC(String nombre, String generoMusical){
        super(nombre, generoMusical);
    }

    @Override
    public void presentacion(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out(showMessage(), "Helvetica", 24, Colors.black);
        screen.showImage("acdc_img.jpg");
    }

    @Override
    public void highWayToH(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out("Cantando High Way to Hell\n\n", "Helvetica", 20, Colors.black);
        screen.showImage("acdc_img.jpg");
    }

    @Override
    public void thunderstruck(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out("Cantando Thunderstruck\n\n", "Helvetica", 20, Colors.black);
        screen.showImage("acdc_img.jpg");
    }

    @Override
    public void backInB(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out("Cantando Back In Black\n\n", "Helvetica", 20, Colors.black);
        screen.showImage("acdc_img.jpg");
    }
}