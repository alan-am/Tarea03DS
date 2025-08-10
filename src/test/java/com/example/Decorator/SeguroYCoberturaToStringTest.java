package com.example.Decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SeguroYCoberturaToStringTest {

    // Metodo: CoberturaExtendida.toString() | Entrada: servicio=null, precio=10.0 | Salida esperada: string exacto con servicio=null
    @Test
    @DisplayName("CoberturaExtendida.toString: muestra servicio=null y precio")
    void coberturaExtendida_toString() {
        CoberturaExtendida cob = new CoberturaExtendida(null, 10.0);
        assertEquals("CoberturaExtendida{servicio=null, precio=10.0}", cob.toString());
    }

    // Metodo: SeguroViaje.toString() | Entrada: servicio=null, precio=20.5 | Salida esperada: string exacto con servicio=null
    @Test
    @DisplayName("SeguroViaje.toString: muestra servicio=null y precio")
    void seguroViaje_toString() {
        SeguroViaje seg = new SeguroViaje(null, 20.5);
        assertEquals("SeguroViaje{servicio=null, precio=20.5}", seg.toString());
    }
}