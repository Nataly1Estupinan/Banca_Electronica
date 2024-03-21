package main.bancolombia.negocio;

public class CuentaCheques extends Cuenta{

    private double costoManejoMensual;

    public CuentaCheques(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void abono(double cantidad) {

    }

    @Override
    public void retiro(double cantidad) {

    }

    public CuentaCheques(int numero, double saldo, double costoManejoMensual) {
        super(numero, saldo);
        this.costoManejoMensual = costoManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaCheques{" +
                "costoManejoMensual=" + costoManejoMensual +
                '}';
    }
}
