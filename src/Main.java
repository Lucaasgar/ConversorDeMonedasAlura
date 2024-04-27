import conversor.modelos.ConsultarMoneda;
import conversor.modelos.IdDeMoneda;
import conversor.modelos.Menus;
import conversor.modelos.Moneda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menus menu = new Menus();
        ConsultarMoneda consulta = new ConsultarMoneda();
        IdDeMoneda buscarId = new IdDeMoneda();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Sea bienvenido/a al Conversor de Monedas =]\n");
        while(true) {
            // Imprimo el menu y tomo el valor
            try{
                // Primera moneda.
                int error = 0;
                int opcion;
                menu.imprimirMenu();
                System.out.println("7) Salir");
                System.out.println("\n********************************");
                do {
                    if (error == 0){
                        System.out.println("Ingrese la moneda a la que desea pasar: ");
                        opcion = entrada.nextInt();
                        error = 1;
                    }else{
                        System.out.println("Opcion no valida.");
                        System.out.println("Ingrese nuevamente la moneda: ");
                        opcion  = entrada.nextInt();
                    }

                }while(opcion < 1 || opcion > 7);

                if (opcion == 7) {
                    break;
                }

                String id = buscarId.buscarId(opcion);

                Moneda moneda = consulta.buscarMoneda(id);

                // Segunda moneda.
                error = 0;
                menu.imprimirMenu();
                System.out.println("\n********************************");
                do {
                    if (error == 0){
                        System.out.println("Ingrese la moneda a la que desea pasar: ");
                        opcion = entrada.nextInt();
                        error = 1;
                    }else{
                        System.out.println("Opcion no valida.");
                        System.out.println("Ingrese nuevamente la moneda: ");
                        opcion  = entrada.nextInt();
                    }

                }while(opcion < 1 || opcion > 6);

                id = buscarId.buscarId(opcion);

                System.out.println("1 " + moneda.base_code() + " equivale a " + moneda.conversion_rates().get(id) + " " + id);
            }catch (InputMismatchException e){
                System.out.println("Error: "+ e.getMessage());
                System.out.println("Debe ingresar un numero de la lista.");
                entrada.next();
            }

        }
        System.out.println("Cerrando programa...");
    }
}