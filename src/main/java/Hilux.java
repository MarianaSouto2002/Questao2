public class Hilux implements Veiculo{


    @Override
    public void ligar() {
        System.out.println("Hilux lignado");
    }

    @Override
    public void rodar() {
        System.out.println("Hilux rodando");
    }

    @Override
    public void parar() {
        System.out.println("Hilux parando");
    }
}
