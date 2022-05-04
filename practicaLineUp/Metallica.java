public class Metallica extends BandaMusica implements MetallicaCanciones {
    public Metallica(String nombre, String generoMusical) {
        super(nombre, generoMusical);
    }

    @Override
    public void presentacion(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out(showMessage(), "Helvetica", 24, Colors.black);
        screen.showImage("metallica_img.jpg");
    }

    @Override
    public void nothingElseM(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out("Cantando Nothing Else Matters\n\n", "Helvetica", 20, Colors.black);
        screen.showImage("metallica_img.jpg");
    }

    @Override
    public void one(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out("Cantando One\n\n", "Helvetica", 20, Colors.black);
        screen.showImage("metallica_img.jpg");
    }

    @Override
    public void theUnforgiv(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out("Cantando The Unforgiven\n\n", "Helvetica", 20, Colors.black);
        screen.showImage("metallica_img.jpg");
    }
}
