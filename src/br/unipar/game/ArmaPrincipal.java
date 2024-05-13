package br.unipar.game;

public class ArmaPrincipal extends Armas {

    private boolean pegar_rifle;
    private String inspecionar_rifle;
    private int capacidade_municao;
    private int municao_atual;
    private boolean modo_disparo;

    public boolean isPegar_rifle() {
        return pegar_rifle;
    }

    public void setPegar_rifle(boolean pegar_rifle) {
        this.pegar_rifle = pegar_rifle;
    }

    public String getInspecionar_rifle() {
        return inspecionar_rifle;
    }

    public void setInspecionar_rifle(String inspecionar_rifle) {
        this.inspecionar_rifle = inspecionar_rifle;
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

    public boolean isModo_disparo() {
        return modo_disparo;
    }

    public void setModo_disparo(boolean modo_disparo) {
        this.modo_disparo = modo_disparo;
    }
}
