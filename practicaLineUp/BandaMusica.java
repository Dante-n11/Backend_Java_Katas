public class BandaMusica {
    private String nombre;
    private String generoMusical;

    public BandaMusica(String nombre, String generoMusical) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setGeneroMusical(String generoMusical) {
        if (!generoMusical.isEmpty()) {
            this.generoMusical = generoMusical;
            return true;
        } else
            return false;
    }

    public String showMessage() {
        return (
                "Nombre de la banda: " + nombre +
                        "\nGénero musical: " + generoMusical + "\n\n"
        );
    }
}
