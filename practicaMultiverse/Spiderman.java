package practicaMultiverse;

public class Spiderman {
    private String comic;
    private String tierraOrigen;
    private String nombre;

    public Spiderman(String comic, String tierraOrigen, String nombre) {
        this.comic = comic;
        this.tierraOrigen = tierraOrigen;
        this.nombre = nombre;
    }

    public String getComic() { return comic; }
    public String getTierraOrigenc() { return tierraOrigen; }
    public String getNombe() { return nombre; }

    public boolean setComic(String comic) {
        if (!comic.isEmpty()) {
            this.comic = comic;
            return true;
        } else
            return false;
    }

    public boolean setTierraOrigen(String tierraOrigen) {
        if (!tierraOrigen.isEmpty()) {
            this.tierraOrigen = tierraOrigen;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public void showMessage() {
        System.out.println(
                "\n\nComic: " + comic +
                        "\nTierra origen: " + tierraOrigen +
                        "\nNombre: " + nombre+"\n"
        );
    }
}
