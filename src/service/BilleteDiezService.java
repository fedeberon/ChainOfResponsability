package service;

public class BilleteDiezService extends BilleteService {

    public BilleteService next;

    public void handle(Integer importe) {
        if (importe % 10 == 0) {
            System.out.println("Lo puedo manejar yo. Soy el Billete de diez");
        }

        else next.handle(importe);
    }

    @Override
    public Integer cantidadDeBilletes() {
        return 0;
    }
}
