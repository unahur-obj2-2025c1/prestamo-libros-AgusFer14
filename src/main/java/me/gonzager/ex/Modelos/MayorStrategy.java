package me.gonzager.ex.Modelos;

public class MayorStrategy extends AnalisisPrestamoDecorator{

    public MayorStrategy(AnalisisPrestamoStrategy decorado) {
        super(decorado);
    }

    @Override
    public Boolean condicionEspecifica(Socio socio) {
        return socio.esMayorDeEdad();
    }
    
}
