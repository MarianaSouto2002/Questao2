public class Etios implements Veiculo{


    @Override
    public void ligar() {
        System.out.println("Etios lignado");
    }

    @Override
    public void rodar() {
        System.out.println("Etios rodando");
    }

    @Override
    public void parar() {
        System.out.println("Etios parando");
    }
}
