package Iphone;

import Funcionalidades.*;

public class Usuario {
    public static void main(String[] args) {
        Multifuncional celularMultifuncional = new Multifuncional();
        
        AparelhoTelefonico aparelhoTelefonico = celularMultifuncional;
        ReprodutorMusical reprodutorMusical = celularMultifuncional;
        NavegadorInternet navegadorInternet = celularMultifuncional;

        // Usando funcionalidades de AparelhoTelefonico
        aparelhoTelefonico.ligar(206547862);
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        // Usando funcionalidades de ReprodutorMusical
        reprodutorMusical.selecionarMusica("America");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        // Usando funcionalidades de NavegadorInternet
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        navegadorInternet.exibirPagina("http://www.celular.com.br");
    }
}
