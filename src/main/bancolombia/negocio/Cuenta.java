package main.bancolombia.negocio;

public class Cuenta {
        private int numero;
        private String fechaApertura;
        private double saldo;
        private String fechaCancelacion;

    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void abono(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Se realizó un abono por valor de: "+cantidad + "su nuevo saldo es: "+saldo);

    }
    public void retiro (double cantidad){
        if(cantidad<=this.saldo){
            this.saldo-=cantidad;
            System.out.println("Saldo insuficiente. Saldo actual es: "+saldo);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }
}
