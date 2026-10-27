package monitores.ejercicio8;

public class Consumidor implements Runnable {

    private final Buffer buffer;

    public Consumidor (Buffer buffer) {
        this.buffer = buffer;
    }
    public void run () {
        int i = 0;
        while ( i < 50 ) {
            Integer nro = buffer.consumirNumero();
            System.out.println(" Leido " + i + " " + nro);
            i++;
        }
    }
}
