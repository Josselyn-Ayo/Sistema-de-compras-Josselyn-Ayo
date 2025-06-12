package Entidad;
public class Ruta {
    private String origen;
    private String destino;
    private double costo;

    public Ruta() {}

    public Ruta(String origen, String destino, double costo) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
    }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    @Override
    public String toString() {
        return origen + " - " + destino + " ($" + costo + ")";
    }
}
