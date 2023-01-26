package br.com.ada.interfaces.modelos;

import br.com.ada.interfaces.repository.Iphone;

public class Iphone9 implements Iphone {
    @Override
    public Iphone exibirDetalhes() {
        System.out.println("\n\nIphone 9:\n" +
                "SO: iOS 13\n" +
                "tela: 4,7 polegadas - IPS LCD\n" +
                "Curador: Apple A13 Bionic\n" +
                "RAM: 3 GB\n" +
                "bateria: 2050 mAh");
        return null;
    }
}
