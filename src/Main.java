import conversor.modelos.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menus menu = new Menus();
        ConsultarMoneda consulta = new ConsultarMoneda();
        IdDeMoneda buscarId = new IdDeMoneda();
        ElegirMoneda elegir = new ElegirMoneda();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Sea bienvenido/a al Conversor de Monedas =]\n");
        while(true) {
            try{
                // Primera moneda
                int opcion = elegir.elegirMoneda();
                if (opcion == 7) {
                    break;
                }

                String id = buscarId.buscarId(opcion);

                Moneda moneda = consulta.buscarMoneda(id);

                // Segunda moneda.
                opcion = elegir.elegirMoneda();
                if (opcion == 7) {
                    break;
                }

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