public class Nirvana extends BandaMusica implements NirvanaCanciones{
    public Nirvana(String nombre, String generoMusical) {
        super(nombre, generoMusical);
    }

    @Override
    public void presentacion(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out(showMessage(), "Helvetica", 24, Colors.black);
        screen.showImage("nirvana_img.jpg");
    }

    @Override
    public void smellLikeTeenS(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out("Cantando Smell Like Teen Spirit\n\n", "Helvetica", 20, Colors.black);
        screen.showImage("nirvana_img.jpg");
    }

    @Override
    public void comeAsYouA(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out("Cantando Come as You Are\n\n", "Helvetica", 20, Colors.black);
        screen.showImage("nirvana_img.jpg");
    }

    @Override
    public void theManWhoSoldTheW(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out("Cantando The Man Who Sold The World\n\n", "Helvetica", 20, Colors.black);
        screen.showImage("nirvana_img.jpg");
    }
}
