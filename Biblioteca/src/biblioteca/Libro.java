
package biblioteca;

public class Libro {

    private String titulo;
    private Autor autor;
    private int anio;
    private boolean fav;

    public Libro(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }

    @Override
    public String toString() {
        return "\nTitulo:" + titulo + "\nAño:" + anio + "\n";

    }

}
