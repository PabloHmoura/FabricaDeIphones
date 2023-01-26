package br.com.ada.interfaces.modelos;

import br.com.ada.interfaces.repository.Iphone;

public class Iphone13Mini implements Iphone {
    @Override
    public Iphone exibirDetalhes() {
        System.out.println("\n\nIphone 13 mini:\n" +
                "SO: iOS 13\n" +
                "a tela: 4,7 polegadas - IPS LCD\n" +
                "Curador: Apple A13 Bionic\n" +
                "RAM: 3 GB\n" +
                "bateria: 2050 mAh\n\n");

        return null;
    }
}
