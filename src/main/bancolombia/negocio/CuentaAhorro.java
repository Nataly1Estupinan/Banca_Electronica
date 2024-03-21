package main.bancolombia.negocio;

public class CuentaAhorro extends Cuenta{


    private double tasaInteresesMensual;

    public CuentaAhorro(int numero, double saldo, double tasaInteresesMensual) {
        super(numero, saldo);
        this.tasaInteresesMensual = tasaInteresesMensual;
    }

    public double getTasaInteresesMensual() {
        return tasaInteresesMensual;
    }

    public void setTasaInteresesMensual(double tasaInteresesMensual) {
        this.tasaInteresesMensual = tasaInteresesMensual;
    }

    @Override
    public String toString() {
        return super.toString()+ " CuentaAhorro{" +
                "tasaInteresesMensual=" + tasaInteresesMensual +
                '}';
    }
}
