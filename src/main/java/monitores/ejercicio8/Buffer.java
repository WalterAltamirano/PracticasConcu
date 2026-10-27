package monitores.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Buffer {

    List<Integer> numeros;
    private int posConsumir= 0;
    private int posProducir = 0;

    public Buffer() {
        this.numeros = new ArrayList<>();
    }

    synchronized public Integer consumirNumero() {
        while(numeros.isEmpty()) {
            try {
                this.wait();
            } catch(InterruptedException e) {
                System.out.print("Intentaste usar wait erronamente");
            }
        }
        posConsumir = (posConsumir + 1) % 2;
        notify();
        return numeros.get(posConsumir);
    }

    synchronized public void producirNumero(Integer numero) {
            while(numeros.size() == 2) {
                try {
                    this.wait();
                } catch(InterruptedException e) {
                    System.out.print("Intentaste usar wait erronamente");
                }
            }
           this.numeros.add(posProducir,numero);
           posProducir = (posProducir + 1) % 2;
           notify();
    }
}
