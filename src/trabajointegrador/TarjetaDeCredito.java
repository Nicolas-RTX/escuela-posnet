package trabajointegrador;
public class TarjetaDeCredito {
    private String entidadBancaria, numeroTarjeta;
    private double saldo;
    public EntidadFinanciera entidadFinanciera;
    public Persona titular;

    public TarjetaDeCredito(String entidadBancaria, String numeroTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }
    public String getNombreCompleto() {return titular.getNombre()+" "+titular.getApellido();}
    public boolean validarSaldo(double montoAbonar) {return saldo>=montoAbonar;}
    public void extraccion(double montoAbonar) {saldo-=montoAbonar;}
    
    @Override public String toString() {return "TarjetaDeCredito{entidadBancaria="+entidadBancaria+", numeroTarjeta="+numeroTarjeta+", saldo="+saldo+", entidadFinanciera="+entidadFinanciera+", titular="+titular+'}';}
}