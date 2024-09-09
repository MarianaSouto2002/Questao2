public class Main {

    public static void main(String[] args) {

        /* fabrica uma única instancia de cada carro usando o Singleton*/
        FabricanteVeiculo Toyota = FabMarcaSingleton.getInstance("Toyota");
        FabricanteVeiculo Honda = FabMarcaSingleton.getInstance("Honda");

        /*construção dos carros das marcas */

        Veiculo City = Honda.fabricaVeiculo("City");
        Veiculo Civic = Honda.fabricaVeiculo("Civic");
        Veiculo Fit = Honda.fabricaVeiculo("Fit");

        Veiculo Corolla = Toyota.fabricaVeiculo("Corolla");
        Veiculo Etios = Toyota.fabricaVeiculo("Etios");
        Veiculo Hilux = Toyota.fabricaVeiculo("Hilux");

        City.ligar();
        City.rodar();
        City.parar();
        Civic.ligar();
        Civic.rodar();
        Civic.parar();
        Fit.ligar();
        Fit.rodar();
        Fit.parar();

        Corolla.ligar();
        Corolla.rodar();
        Corolla.parar();
        Etios.ligar();
        Etios.rodar();
        Etios.parar();
        Hilux.ligar();
        Hilux.rodar();
        Hilux.parar();

    }
}
