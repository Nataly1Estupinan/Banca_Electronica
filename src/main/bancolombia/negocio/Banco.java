package main.bancolombia.negocio;

import java.util.ArrayList;

public class Banco implements ServicioClientes{
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes = new ArrayList<>();
    }

    public Banco(String nombre,String calle, int numero, String colonia, String estado, int codigoPostal, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = new Domicilio(calle, numero, colonia, estado, codigoPostal);
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes=new ArrayList<>();
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

    public ArrayList getCliente() {
        return clientes;
    }

    public void setCliente(ArrayList cliente) {
        this.clientes = cliente;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cliente=" + clientes +
                '}';
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        obtenerClientes().add(cliente);
        return true;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        ArrayList<Cliente> cliente = consultarcliente(numero);
        if(cliente!=null){
            clientes.remove(cliente);
            System.out.println("Se eliminó al cliente número: "+numero);
            return true;
        }
        System.out.println("El cliente número: "+numero+" no pudo ser eliminado");
        return false;
    }

    @Override
    public ArrayList<Cliente> consultarcliente(int numero) {
        clientes.stream()
                .filter(cliente -> cliente.getNumero()==numero)
                .forEach(System.out::println);
        return clientes;
       /** for(Cliente cliente:clientes){
            if(cliente.getNumero()==numero){
                System.out.println("Se encontró el cliente número: "+numero);
            }
        }
        System.out.println("No se encontró el cliente número: "+numero);
        return null;**/
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }

    @Override
    public ArrayList<Cliente> buscarClientePorRFC(String rfc) {
        clientes.stream()
                .filter(cliente -> cliente.getRfc()==rfc)
                .forEach(cliente -> System.out.println("Cliente por RFC:" +cliente));
        return clientes;

    }
        /**for(Cliente cliente:clientes){
            if(cliente.getRfc().equals(rfc)){
                System.out.println("Se encontró el cliente con rfc: "+rfc);
                return cliente;
            }
        }
        System.out.println("No se encontró el cliente con rfc: "+rfc);
        return null;**/


    @Override
    public void listarClientes() {
        System.out.println("=".repeat(40));
        /**for(Cliente c:clientes){
            System.out.println(c);
        }**/
        clientes.stream().forEach(System.out::println);
         System.out.println("=".repeat(40));
    }







}
