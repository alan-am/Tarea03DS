package com.example.Observer;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EventManagerTest {

    // Metodo: suscribe(Listener) | Entrada: listeners inicializado, listener dummy | Salida esperada: tamaño=1
    @Test
    @DisplayName("suscribe: agrega listener cuando la lista está inicializada")
    void suscribe_agrega() throws Exception {
        EventManager em = new EventManager();
        Field f = EventManager.class.getDeclaredField("listeners");
        f.setAccessible(true);
        f.set(em, new ArrayList<Listener>());

        em.suscribe(mensaje -> {});

        ArrayList<?> lista = (ArrayList<?>) f.get(em);
        assertEquals(1, lista.size());
    }

    // Metodo: unsubscribe(Listener) | Entrada: lista con un listener | Salida esperada: tamaño=0
    @Test
    @DisplayName("unsubscribe: remueve listener cuando existe en la lista")
    void unsubscribe_remueve() throws Exception {
        EventManager em = new EventManager();
        Field f = EventManager.class.getDeclaredField("listeners");
        f.setAccessible(true);
        ArrayList<Listener> lista = new ArrayList<>();
        Listener l = mensaje -> {};
        lista.add(l);
        f.set(em, lista);

        em.unsubscribe(l);

        assertEquals(0, lista.size());
    }

    // Metodo: notify(String) | Entrada: lista con dos listeners | Salida esperada: no excepción
    @Test
    @DisplayName("notify: invoca enviarNotificacion en todos los listeners")
    void notify_invocaListeners() throws Exception {
        EventManager em = new EventManager();
        Field f = EventManager.class.getDeclaredField("listeners");
        f.setAccessible(true);
        ArrayList<Listener> lista = new ArrayList<>();
        lista.add(mensaje -> {});
        lista.add(mensaje -> {});
        f.set(em, lista);

        assertDoesNotThrow(() -> em.notify("hola"));
    }

    // Metodo: suscribe(Listener) | Entrada: listeners=null (por defecto) | Salida esperada: NullPointerException
    @Test
    @DisplayName("suscribe: lanza NullPointerException cuando la lista no está inicializada")
    void suscribe_listaNula() {
        EventManager em = new EventManager();
        assertThrows(NullPointerException.class, () -> em.suscribe(mensaje -> {}));
    }

    // Metodo: notify(String) | Entrada: listeners=null (por defecto) | Salida esperada: NullPointerException
    @Test
    @DisplayName("notify: lanza NullPointerException cuando la lista no está inicializada")
    void notify_listaNula() {
        EventManager em = new EventManager();
        assertThrows(NullPointerException.class, () -> em.notify("hola"));
    }
}