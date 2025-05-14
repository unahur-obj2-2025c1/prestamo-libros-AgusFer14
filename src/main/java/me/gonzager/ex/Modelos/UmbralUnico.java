package me.gonzager.ex.Modelos;

public class UmbralUnico extends AnalisisPrestamoDecorator{

    private static Double umbral = 0.0;

    
    public UmbralUnico(AnalisisPrestamoStrategy analizador) {
        super(analizador);
    }
    
    public static Double getUmbral() {
        return umbral;
    }

    public static void setUmbral(Double umbral) {
        UmbralUnico.umbral = umbral;
    }

    @Override
    public Boolean condicionEspecifica(Socio socio) {
        return socio.getDeuda() < umbral;
    }
    
}
