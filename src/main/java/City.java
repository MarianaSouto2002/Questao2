public class City implements Veiculo{


    @Override
    public void ligar() {
        System.out.println("City ligando");
    }

    @Override
    public void rodar() {
        System.out.println("City rodando");
    }

    @Override
    public void parar() {
        System.out.println("City parando");
    }
}
