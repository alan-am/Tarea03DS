package com.example.Decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CoberturaExtendidaTest {
    @Test
    void toStringTest() {
        CoberturaExtendida coberturaExtendida = new CoberturaExtendida(null, 10.0);

        assertEquals("CoberturaExtendida{servicio=rock, precio=10.0}", coberturaExtendida.toString());

    }
}
