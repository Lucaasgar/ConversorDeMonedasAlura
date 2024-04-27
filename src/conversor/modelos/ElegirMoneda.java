package conversor.modelos;


import java.util.Scanner;

public class ElegirMoneda {
    public int elegirMoneda(){
        Menus menu = new Menus();
        Scanner entrada = new Scanner(System.in);

        // Primera moneda.
        int error = 0;
        int opcion;
        menu.imprimirMenu();
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

        return opcion;
    }
}
