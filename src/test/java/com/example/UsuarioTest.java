package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    
    // Metodo: iniciarSesion() | Entrada: nombre=Ana | Salida esperada: no excepción
    @Test
    @DisplayName("iniciarSesion: no lanza excepciones al imprimir mensaje de inicio")
    void iniciarSesion_noExcepcion() {
        Usuario usuario = new Usuario("U1", "Ana", "ana@example.com", "999");
        assertDoesNotThrow(usuario::iniciarSesion);
    }

    // Metodo: toString() | Entrada: id=U2, nombre=Bob, email=bob@example.com, telefono=111 | Salida esperada: string exacto
    @Test
    @DisplayName("toString: formatea todos los campos correctamente")
    void toString_formato() {
        Usuario usuario = new Usuario("U2", "Bob", "bob@example.com", "111");
        String esperado = "Usuario{" +
                "id='U2'" +
                ", nombre='Bob'" +
                ", email='bob@example.com'" +
                ", telefono='111'" +
                "}";
        assertEquals(esperado, usuario.toString());
    }
}
