package com.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Listener> listeners = new ArrayList<>();

    public void suscribe(Listener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(Listener listener) {
        listeners.remove(listener);
    }

    public void notify(String mensaje) {
        for (Listener listener : listeners) {
            listener.enviarNotificacion(mensaje);
        }
    }

}
