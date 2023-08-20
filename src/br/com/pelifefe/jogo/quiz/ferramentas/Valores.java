package br.com.pelifefe.jogo.quiz.ferramentas;
public class Valores{
    private int facil;
    private int medio;
    private int dificil;
    private int metadeFacil;
    private int metadeMedio;
    private int metadeDificil;
    private static int meusPontos;

    public int adcionaMeusPontos(int valor){
        return meusPontos += valor;
    }
    public int retiraMeusPontos(int valor){
        return meusPontos -= valor;
    }
    public static int getMeusPontos() {
        return meusPontos;
    }

    public int getFacil() {
        return facil;
    }

    public void setFacil(int facil) {
        this.facil = facil;
    }

    public int getMedio() {
        return medio;
    }

    public void setMedio(int medio) {
        this.medio = medio;
    }

    public int getDificil() {
        return dificil;
    }

    public void setDificil(int dificil) {
        this.dificil = dificil;
    }

    public int getMetadeFacil() {
        return metadeFacil;
    }

    public void setMetadeFacil(int metadeFacil) {
        this.metadeFacil = metadeFacil;
    }

    public int getMetadeMedio() {
        return metadeMedio;
    }

    public void setMetadeMedio(int metadeMedio) {
        this.metadeMedio = metadeMedio;
    }

    public int getMetadeDificil() {
        return metadeDificil;
    }

    public void setMetadeDificil(int metadeDificil) {
        this.metadeDificil = metadeDificil;
    }

    public static void setMeusPontos(int meusPontos) {
        Valores.meusPontos = meusPontos;
    }
}
