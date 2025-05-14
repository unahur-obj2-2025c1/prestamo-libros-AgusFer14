package me.gonzager.ex.Modelos;

public class DefaultStrategy extends AnalisisPrestamoStrategy {

    @Override
    public Boolean puedePrestarse(Socio socio) {
        return true;
    }
    
}
