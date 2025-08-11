package com.example.Decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SeguroViajeTest {

    @Test
    @DisplayName("SeguroViaje.toString: muestra servicio=null y precio")
    void seguroViaje_toString() {
        SeguroViaje seg = new SeguroViaje(null, 20.5);
        assertEquals("SeguroViaje{servicio=null, precio=20.5}", seg.toString());
    }
}
