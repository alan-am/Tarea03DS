package com.example.Observer;

public class NotiApp implements Listener {
    
    @Override
    public void enviarNotificacion(String mensaje) {
        // Lógica para enviar notificación a la aplicación
        System.out.println("Enviando notificación por app : " + mensaje); 
    }
}
