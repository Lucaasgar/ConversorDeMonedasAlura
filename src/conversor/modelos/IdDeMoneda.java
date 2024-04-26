package conversor.modelos;

public class IdDeMoneda {
    public String buscarId(int opcion){
        String id = null;
        switch (opcion){
            case 1:
                id = String.valueOf(Monedas.USD);
                break;
            case 2:
                id = String.valueOf(Monedas.EUR);
                break;
            case 3:
                id = String.valueOf(Monedas.GBP);
                break;
            case 4:
                id = String.valueOf(Monedas.BRL);
                break;
            case 5:
                id = String.valueOf(Monedas.ARS);
                break;
            case 6:
                id = String.valueOf(Monedas.CNY);
                break;
            default:
                break;
        }
        return id;
    }
}
