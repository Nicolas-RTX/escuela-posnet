package trabajointegrador;
public class Principal {
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona titular = new Persona("45397477", "Nicolas", "Diaz", "1163554795", "nicolasdiaz.rtx@gmail.com");
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("BBVA", "5555", 15000, EntidadFinanciera.VISA, titular);
        
        System.out.println(titular);
        System.out.println(tarjetaDeCredito);
        Ticket ticket = posnet.efectuarPago(tarjetaDeCredito,10000,5);
        System.out.println(ticket);
        
    }
}