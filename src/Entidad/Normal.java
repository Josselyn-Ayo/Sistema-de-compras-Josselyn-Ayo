package Entidad;

import modelo.Ticket;

public class Normal extends Ticket {
    public Normal() {}

    public Normal(Pasajero pasajero, Ruta ruta, String asiento, int maletasExtra) {
        super(pasajero, ruta, asiento, maletasExtra);
    }

    @Override
    public double calcularCosto() {
        return ruta.getCosto() + (maletasExtra * 5);
    }
}

