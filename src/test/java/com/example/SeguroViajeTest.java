package com.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.example.Builder.Reserva;
import com.example.Decorator.CoberturaExtendida;
import com.example.Decorator.SeguroViaje;

public class SeguroViajeTest {

    @Test
    void composicionEnCadena_deberiaEncadenarDecoradoresCorrectamente() {
        // Reserva base (implementa Servicio)
        Reserva reserva = new Reserva();

        // Encadenamos: Reserva -> CoberturaExtendida -> SeguroViaje
        CoberturaExtendida cobertura = new CoberturaExtendida(reserva, 20.0);
        SeguroViaje seguro = new SeguroViaje(cobertura, 10.0);

        // Verificaciones de composición
        assertNotNull(seguro.getServicio(), "SeguroViaje debe envolver un Servicio interno");
        assertTrue(seguro.getServicio() instanceof CoberturaExtendida,
                "El servicio envuelto por SeguroViaje debe ser una CoberturaExtendida");

        CoberturaExtendida inner = (CoberturaExtendida) seguro.getServicio();
        assertSame(reserva, inner.getServicio(),
                "CoberturaExtendida debe envolver a la Reserva original");

        // toString debería reflejar toda la cadena
        String repr = seguro.toString();
        assertTrue(repr.contains("SeguroViaje"), "toString debería incluir 'SeguroViaje'");
        assertTrue(repr.contains("CoberturaExtendida"), "toString debería incluir 'CoberturaExtendida'");
        assertTrue(repr.contains("Reserva"), "toString (anidado) debería incluir 'Reserva'");
        assertTrue(repr.contains("precio=10.0"), "Precio del seguro esperado en toString");
        assertTrue(repr.contains("precio=20.0"), "Precio de cobertura esperado en toString");
    }
}
