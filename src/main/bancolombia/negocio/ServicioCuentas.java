package main.bancolombia.negocio;

import java.util.ArrayList;

public interface ServicioCuentas {
    boolean agregarCuenta(Cuenta cuenta);
    boolean cancelarCuenta(int numero);
    ArrayList<Cuenta> consultarCuenta(int numero);
    void abonarCuenta(int numero, double abono);
    void retirar(int numero, double retiro);
    ArrayList<Cuenta> obtenerCuentas();
}
