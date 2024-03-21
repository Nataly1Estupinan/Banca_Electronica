package main.bancolombia;

import main.bancolombia.negocio.Banco;
import main.bancolombia.negocio.Cliente;
import main.bancolombia.negocio.Cuenta;
import main.bancolombia.negocio.CuentaAhorro;

public class Main {
        public static void main(String[] args){


            Banco bancoNaty= new Banco("BancoNaty","Calle1",155,"Centro","San Cristóbal", 1234, "ABC","018000");

            CuentaAhorro cuenta1 = new CuentaAhorro(123, 1200000, 1.2);
            CuentaAhorro cuenta2 = new CuentaAhorro(456, 1200000, 1.2);
            CuentaAhorro cuenta3 = new CuentaAhorro(789, 1200000, 1.2);
            System.out.println("Cuentas creadas: "+cuenta1+ cuenta2+ cuenta3);

            Cliente cliente1= new Cliente(001,"Nataly","Calle4",951,"San Cristóbal","Cundinamarca",14100,"MC09823","550050","1958-09-05");
            Cliente cliente2= new Cliente(002,"Juanita","Calle5",258,"Tunal","Santander",6500,"MC09823","315298","1987-07-28");
            Cliente cliente3= new Cliente(003,"Leonardo","Calle6",357,"Ciudad Bolívar","Putumayo",0041,"MC09823","314422","1959-09-04");
           // System.out.println("Cliente1: "+cliente1);
           // System.out.println("Cliente2: "+cliente2);
            //System.out.println("Cliente3: "+cliente3);

            bancoNaty.agregarCliente(cliente1);
            bancoNaty.agregarCliente(cliente2);
            bancoNaty.agregarCliente(cliente3);
            bancoNaty.listarClientes();
            bancoNaty.consultarcliente(001);
            bancoNaty.eliminarCliente(001);
            bancoNaty.buscarClientePorRFC("MC09823");






           /**CuentaAhorro cuenta1 = new CuentaAhorro(123, 1200000, 1.2);
            System.out.println("cuenta: "+cuenta1);**/

        }
    }
