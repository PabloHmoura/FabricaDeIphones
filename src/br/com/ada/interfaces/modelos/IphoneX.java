package br.com.ada.interfaces.modelos;

import br.com.ada.interfaces.repository.Iphone;

public class IphoneX implements Iphone {

    @Override
    public Iphone exibirDetalhes() {
        System.out.println("\n\nIphone X:\n" +
                "SO: iOS 15\n" +
                "tela: 5,4 polegadas - Retina OLED\n" +
                "Curador: A15 Biônico\n" +
                "RAM: 4GB\n" +
                "bateria: 2438 mAh");

        return null;
    }
}
