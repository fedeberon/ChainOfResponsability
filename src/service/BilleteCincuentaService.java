package service;

public class BilleteCincuentaService  extends BilleteService {

    public  BilleteService next;


    /**
     * Funcion que maneja a los billetes de Cincuenta pesos.
     * Si no lo puede manejar, se lo pasa a Next
     * @param importe
     */
    public void handle(Integer importe) {
        if (importe % 50 == 0) {
            System.out.println("Lo puedo manejar yo. Soy el Billete de cincuenta");
        }

        else next.handle(importe);
    }

    @Override
    public Integer cantidadDeBilletes() {
        return 800;
    }


}
