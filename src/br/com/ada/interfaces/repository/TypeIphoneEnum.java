package br.com.ada.interfaces.repository;

import br.com.ada.interfaces.modelos.Iphone13Mini;
import br.com.ada.interfaces.modelos.Iphone9;
import br.com.ada.interfaces.modelos.IphoneX;

public enum TypeIphoneEnum {
    IPHONE_X{
        @Override
        public Iphone retornarIphone() {
            return new IphoneX().exibirDetalhes();
        }
    }
    ,
    IPHONE_9{
        @Override
        public Iphone retornarIphone() {
            return new Iphone9().exibirDetalhes();
        }
    },
    IPHONE_13_MINI{
        @Override
        public Iphone retornarIphone() {
            return new Iphone13Mini().exibirDetalhes();
        }
    };

    public abstract Iphone retornarIphone();
}
