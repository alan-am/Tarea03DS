package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    @Test
    public void realizarReservaTest() {
        Cliente cliente = new Cliente(null, null, null, null);

        assertDoesNotThrow(() -> {
            cliente.realizarReserva();
        });
    }
}
