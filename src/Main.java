import Entidad.*;
import modelo.Ticket;

public class Main {
    public static void main(String[] args) {

        // Rutas
        Ruta ruta1 = new Ruta("Quito", "Guayaquil", 20.0);
        Ruta ruta2 = new Ruta("Quito", "Tulcán", 17.5);
        Ruta ruta3 = new Ruta("Quito", "Puyo", 15.0);
        Ruta ruta4 = new Ruta("Quito", "Riobamba", 17.5);


        Servicio servicio1 = new Servicio(true, true, "Comida caliente", "Asistente personal");
        Servicio servicio2 = new Servicio(true, false, "Revistas", "Snacks");



        Normal ticket1 = new Normal();
        ticket1.setPasajero(new Pasajero("Josselyn Romero", "1723456789"));
        ticket1.setRuta(ruta1);
        ticket1.setAsiento("Ventana");
        ticket1.setMaletasExtra(1);

        Normal ticket2 = new Normal();
        ticket2.setPasajero(new Pasajero("Carlos Vega", "1801234567"));
        ticket2.setRuta(ruta2);
        ticket2.setAsiento("Pasillo");
        ticket2.setMaletasExtra(0);

        VIP ticket3 = new VIP();
        ticket3.setPasajero(new Pasajero("Lucía Sánchez", "1711122233"));
        ticket3.setRuta(ruta3);
        ticket3.setAsiento("Adelante");
        ticket3.setMaletasExtra(1);
        ticket3.setServicio(servicio1);

        VIP ticket4 = new VIP();
        ticket4.setPasajero(new Pasajero("Emilia Torres", "1754321987"));
        ticket4.setRuta(ruta4);
        ticket4.setAsiento("Atrás");
        ticket4.setMaletasExtra(2);
        ticket4.setServicio(servicio2);

        Normal ticket5 = new Normal();
        ticket5.setPasajero(new Pasajero("Luis Mena", "1109876543"));
        ticket5.setRuta(ruta2);
        ticket5.setAsiento("Adelante");
        ticket5.setMaletasExtra(0);



        Normal ticket6 = new Normal(new Pasajero("Andrea Paredes", "0911122233"), ruta1, "Ventana", 1);
        VIP ticket7 = new VIP(new Pasajero("Pedro Gómez", "0955566677"), ruta3, "Pasillo", 0, servicio1);
        Normal ticket8 = new Normal(new Pasajero("Daniela Ruiz", "1722288899"), ruta4, "Atrás", 2);
        VIP ticket9 = new VIP(new Pasajero("Mauro Silva", "0998877665"), ruta1, "Adelante", 1, servicio2);
        Normal ticket10 = new Normal(new Pasajero("Valeria Quispe", "1765432189"), ruta2, "Pasillo", 0);


        System.out.println("=== OBJETOS CON VALORES NULOS Y SETTERS ===");
        imprimirTicket(ticket1);
        imprimirTicket(ticket2);
        imprimirTicket(ticket3);
        imprimirTicket(ticket4);
        imprimirTicket(ticket5);

        System.out.println("\n=== OBJETOS CON VALORES INICIALES ===");
        imprimirTicket(ticket6);
        imprimirTicket(ticket7);
        imprimirTicket(ticket8);
        imprimirTicket(ticket9);
        imprimirTicket(ticket10);
    }
    public static void imprimirTicket(Ticket ticket) {
        System.out.println(ticket);
        System.out.println("Costo: $" + ticket.calcularCosto());
        System.out.println("-------------------------------------");
    }
}

