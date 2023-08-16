import service.BilleteCienService;
import service.BilleteCincuentaService;
import service.BilleteDiezService;
import service.BilleteVeinteService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cajero Automatico");
        // Instancio todas las clases para usarlas
        BilleteCienService cien = new BilleteCienService();
        BilleteCincuentaService cicuenta = new BilleteCincuentaService();
        BilleteVeinteService veinte = new BilleteVeinteService();
        BilleteDiezService diez = new BilleteDiezService();

        // Defino el orden de la cadena de responsabilidades
        cien.next = cicuenta;
        cicuenta.next = veinte;
        veinte.next = diez;

        cien.handle(10);

    }
}