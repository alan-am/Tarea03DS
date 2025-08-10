package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReporteIncidenciaTestPlan {

    // Metodo: constructor/getters | Entrada: id=R1, descripcion=desc, cliente=c | Salida esperada: getters retornan los valores
    @Test
    @DisplayName("constructor y getters: conservan valores iniciales")
    void constructorYGetters() {
        Cliente c = new Cliente("C1", "N", "E", "T");
        ReporteIncidencia r = new ReporteIncidencia("R1", "desc", c);
        assertEquals("R1", r.getId());
        assertEquals("desc", r.getDescripcion());
        assertEquals(c, r.getClienteReportador());
    }

    // Metodo: setters | Entrada: nuevos valores | Salida esperada: getters reflejan los cambios
    @Test
    @DisplayName("setters: actualizan correctamente los campos")
    void setters_actualizan() {
        ReporteIncidencia r = new ReporteIncidencia(null, null, null);
        Cliente c2 = new Cliente("C2", "N2", "E2", "T2");
        r.setId("R2");
        r.setDescripcion("d2");
        r.setClienteReportador(c2);
        assertEquals("R2", r.getId());
        assertEquals("d2", r.getDescripcion());
        assertEquals(c2, r.getClienteReportador());
    }
}