package Entidad;
public class Servicio {
    private boolean tv;
    private boolean internet;
    private String adicional1;
    private String adicional2;

    public Servicio() {}

    public Servicio(boolean tv, boolean internet, String adicional1, String adicional2) {
        this.tv = tv;
        this.internet = internet;
        this.adicional1 = adicional1;
        this.adicional2 = adicional2;
    }

    public String getAdicional1() {
        return adicional1; }
    public void setAdicional1(String adicional1) {
        this.adicional1 = adicional1; }

    public String getAdicional2() {
        return adicional2; }
    public void setAdicional2(String adicional2) {
        this.adicional2 = adicional2; }
    public boolean isTv() {
        return tv; }
    public void setTv(boolean tv) {
        this.tv = tv; }

    public boolean isInternet() {
        return internet; }
    public void setInternet(boolean internet) { this.internet = internet; }

    @Override
    public String toString() {
        return "TV: " + tv + ", Internet: " + internet + ", Adicionales: " + adicional1 + ", " + adicional2;
    }
}



