package modelo;

import Entidad.Pasajero;
import Entidad.Ruta;

public abstract class Ticket {
    protected Pasajero pasajero;
    protected Ruta ruta;
    protected String asiento;
    protected int maletasExtra;

    public Ticket() {}

    public Ticket(Pasajero pasajero, Ruta ruta, String asiento, int maletasExtra) {
        this.pasajero = pasajero;
        this.ruta = ruta;
        this.asiento = asiento;
        this.maletasExtra = maletasExtra;
    }

    public Pasajero getPasajero() {
        return pasajero; }
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero; }

    public Ruta getRuta() {
        return ruta; }
    public void setRuta(Ruta ruta) {
        this.ruta = ruta; }

    public String getAsiento() {
        return asiento; }
    public void setAsiento(String asiento) {
        this.asiento = asiento; }

    public int getMaletasExtra() {
        return maletasExtra; }
    public void setMaletasExtra(int maletasExtra) {
        this.maletasExtra = maletasExtra; }

    public abstract double calcularCosto();

    @Override
    public String toString() {
        return "Pasajero: " + pasajero + "\nRuta: " + ruta + "\nAsiento: " + asiento +
                "\nMaletas extra: " + maletasExtra;
    }
}

