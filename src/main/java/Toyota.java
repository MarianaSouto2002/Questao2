public class Toyota implements FabricanteVeiculo{

    @Override
    public Veiculo fabricaVeiculo(String modelo) {

        if (modelo.equals("Corolla")){
            return new Corolla();
        } else if (modelo.equals("Hilux")) {
            return new Hilux();
        } else if (modelo.equals("Etios")) {
            return new Etios();
        }

        return null;
    }
}
