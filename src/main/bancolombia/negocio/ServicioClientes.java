package main.bancolombia.negocio;

import java.util.ArrayList;

public interface ServicioClientes {
    boolean agregarCliente(Cliente cliente);
    boolean eliminarCliente(int numero);
    ArrayList<Cliente> consultarcliente(int numero);
    ArrayList<Cliente> obtenerClientes();
    ArrayList<Cliente> buscarClientePorRFC(String rfc);
    void listarClientes();

}
