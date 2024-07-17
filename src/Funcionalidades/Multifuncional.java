package Funcionalidades;

public class Multifuncional implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void selecionarMusica(String titulo) {
        System.out.println("Selecionando musica do celular: " + titulo);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do navegador");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: " + url);
    }

    @Override
    public void ligar(int numeroTelefone) {
        System.out.println("Ligando para o numero do celular: " + numeroTelefone);
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
