package Funcionalidades;

public class Telefone implements AparelhoTelefonico {
    private int numeroTelefone;

    @Override
    public void ligar(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        System.out.println("Ligando para o numero do celular: " + this.numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
