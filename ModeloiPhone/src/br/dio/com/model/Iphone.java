package br.dio.com.model;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String modelo;
    private int anoFabricacao;

    public Iphone(String modelo, int anoFabricacao) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public void atender() {
        System.out.println("Atende ligação.");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abre correiro de voz.");

    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abre nova aba no navegador.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiza página.");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibição da página");

    }

    @Override
    public void pausar() {
        System.out.println("Pausa música.");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Seleciona a música " + musica);

    }

    @Override
    public void tocar() {
        System.out.println("Toca música.");

    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}
