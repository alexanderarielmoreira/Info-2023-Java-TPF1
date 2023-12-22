package com.informatorio.servicio.menu;

import com.informatorio.basededatos.DatosDeClientesBancarios;
import com.informatorio.entrada.IngresoPorConsola;
import com.informatorio.servicio.banco.BancoServicioImpl;
import com.informatorio.servicio.cajadeahorro.CajaDeAhorroServicioImpl;
import com.informatorio.servicio.cuenta.CuentaServicioImpl;
import com.informatorio.servicio.cuentacorriente.CuentaCorrienteServicioImpl;


public class MenuPrincipalImpl implements MenuPrincipal{
    @Override
    public void iniciar() {
        int opc;
        do {
            System.out.println("1   LISTA DE CLIENTES BANCARIOS: ");
            System.out.println("2   Buscar cliente por ID");
            System.out.println("    REGISTRO: ");
            System.out.println("3   Crear nuevo Cliente y Cuentas");
            System.out.println("    GESTIONAR CLIENTES REGISTRADOS: ");
            System.out.println("4   Agregar cuenta a cliente registrado");
            System.out.println("5   Eliminar cuenta");
            System.out.println("6   Consultar saldos totales");
            System.out.println("7   Consultar saldo por ID");
            System.out.println("8   Depositar dinero");
            System.out.println("9   Extraer dinero");
            System.out.println("10  Calcular intereses de Cajas de Ahorros");
            System.out.println("11  Extraer con sobregiro de Cuentas Corrientes");
            System.out.println("12  Exportar datos en archivo CSV");
            System.out.println("0.  Finalizar\n");
            System.out.println("Ingrese una opción:");

            opc = IngresoPorConsola.getScanner().nextInt();

            DatosDeClientesBancarios datosDeClientesBancarios = new DatosDeClientesBancarios();
            BancoServicioImpl bancoServicioImpl = new BancoServicioImpl();
            CuentaServicioImpl cuentaServicioImpl = new CuentaServicioImpl();
            CajaDeAhorroServicioImpl cajaDeAhorroServicioImpl = new CajaDeAhorroServicioImpl();
            CuentaCorrienteServicioImpl cuentaCorrienteServicioImpl = new CuentaCorrienteServicioImpl();

            switch (opc){
                case 1:
                    // Muestra todos los clientes de la bd;
                    datosDeClientesBancarios.cargarDatos();
                    break;
                case 2:
                    // Muestra un cliente según el ID ingresado;
                    bancoServicioImpl.mostrarDatosClientePorID();
                    break;
                case 3:
                    // Registra un nuevo cliente y le agrega una C.A. y una Cta. Cte;
                    bancoServicioImpl.registrarseEnBanco();
                    break;
                case 4:
                    // Agrega una nueva cuenta a un cliente ya registrado;
                    cuentaServicioImpl.agregarCuenta();
                    break;
                case 5:
                    // Elimina una cuenta del cliente registrado;
                    cuentaServicioImpl.eliminarCuenta();
                    break;
                case 6:
                    // Muestra la suma total de los saldos de las cuentas existentes;
                    cuentaServicioImpl.consultarSaldosTotales();
                    break;
                case 7:
                    // Muestra el saldo de una cuenta específica por su ID;
                    cuentaServicioImpl.consultarSaldo();
                    break;
                case 8:
                    // Depositar dinero en una cuenta del cliente;
                    cuentaServicioImpl.depositar();
                    break;
                case 9:
                    // Extraer dinero de una cuenta del cliente;
                    cuentaServicioImpl.extraer();
                    break;
                case 10:
                    // Calcular intereses de la Caja de Ahorro;
                    cajaDeAhorroServicioImpl.calcularInteres();
                    break;
                case 11:
                    // Extraer con sobregiro;
                    cuentaCorrienteServicioImpl.retirarConLimiteDeSobregiro();
                    break;
                case 12:
                    // Extraer con sobregiro;
                    // Fata indexar este método;
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
