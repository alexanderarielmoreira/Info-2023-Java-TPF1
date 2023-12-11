package com.informatorio.servicio.menu;

import com.informatorio.basededatos.DatosDeClientesBancarios;
import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cuenta;
import com.informatorio.dominio.CuentaCorriente;
import com.informatorio.entrada.IngresoPorConsola;
import com.informatorio.servicio.banco.BancoServicioImpl;

public class MenuPrincipalImpl implements MenuPrincipal{
    @Override
    public void iniciar() {
        int opc;
        do {
            System.out.println("\n1   Listar clientes y cuentas registrados");
            System.out.println("    REGISTRARSE");
            System.out.println("2   Agregar Cliente");
            System.out.println("3   Abrir Caja de Ahorros");
            System.out.println("4   Abrir Cuenta Corriente");
            System.out.println("    GESTIONAR CLIENTES");
            System.out.println("5   Agregar Cuenta a un Cliente registrado");
            System.out.println("6   Consultar saldo");
            System.out.println("7   Depositar dinero en una cuenta");
            System.out.println("8   Extraer dinero de una cuenta");
            System.out.println("0.  Finalizar\n");

            System.out.println("Ingrese una opción:");
            opc = IngresoPorConsola.getScanner().nextInt();

            DatosDeClientesBancarios datosDeClientesBancarios = new DatosDeClientesBancarios();
            Cuenta cuenta = new Cuenta();
            CuentaCorriente cuentaCorriente = new CuentaCorriente();
            CajaAhorro cajaAhorro = new CajaAhorro();

            switch (opc){
                case 1:
                    datosDeClientesBancarios.cargarDatos();
                    break;
                case 2:
                    datosDeClientesBancarios.agregarNuevoCliente();
                    break;
                case 3:
                    datosDeClientesBancarios.abrirCajaDeAhorro();
                    break;
                case 4:
                    datosDeClientesBancarios.abrirCuentaCorriente();
                    break;
                case 5:
                    datosDeClientesBancarios.agregarCuentaEnCliente(3477L,4478L,500000.00);
                    break;
                case 6:
                    cuenta.consultarSaldo();
                    break;
                case 7:
                    cuenta.setSaldo(100000.00);
                    break;
                case 8:
                    cajaAhorro.retirar(200000.00);
                    cuentaCorriente.retirar(100000.00);
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Elección Invalida. Intente nuevamente.");
            }

        } while (opc != 0);
    }

}
