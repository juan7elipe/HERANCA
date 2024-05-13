package br.unipar.game;

public class ArmaSecundaria extends Armas{

    private boolean pegar_pistol;
    private String inspecionar_pistol;
    private int capacidade_municao;
    private int municao_atual;
    private boolean modo_disparo_automatico;

    public boolean isPegar_pistol() {
        return pegar_pistol;
    }

    public void setPegar_pistol(boolean pegar_pistol) {
        this.pegar_pistol = pegar_pistol;
    }

    public String getInspecionar_pistol() {
        return inspecionar_pistol;
    }

    public void setInspecionar_pistol(String inspecionar_pistol) {
        this.inspecionar_pistol = inspecionar_pistol;
    }

    public int getCapacidade_municao() {
        return capacidade_municao;
    }

    public void setCapacidade_municao(int capacidade_municao) {
        this.capacidade_municao = capacidade_municao;
    }

    public int getMunicao_atual() {
        return municao_atual;
    }

    public void setMunicao_atual(int municao_atual) {
        this.municao_atual = municao_atual;
    }

    public boolean isModo_disparo_automatico() {
        return modo_disparo_automatico;
    }

    public void setModo_disparo_automatico(boolean modo_disparo_automatico) {
        this.modo_disparo_automatico = modo_disparo_automatico;
    }
}
