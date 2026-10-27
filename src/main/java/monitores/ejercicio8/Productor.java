package monitores.ejercicio8;


public class Productor extends Thread {

    private final Buffer buffer ;

    public Productor (Buffer buffer) {
        this.buffer = buffer;
    }
    public void run () {
        int i = 0;
        while (true) {
            buffer.producirNumero(i);
            i++;
        }
    }
}
