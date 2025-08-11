package com.example.Decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoberturaExtendidaTest {
    @Test
    @DisplayName("CoberturaExtendida.toString: muestra servicio=null y precio")
    void toStringTest() {
        CoberturaExtendida coberturaExtendida = new CoberturaExtendida(null, 10.0);

        assertEquals("CoberturaExtendida{servicio=null, precio=10.0}", coberturaExtendida.toString());

    }

}
