package br.com.ada.interfaces.teste;

import br.com.ada.interfaces.repository.Iphone;
import br.com.ada.interfaces.repository.IphoneFactory;
import br.com.ada.interfaces.repository.TypeIphoneEnum;

public class Main {
    public static void main(String[] args) {

        IphoneFactory fabrica = new IphoneFactory();
        fabrica.cadastrarIphone(TypeIphoneEnum.IPHONE_9);
        fabrica.cadastrarIphone(TypeIphoneEnum.IPHONE_X);
        fabrica.cadastrarIphone(TypeIphoneEnum.IPHONE_13_MINI);
    }
}