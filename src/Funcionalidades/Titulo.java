package Funcionalidades;

public class Titulo implements ReprodutorMusical {
    private String nome;

    @Override
    public void selecionarMusica(String titulo) {
        this.nome = titulo;
        System.out.println("Selecionando musica: " + titulo);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica: " + nome);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica: " + nome);
    }

    // Adicione getters e setters se necessário
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
