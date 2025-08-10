package com.example.Observer;

public class NotiEmail implements Listener {
    
    @Override
    public void enviarNotificacion(String mensaje) {
        // Lógica para enviar notificación por email
        System.out.println("Enviando notificación por email : " + mensaje);
    }

}
