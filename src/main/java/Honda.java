public class Honda implements FabricanteVeiculo{

    @Override
    public Veiculo fabricaVeiculo(String modelo) {

        if(modelo.equals("City")){
            return new City();
        } else if (modelo.equals("Cicic")) {
            return new Civic();
        } else if (modelo.equals("Fit")) {
            return new Fit();
        }

        return null;
    }
}
