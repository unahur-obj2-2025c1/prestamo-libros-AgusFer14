import java.beans.Transient;
import java.time.LocalDate;

import me.gonzager.ex.Modelos.DefaultStrategy;
import me.gonzager.ex.Modelos.Libro;
import me.gonzager.ex.Modelos.LibroConAnalizador;
import me.gonzager.ex.Modelos.SinDeudaStrategy;
import me.gonzager.ex.Modelos.Socio;
import me.gonzager.ex.Modelos.UmbralUnico;

public class AnalisisPrestamosTest {

    
    @Test
    public void socioSinDeuda() {
        Libro libro1 = new Libro("El arte de la guerra");
        Socio pedro = new Socio(LocalDate.of(1999,12,31), LocalDate.of(2020, 1, 1));
        libro1.setAnalizadorPrestamosStrategy(new SinDeudaStrategy(new DefaultStrategy()));
        
        assertTrue(libro1.puedePrestarse(pedro));
    }

    @Test
    public void socioSinDeudaBuilder(){
        Libro libro = new LibroConAnalizador("El arte de la guerra").sinDeuda().adulto().build();
        Socio pedro = new Socio(LocalDate.of(1999,12,31), LocalDate.of(2020, 1, 1));

        libro1.puedePrestarse(pedro);
    }
    
    @Test
    public void socioQueNoSuperaElUmbral(){
        UmbralUnico.setUmbral(100.0);
        Libro libro = new LibroConAnalizador("El arte de la guerra").umbral().build();
        Socio pedro = new Socio(LocalDate.of(1999,12,31), LocalDate.of(2020, 1, 1));
        pedro.setDeuda(50.0);

        libro1.puedePrestarse(pedro);
    }
}
