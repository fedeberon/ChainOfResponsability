package service;

public class BilleteVeinteService extends BilleteService {

    public BilleteService next;

    public void handle(Integer importe) {
        if (importe % 20 == 0) {
            System.out.println("Lo puedo manejar yo. Soy el Billete de veinte");
        }

        else next.handle(importe);
    }

    @Override
    public Integer cantidadDeBilletes() {
        return 1;
    }
}
