package br.com.ada.interfaces.repository;

import br.com.ada.interfaces.modelos.IphoneX;

public class IphoneFactory {

    public Iphone cadastrarIphone(TypeIphoneEnum iphone){
        Iphone tipoDeIphone = null;
        if (iphone == TypeIphoneEnum.IPHONE_X){
            tipoDeIphone = TypeIphoneEnum.IPHONE_X.retornarIphone();
        }
        else if(iphone == TypeIphoneEnum.IPHONE_9){
            tipoDeIphone = TypeIphoneEnum.IPHONE_9.retornarIphone();
        }
        else if (iphone == TypeIphoneEnum.IPHONE_13_MINI){
            tipoDeIphone = TypeIphoneEnum.IPHONE_13_MINI.retornarIphone();
        }
        return tipoDeIphone;
    }
}
