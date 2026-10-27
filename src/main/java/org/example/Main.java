package org.example;

import monitores.ejercicio8.Buffer;
import monitores.ejercicio8.Consumidor;
import monitores.ejercicio8.Productor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Productor productor = new Productor(buffer);
        Consumidor c = new Consumidor (buffer);
        Thread ct = new Thread (c);
        productor.start();
        ct.start();

    }
}