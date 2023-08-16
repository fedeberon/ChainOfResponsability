package service;

public class BilleteCienService extends BilleteService  {

    public BilleteService next;

    public void handle(Integer importe) {
        if (importe % 100 == 0) {
            System.out.println("Lo puedo manejar yo. Soy el Billete de cien");
        }

        else next.handle(importe);
    }

    @Override
    public Integer cantidadDeBilletes() {
        return 2;
    }

}
