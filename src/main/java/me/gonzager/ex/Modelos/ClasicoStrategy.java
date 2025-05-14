package me.gonzager.ex.Modelos;

public class ClasicoStrategy extends AnalisisPrestamoDecorator{

    public ClasicoStrategy(AnalisisPrestamoStrategy decorado) {
        super(decorado);
    }

    @Override
    public Boolean condicionEspecifica(Socio socio) {
        return socio.esAntiguo();
    }

    
    
}
