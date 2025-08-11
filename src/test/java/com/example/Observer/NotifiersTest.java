package com.example.Observer;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NotifiersTest {

    @Test
    @DisplayName("NotiEmail.enviarNotificacion: no lanza excepciones")
    void notiEmail_noExcepcion() {
        NotiEmail n = new NotiEmail();
        assertDoesNotThrow(() -> n.enviarNotificacion("hola"));
    }

    @Test
    @DisplayName("NotiApp.enviarNotificacion: no lanza excepciones")
    void notiApp_noExcepcion() {
        NotiApp n = new NotiApp();
        assertDoesNotThrow(() -> n.enviarNotificacion("hola"));
    }
}
