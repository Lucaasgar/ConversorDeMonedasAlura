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

        System.out.println("Sea bienvenido/a al Conversor de conversor.modelos.Moneda =]\n");
        while(true) {
            // Imprimo el menu y tomo el valor
            try{
                menu.imprimirMenu();
                System.out.println("Ingrese la moneda de referencia: ");
                int opcion = entrada.nextInt();

                if (opcion == 7) {
                    break;
                }

                String id = buscarId.buscarId(opcion);

                Moneda moneda = consulta.buscarMoneda(id);

                menu.imprimirMenu();
                System.out.println("Ingrese la moneda a la que desea pasar: ");
                opcion = entrada.nextInt();
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