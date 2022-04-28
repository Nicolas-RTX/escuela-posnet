package trabajointegrador;
public class Posnet {
    public static final double RECARGO_POR_CUOTA=0.03;
    public static final int MIN_CANT_CUOTA=1,MAX_CANT_CUOTA=6;

    public Ticket efectuarPago(TarjetaDeCredito tarjetaDeCredito,double montoAbonar,int cantCuotas) {Ticket ticket=null;
        if(validarDatos(tarjetaDeCredito,montoAbonar,cantCuotas)) if(tarjetaDeCredito.validarSaldo(montoAbonar)) {
            double montoFinal=calcCuotas(montoAbonar,cantCuotas);
            ticket=new Ticket(montoFinal,montoFinal/cantCuotas,tarjetaDeCredito.getNombreCompleto());
            tarjetaDeCredito.extraccion(montoFinal);
        }return ticket;
    }
    
    private boolean validarDatos(TarjetaDeCredito tarjetaDeCredito,double montoAbonar,int cantCuotas)
    {return tarjetaDeCredito!=null && montoAbonar>=0 && cantCuotas>=MIN_CANT_CUOTA && cantCuotas<=MAX_CANT_CUOTA;}
    
    private double calcCuotas(double montoAbonar,int cantCuotas)
    {return montoAbonar+montoAbonar*(RECARGO_POR_CUOTA*(cantCuotas-1));}
}