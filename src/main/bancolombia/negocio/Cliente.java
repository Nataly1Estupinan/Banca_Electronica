package main.bancolombia.negocio;

import java.util.ArrayList;

public class Cliente implements ServicioCuentas{
    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;


    public Cliente(int numero, String nombre, String calle, int numeroDomicilio, String colonia, String estado, int codigoPostal, String rfc, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = new Domicilio(calle, numeroDomicilio, colonia, estado, codigoPostal);
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentas= new ArrayList<>();
    }

    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentas= new ArrayList<>();
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cuentas=" + cuentas +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        obtenerCuentas().add(cuenta);
        return true;
    }

    @Override
    public boolean cancelarCuenta(int numero) {
        ArrayList<Cuenta> cuenta = consultarCuenta(numero);
        if(cuenta!=null){
            cuentas.remove(cuenta);
            System.out.println("Se canceló la cuenta número: "+numero);
            return true;
        }
        System.out.println("El número de cuenta"+numero+ "no fue eliminado");
        return false;
    }

    @Override
    public ArrayList<Cuenta> consultarCuenta(int numero) {
        cuentas.stream()
                .filter(cuenta -> cuenta.getNumero()==numero)
                .forEach(System.out::println);
        return cuentas;
        /**for(Cuenta cuenta:cuentas){
            if(cuenta.getNumero()==numero){
                System.out.println("Se encontró la cuenta número: "+numero);
            }
            System.out.println("No se encontró la cuenta número: "+numero);}
        return null;**/
    }

    @Override
    public void abonarCuenta(int numero, double abono) {

        double abonarCuenta = abono;

        System.out.println("Se ha abonado un valor de: "+abonarCuenta);

    }

    @Override
    public void retirar(int numero, double retiro) {
        double retiroCuenta = retiro;


        System.out.println("Se ha retirado un valor de: "+retiroCuenta);
      
    }

    @Override
    public ArrayList<Cuenta> obtenerCuentas() {
        return cuentas;
    }


}
