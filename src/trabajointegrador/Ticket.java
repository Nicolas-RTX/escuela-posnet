package trabajointegrador;
public class Ticket {
    private String nombreApellido;
    private double montoTotal,montoPorCuota;

    public Ticket(double montoTotal,double montoPorCuota,String nombreApellido) {
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
        this.nombreApellido = nombreApellido;
    }

    @Override public String toString() {return "Ticket{nombreApellido="+nombreApellido+", montoTotal="+montoTotal+", montoPorCuota="+montoPorCuota+'}';}
}