package com.example.Observer;

public abstract class NotificadorBase implements Listener {
    private final String canal;

    public NotificadorBase(String canal) {
        this.canal = canal;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por " + canal + " : " + mensaje);
    }
}
