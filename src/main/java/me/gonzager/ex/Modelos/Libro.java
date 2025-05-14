package me.gonzager.ex.Modelos;

public class Libro {

    private String nombre;
    private AnalisisPrestamoStrategy analizadorPrestamo;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    //Me pasan la politica que va a decidir si me puedo prestar o no.
    public void setAnalizadorPrestamosStrategy(AnalisisPrestamoStrategy analizadorPrestamo) {
        this.analizadorPrestamo = analizadorPrestamo;
        analizadorPrestamo.setLibro(this);
    }


    //Me preguntan si me puedo prestar o no a un determinado socio.
    public Boolean puedePrestarse(Socio socio) {
        return this.analizadorPrestamo.puedePrestarse(socio);
    }


    //Recupera el nombre del Libro.
    public String getNombre() {
        return nombre;
    }

}
