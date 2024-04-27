package conversor.modelos;

public class Menus {

    public void monedas(){
        System.out.println("1) Dólar (USD)");
        System.out.println("2) Euro (EUR)");
        System.out.println("3) Libra Esterlina (GBP)");
        System.out.println("4) Real (BRL)");
        System.out.println("5) Peso Argentino (ARS)");
        System.out.println("6) Yuan (CNY)");
    }
    public void imprimirMenu(){
        System.out.println("********************************");
        this.monedas();

    }
}
