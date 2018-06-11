
package biblioteca;

import java.util.Objects;

public class Autor {

    private String nombre;
    private String pais;
    private Libro [] libro;
    static int c;
    static int c3;
    static int [] list_fav = new int [10];
    static boolean favorito ;
    static int i =0;

    public Autor(String nombre, String pais, Libro[] libro) {
        this.nombre = nombre;
        this.pais = pais;
        this.libro = libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Libro[] getLibro() {
        return libro;
    }

    public void setLibro(Libro[] libro) {
        this.libro = libro;
    }





    @Override
    public String toString() {
        String b="\nNombre: " + this.nombre + "\nPais: " + this.pais + "\n";

        if(favorito==true ){
        
            b += "Libros del Autor " + this.nombre + "\n" +this.libro[c3];
        }else{
            b += "Libros del Autor " + this.nombre + "\n" + this.libro[list_fav[i]];
        }
        
        
        return b;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }






}

