public class FabMarcaSingleton {
/* Garante que tenha uma unica instancia para as fábricas de carro*/

    public static FabricanteVeiculo Toyota;
    public static FabricanteVeiculo Honda;

    public static FabricanteVeiculo getInstance(String marca){
        if(marca.equals("Toyota")){
            if(Toyota == null)
                Toyota = new Toyota();
            return Toyota;
        }else{
            if (Honda == null)
                Honda = new Honda();
            return Honda;
        }
    }
}
