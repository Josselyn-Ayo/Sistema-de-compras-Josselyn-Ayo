package Entidad;

import modelo.Ticket;

public class VIP extends Ticket {
    private Servicio servicio;

    public VIP() {}

    public VIP(Pasajero pasajero, Ruta ruta, String asiento, int maletasExtra, Servicio servicio) {
        super(pasajero, ruta, asiento, maletasExtra);
        this.servicio = servicio;
    }

    public Servicio getServicio() {
        return servicio; }
    public void setServicio(Servicio servicio) {
        this.servicio = servicio; }

    @Override
    public double calcularCosto() {
        double base = ruta.getCosto();
        double recargo = base * 0.3;
        return base + recargo + (maletasExtra * 5);
    }

    @Override
    public String toString() {
        return super.toString() + "\nServicio VIP: " + servicio;
    }
}

