package com.example.Observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NotifiersTest {

    // Metodo: enviarNotificacion(String) | Entrada: mensaje=hola | Salida esperada: no excepción
    @Test
    @DisplayName("NotiEmail.enviarNotificacion: no lanza excepciones")
    void notiEmail_noExcepcion() {
        NotiEmail n = new NotiEmail();
        assertDoesNotThrow(() -> n.enviarNotificacion("hola"));
    }

    // Metodo: enviarNotificacion(String) | Entrada: mensaje=hola | Salida esperada: no excepción
    @Test
    @DisplayName("NotiApp.enviarNotificacion: no lanza excepciones")
    void notiApp_noExcepcion() {
        NotiApp n = new NotiApp();
        assertDoesNotThrow(() -> n.enviarNotificacion("hola"));
    }
}