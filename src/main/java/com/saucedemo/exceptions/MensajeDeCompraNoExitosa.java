package com.saucedemo.exceptions;

public class MensajeDeCompraNoExitosa extends AssertionError {

    public MensajeDeCompraNoExitosa(String message) {
        super(message);
    }

    public static MensajeDeCompraNoExitosa conElMensaje(String mensaje) {
        return new MensajeDeCompraNoExitosa(mensaje);
    }
}