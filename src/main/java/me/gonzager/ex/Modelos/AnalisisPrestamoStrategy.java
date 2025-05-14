package me.gonzager.ex.Modelos;

public abstract class AnalisisPrestamoStrategy {

    private Libro libro;

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public abstract Boolean puedePrestarse(Socio socio);
    
}
