package br.unipar.game;

public class Armas {
    private String nome;
    private int dano_partes_baixas;
    private int dano_corpo;
    private int dano_cabeca;
    private String descricao;
    private String tipo;
    private double precisao;
    private double alcance;
    private int velocidade_disparo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano_partes_baixas() {
        return dano_partes_baixas;
    }

    public void setDano_partes_baixas(int dano_partes_baixas) {
        this.dano_partes_baixas = dano_partes_baixas;
    }

    public int getDano_corpo() {
        return dano_corpo;
    }

    public void setDano_corpo(int dano_corpo) {
        this.dano_corpo = dano_corpo;
    }

    public int getDano_cabeca() {
        return dano_cabeca;
    }

    public void setDano_cabeca(int dano_cabeca) {
        this.dano_cabeca = dano_cabeca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecisao() {
        return precisao;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public int getVelocidade_disparo() {
        return velocidade_disparo;
    }

    public void setVelocidade_disparo(int velocidade_disparo) {
        this.velocidade_disparo = velocidade_disparo;
    }
}
